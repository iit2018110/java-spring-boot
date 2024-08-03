package org.example.classes.generic.classes;

public class Driver {
    public static void main(String[] args) {
        NonGenericPrint print1 = new NonGenericPrint();
        print1.setValue(5);
        if ((int) print1.getValue() == 5) {
            System.out.println(print1.getValue());
        }


        Print<Integer> print2 = new Print<>();
        print2.setValue(17);
        if (print2.getValue() == 17) {
            System.out.println(print2.getValue());
        }

        NonGenericColorPrint print3 = new NonGenericColorPrint();
        print3.setValue("hi");
        System.out.println(print3.getValue());

        ColorPrint<String> print4 = new ColorPrint<>();
        print4.setValue("vikash");
        System.out.println(print4.getValue());
    }
}
