package jsonToObjectMapper;

import org.json.JSONObject;

import java.lang.reflect.Field;
import java.util.HashSet;
import java.util.Set;

public class JsonMapperImpl<T> implements JsonMapper<T> {

    @Override
    public T mapJsonStringToObject(String jsonString, Class clazz) throws IllegalAccessException,
            InstantiationException, NoSuchFieldException {
        if(jsonString==null) return null;
        if(isPrimitiveType(clazz)) return (T)getWrapperObject(jsonString, clazz);
        if(isStringType(clazz)) return (T)jsonString;
        System.out.println(clazz);
        T obj = (T) clazz.newInstance();

        JSONObject jsonObject = new JSONObject(jsonString);
        for(Object keyObj : jsonObject.keySet()) {
            String key = keyObj.toString();
            Object objectValue = jsonObject.get(key);
            Field field = clazz.getDeclaredField(key);
            Class classTypeOfField = field.getType();
            Object valueForKey = mapJsonStringToObject(objectValue.toString(), classTypeOfField);
            setObjectValue(obj, valueForKey, key);
        }
        return obj;
    }

    private static boolean isPrimitiveType(Class clazz) {
        Set<Class> wrapperTypes = getWrapperTypes();
        return wrapperTypes.contains(clazz);
    }
    private static boolean isStringType(Class clazz){
        return clazz.getName().equals(String.class.getName());
    }

    private static Set<Class> getWrapperTypes()
    {
        Set<Class> set = new HashSet<>();
        set.add(Boolean.class);
        set.add(Character.class);
        set.add(Byte.class);
        set.add(Short.class);
        set.add(Integer.class);
        set.add(Long.class);
        set.add(Float.class);
        set.add(Double.class);
        set.add(Void.class);
        return set;
    }

    private static Object getWrapperObject(String value, Class clazz) {
        if(Boolean.class == clazz || Boolean.TYPE == clazz) {
            return Boolean.parseBoolean(value);
        }
        if(Character.class == clazz ) {
            return Byte.parseByte(value);
        }
        if(Short.class == clazz) {
            return Short.parseShort(value);
        }
        if(Integer.class == clazz || Integer.TYPE == clazz) {
            return Integer.parseInt(value);
        }
        if(Long.class == clazz) {
            return Long.parseLong(value);
        }
        if(Float.class == clazz) {
            return Float.parseFloat(value);
        }
        if(Double.class == clazz) {
            return Double.parseDouble(value);
        }

        throw new IllegalArgumentException("Not a valid class type of wrapper");
    }

    void setObjectValue(Object objectForT, Object value, String fieldName) throws NoSuchFieldException,
            IllegalAccessException {
        Field field = objectForT.getClass().getDeclaredField(fieldName);
        field.setAccessible(true);
        field.set(objectForT, value);
    }

}
