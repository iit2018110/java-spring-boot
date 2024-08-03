package org.example.classes.innerclass;

public class OuterClass {
    private String color;
    private String model;

    public class InnerClass {
        private String name;
        private String address;

        public void show() {
            System.out.println("InnerClass.print" + color + model + name + address);
        }
    }

    private class InnerClass1 extends InnerClass {
        private String name;
    }

    public void display() {
        class LocalClass {
            private String name;
            private String address;

            public void show() {
                System.out.println("LocalClass.print" + color + model + name + address);
            }
        }

        LocalClass localObj = new LocalClass();
        localObj.show();
    }
}
