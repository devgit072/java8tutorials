package jsonToObjectMapper;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@ToString
@NoArgsConstructor
public class Employee {
   private Integer id;
   private String name;
   private Integer age;
   Employee manager;
   Person person;
   //List<Employee> colleagues;
}
