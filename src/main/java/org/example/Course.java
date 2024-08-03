package org.example;

public class Course {
    private String name;
    private Integer credits;

    public Course(String name, Integer credits) {
        this.name = name;
        this.credits = credits;
    }

    public String getName() {
        return name;
    }

    public Integer getCredits() {
        return credits;
    }
}
