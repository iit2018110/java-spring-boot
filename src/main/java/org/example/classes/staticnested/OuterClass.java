package org.example.classes.staticnested;

import lombok.Data;

@Data
public class OuterClass {
    private String color;
    private String model;

    public static class NestedClass1 {
        private String name;
        private String address;

        public void show() {
            System.out.println("NestedClass1.print" + name + address);
        }
    }

    private static class NestedClass2 {
        private String name;
        private String address;

        public void show() {
            System.out.println("NestedClass2.print");
        }
    }

    public void display() {
        NestedClass2 nestedObj2 = new NestedClass2();
        nestedObj2.show();
    }

}
