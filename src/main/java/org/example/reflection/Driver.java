package org.example.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Driver {
    public static void main(String[] args) throws NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
        Class studentClass = Student.class;

        System.out.println(Arrays.toString(studentClass.getDeclaredConstructors()));
        for (Constructor constructor : studentClass.getDeclaredConstructors()) {
            constructor.setAccessible(true);
            Student studentObject = (Student) constructor.newInstance();
            studentObject.showIdentity();
        }


        Method[] methods = studentClass.getDeclaredMethods();
        System.out.println(Arrays.toString(methods));

        for (Method method : methods) {
            System.out.println(method.getName());
        }

        Field[] studentFields = studentClass.getDeclaredFields();
        System.out.println(Arrays.toString(studentFields));

        for (Field field : studentFields) {
            field.setAccessible(true);
            System.out.println(field);
        }


    }
}
