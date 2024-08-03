package org.example.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class stream {
    public static void main(String[] args) {
        List<Integer> li = Arrays.asList(10,11,12,13,14,15);
        Stream<Integer> integerStream = li.stream().filter(num -> num % 2 == 0);
        integerStream.forEach(System.out::println);

//        integerStream.forEach(System.out::println);   will throw exception since stream already closed.
    }

}
