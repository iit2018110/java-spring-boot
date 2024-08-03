package org.example.classes.enums;

import lombok.Getter;

@Getter
public enum Weekday implements I1 {
    SUNDAY(100, "Fun Day.") {
        @Override
        public void sayDay() {
            System.out.println("It's Sunday!!");
        }

        @Override
        public void sayAbstractDay() {
            System.out.println("Abstract Sunday");
        }
    },
    MONDAY(101, "Fun Day.") {
        @Override
        public void sayDay() {
            System.out.println("It's Monday");
        }

        @Override
        public void sayAbstractDay() {
            System.out.println("Abstract Monday");
        }
    },
    TUESDAY(102, "Fun Day.") {
        @Override
        public void sayAbstractDay() {
            System.out.println("Abstract Tuesday");
        }
    },
    WEDNESDAY(103, "Fun Day.") {
        @Override
        public void sayAbstractDay() {
            System.out.println("Abstract Wednesday");
        }
    },
    THURSDAY(104, "Fun Day.") {
        @Override
        public void sayAbstractDay() {
            System.out.println("Abstract Thursday");
        }
    },
    FRIDAY(105, "Fun Day.") {
        @Override
        public void sayAbstractDay() {
            System.out.println("Abstract Friday");
        }

        @Override
        public void fun() {
            System.out.println("Fun Friday!!");
        }
    },
    SATURDAY(106, "Fun Day.") {
        @Override
        public void sayAbstractDay() {
            System.out.println("Abstract Saturday");
        }
    };

    private final int val;
    private final String comment;

    Weekday(int val, String comment) {
        this.val = val;
        this.comment = comment;
    }

    public void sayDay() {
        System.out.println("Default Day!!");
    }

    @Override
    public void fun() {
        System.out.println("Fun!!");
    }

    public abstract void sayAbstractDay();

    public static Weekday getWeekdayFromVal(int val) {
        for (Weekday weekday : Weekday.values()) {
            if (weekday.val == val) {
                return weekday;
            }
        }
        return null;
    }
}