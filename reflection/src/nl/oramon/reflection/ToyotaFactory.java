package nl.oramon.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import nl.oramon.reflection.cars.Prius;

/**
 * This class builds Toyota cars
 */
public class ToyotaFactory {
	
	/**
	 * Builds any type of Toyota car. Uses a suitable constructor to instantiate the specified class, then calls 
	 * all public setXXX methods to assemble the parts.
	 * @param clazz reference type of the car to build, must have a suitable constructor
	 * @return a new car of type clazz
	 * @throws CarFactoryException wrapping any checked exception thrown during the car's assembly
	 */
	public Object build(Class<?> clazz) 
	{
		Object objectToBuild = null;
		try{
			objectToBuild = buildObject(clazz);
			callSetMethods(objectToBuild);
		}catch(Exception e){
			throw new CarFactoryException(e.getLocalizedMessage(), e.getCause());
		}
		
        return objectToBuild;
    }
	
	
	public Object callSetMethods(Object instance) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, InstantiationException
	{
		Method[] methods=instance.getClass().getDeclaredMethods();
		if(methods.length>0){
			for(Method method : methods){
				if(method.getName().startsWith("get")){
					
					Method setter=getSetter(methods,method);
					if(setter!=null){
						Class<?> resultType=method.getReturnType();
						Object value = buildObject(resultType);
						setter.invoke(instance,value);
					}
				}
			}
		}
		return instance;
	}
	
	public Method getSetter(Method[] methods,Method getter){
		
		String setter=getter.getName().replaceAll("get", "set");
		for(Method method : methods){
			if(method.getName().equals(setter))
				return method;
		}
		return null;
	}
	
	private Object buildObject(Class<?> clazz) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Object objectToBuild = null;
		Constructor<?>[] constructors = clazz.getConstructors();
		Constructor<?> firstConstructor = constructors[0];
		Class<?>[] typeParams = firstConstructor.getParameterTypes();
		if(typeParams.length == 0){
			objectToBuild = firstConstructor.newInstance();
		}else {
			List<Object> params = new ArrayList<Object>();
			for (Class<?> paramClass : typeParams){
				params.add(buildObject(paramClass));
			}
			objectToBuild = firstConstructor.newInstance(params.toArray());
		}
		return objectToBuild;
	}
}
