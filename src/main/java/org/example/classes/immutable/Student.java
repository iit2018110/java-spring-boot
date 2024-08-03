package org.example.classes.immutable;

import java.util.ArrayList;
import java.util.List;

public final class Student {
    private final String name;
    private final List<String> favSubject;

    public Student(String name, List<String> favSubject) {
        this.name = name;
        this.favSubject = new ArrayList<>(favSubject);
    }

    public String getName() {
        return name;
    }

    public List<String> getFavSubject() {
        return new ArrayList<>(favSubject);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", favSubject=" + favSubject +
                '}';
    }
}
