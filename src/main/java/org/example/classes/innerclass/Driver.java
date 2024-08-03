package org.example.classes.innerclass;


public class Driver {
    public static void main(String[] args) {
        OuterClass outerObj = new OuterClass();
        OuterClass.InnerClass innerObj = outerObj.new InnerClass();
        innerObj.show();

        outerObj.display();
    }
}
