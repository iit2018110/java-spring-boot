package org.example;

import lombok.Data;
import lombok.Getter;

import java.util.List;
import java.util.Random;

@Data
public class User {
    private Integer id;
    private String name;
    private List<Course> courses;
    private Integer luckyNumber = new Random().nextInt(150);
    private Integer age;

    public User() {}

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double getLuckyNumber() {
        return luckyNumber;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", luckyNumber=" + luckyNumber +
                ", age=" + age +
                '}';
    }
}
