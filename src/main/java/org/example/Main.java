package org.example;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.util.CollectionUtils;

import java.util.*;
import java.util.stream.Collectors;


@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
        User u1 = new User("v1");
        User u2 = new User("v2");
        User u3 = new User("v3");
        User u4 = new User("v4");
        User u5 = new User("v5");
        List<User> userList = Arrays.asList(u1, u2, u3, u4, u5);
        CollectionUtils.isEmpty(userList);
        List<String> userNames = userList.stream()
                .filter(user -> user.getLuckyNumber() > 50)
                .map(User::getName)
                .collect(Collectors.toList());
        System.out.println(userNames);
        userList.forEach(Main::func);
        userList.forEach(System.out::println);
        Collections.emptyList();
        int a = 10;
        a = a + 20;
        increment(a);
        System.out.println("a = " + a);
        User user = new User("vikash");
        user.equals(new User("sonu"));
        user.setAge(10);
        changeAge(user);
        System.out.println(user);


        List<Integer> integerList = new ArrayList<>();
        integerList.add(15);
        integerList.add(20);
        integerList.add(25);
        Iterator<Integer> iterator = integerList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    private static void changeAge(User user) {
        user.setAge(20);
    }

    public static void increment(Integer a) {
        a = a + 5;
    }

    static void func(User user) {
        System.out.println(user);
    }

    Map<String, Integer> mp = new HashMap<>();
}