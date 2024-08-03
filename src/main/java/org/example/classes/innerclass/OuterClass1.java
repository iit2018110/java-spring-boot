package org.example.classes.innerclass;

public class OuterClass1 extends OuterClass.InnerClass {

    OuterClass1() {
        new OuterClass().super();
    }

    public static void main(String[] args) {
        OuterClass outerObj = new OuterClass();
        OuterClass.InnerClass innerObj = outerObj.new InnerClass();
        innerObj.show();

        outerObj.display();
    }
}
