package org.example.pattern.strategy;

import java.util.List;

public class Driver {
    public static void main(String[] args) {
        CountStrategy htl = CountFactory.getStrategy("htl");
        List<Integer> counts = htl.count(15);
        System.out.println(counts);

        CountStrategy lth = CountFactory.getStrategy("lth");
        List<Integer> count = lth.count(15);
        System.out.println(count);
    }
}
