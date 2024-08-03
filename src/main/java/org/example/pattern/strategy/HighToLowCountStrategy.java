package org.example.pattern.strategy;

import java.util.ArrayList;
import java.util.List;

public class HighToLowCountStrategy implements CountStrategy{

    @Override
    public List<Integer> count(Integer num) {
        List<Integer> nums = new ArrayList<>();
        for (Integer i = num; i >= 1; i--) {
            nums.add(i);
        }
        return nums;
    }
}
