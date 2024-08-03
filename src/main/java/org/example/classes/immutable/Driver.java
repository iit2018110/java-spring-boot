package org.example.classes.immutable;

import java.util.ArrayList;
import java.util.List;

public class Driver {
    public static void main(String[] args) {
        List<String> favSubjects = new ArrayList<>();
        favSubjects.add("Maths");
        favSubjects.add("Science");
        Student student = new Student("Vikash", favSubjects);
        favSubjects.add("General Knowledge");
        List<String> favSubjectList = student.getFavSubject();
        favSubjectList.add("Arts");
        System.out.println(student);

    }
}
