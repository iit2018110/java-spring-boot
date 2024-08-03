package org.example.classes.enums;

import java.util.Arrays;

public class Driver {
    public static void main(String[] args) {
        System.out.println(Weekday.SUNDAY.name());
        System.out.println(Weekday.MONDAY.ordinal());
        System.out.println(Arrays.toString(Weekday.values()));

        for (Weekday day : Weekday.values()) {
            System.out.println(day.ordinal() + " -> " + day.name() + " -> " + day.getVal()
                    + " -> " + day.getComment());
        }

        Weekday weekday = Weekday.getWeekdayFromVal(105);
        System.out.println(weekday);

        Weekday.MONDAY.sayDay();
        Weekday.FRIDAY.sayDay();
        Weekday.WEDNESDAY.sayAbstractDay();


        Weekday.MONDAY.fun();
        Weekday.FRIDAY.fun();
    }
}
