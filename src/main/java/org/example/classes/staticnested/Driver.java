package org.example.classes.staticnested;

public class Driver {
    public static void main(String[] args) {
        OuterClass.NestedClass1 nestedObj1 = new OuterClass.NestedClass1();
        nestedObj1.show();

        OuterClass outerObj = new OuterClass();
        outerObj.display();
    }
}
