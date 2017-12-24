package jsonToObjectMapper;

import com.google.gson.Gson;

public class JsonMapperDemo {

    public static void main(String[] args) throws IllegalAccessException, NoSuchFieldException, InstantiationException {
        Person personManager = new Person(2334, "Male", "Indian");
        Person personEmployee = new Person(233434, "female", "Pakisatni");
        Employee manager = new Employee();
        manager.setAge(12);manager.setId(23);manager.setName("Manpreet");manager.setManager(null);
        manager.setPerson(personManager);
        Employee employee = new Employee(12, "Devraj", 27, manager, personEmployee);
        Gson gson = new Gson();
        String jsonString = gson.toJson(employee);
        JsonMapper<Employee> jsonMapper = new JsonMapperImpl<>();
        Employee obj = jsonMapper.mapJsonStringToObject(jsonString, Employee.class);
        System.out.println(obj.toString());
        System.out.println(obj.getAge());
        System.out.println(obj.getName());
    }
}
