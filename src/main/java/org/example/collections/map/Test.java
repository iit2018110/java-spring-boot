package org.example.collections.map;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        Map<Integer, String> mp =  new HashMap<>();
//        Map<Integer, String> mp =  new LinkedHashMap<>();
//        Map<Integer, String> mp =  new TreeMap<>();
//        Map<Integer, String> mp = new TreeMap<>((k1,k2) -> k2-k1);
        mp.put(1, "A");
        mp.put(21,"B");
        mp.put(23, "C");
        mp.put(141, "D");
        mp.put(25, "E");
        mp.put(100, "F");

        for (Map.Entry<Integer, String> entry : mp.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }

}
