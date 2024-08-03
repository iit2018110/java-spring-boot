package org.example.classes.generic.bound;

public class A<T extends Number> {
    public T fun(T t) {
        return t;
    }
}
