package org.example.classes.generic.wildcard;

import java.util.List;

public class PrintNum {
    public void display(List<? extends Number> l1, List<? extends Number> l2) {

    }

    public <T extends Number> void display1(List<T> l1, List<T> l2) {

    }

    public void display2(List<? super Integer> l1, List<? super Float> l2) {

    }

//    public <T super Float> void display1(List<T> l1, List<T> l2) {  : Not supported
//
//    }
}
