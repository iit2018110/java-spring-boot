package org.example.pattern.strategy;

public class CountFactory {

    public static CountStrategy getStrategy(String strategy) {
        if (strategy.equals("htl")) {
            return new HighToLowCountStrategy();
        } else if (strategy.equals("lth")) {
            return new LowToHighCountStrategy();
        }
        return null;
    }
}
