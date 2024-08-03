package org.example.reflection;

public class Student {
    private String name;
    private Integer age;

    private Student() {}

    public void showIdentity() {
        System.out.println(name + " -> " + age);
    }
}
