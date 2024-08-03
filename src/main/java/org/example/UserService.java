package org.example;

import org.example.pattern.builder.Employee;
import org.example.pattern.builder.Student;
import org.example.pattern.singleton.SingletonEmployeeService;
import org.example.pattern.singleton.SingletonStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class UserService implements IUserService, IGreeting {
    private final ApplicationContext applicationContext;

    @Autowired
    public UserService(ApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
        System.out.println("User service initializing");
    }

    @Override
    public User findUsers(String userId) {
//        Student student = Student.Builder().name("vik").roll(15).build();
        //        applicationContext.getBean("bean1");
        Student student = Student.Builder.getInstance().name("vik").roll(15).build();
        Student student1 = Student.builder().name("sonu").build();
        System.out.println(student1);
        System.out.println(student);
        Map<String, Integer> mp = new HashMap<>();
        Environment environment = applicationContext.getEnvironment();
        System.out.println("environment = " + environment);
        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        System.out.println(Arrays.toString(beanDefinitionNames));
        User user = new User("Sanjana");
        user.setAge(19);

        Employee employee = Employee.Builder.getInstance().name("vikash").salary(10000008).build();
        System.out.println(employee);

        SingletonEmployeeService employeeService1 = SingletonEmployeeService.getInstance();
        SingletonEmployeeService employeeService2 = SingletonEmployeeService.getInstance();
        SingletonEmployeeService employeeService3 = SingletonEmployeeService.getInstance();

        System.out.println(employeeService1.hashCode());
        System.out.println(employeeService2.hashCode());
        System.out.println(employeeService3.hashCode());

        SingletonStudentService studentService1 = SingletonStudentService.getInstance();
        SingletonStudentService studentService2 = SingletonStudentService.getInstance();
        SingletonStudentService studentService3 = SingletonStudentService.getInstance();

        System.out.println(studentService1.hashCode());
        System.out.println(studentService2.hashCode());
        System.out.println(studentService3.hashCode());

//        List<String> stringList = List.of("Vikash", "Sanjana", "Sonu", "Riya");
        List<String> stringList = new ArrayList<>();
        stringList.add("vikash");
        stringList.add("sonu");
        stringList.forEach(s -> {

        });

        return user;
    }

    @Override
    public String sayHi() {
        return "hello";
    }
}
