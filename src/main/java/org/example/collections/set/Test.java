package org.example.collections.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Test {
    public static void main(String[] args) {
        Set<Integer> s = new HashSet<>();
//        Set<Integer> s = new LinkedHashSet<>();
//        Set<Integer> s = new TreeSet<>();
        s.add(10);
        s.add(15);
        s.add(13);
        s.add(11);
        s.add(20);

        s.forEach(System.out::println);
    }

}
