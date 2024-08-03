package org.example.pattern.strategy;

import java.util.ArrayList;
import java.util.List;

public class LowToHighCountStrategy implements CountStrategy {
    @Override
    public List<Integer> count(Integer num) {
        List<Integer> nums = new ArrayList<>();
        for (Integer i = 1; i <= num; i++) {
            nums.add(i);
        }
        return nums;
    }
}
