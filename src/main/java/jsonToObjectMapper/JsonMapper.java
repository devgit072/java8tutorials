package jsonToObjectMapper;

public interface JsonMapper<T> {

    T mapJsonStringToObject(String jsonString, Class clazz) throws IllegalAccessException, InstantiationException,
            NoSuchFieldException;
}
