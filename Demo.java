// interface in java
interface A {
    void show();
}

interface X {
    void abc();
}

// we can implement more than 1 class in an interface
class B implements A, X {
    public void show() {
        System.out.println("in show mehod");
    }

    public void abc() {
        System.out.println("in abc method");
    }

}

public class Demo {
    public static void main(String args[]) {
        // we can also use A obj = new B(); if we want only interface A
        B obj = new B();
        obj.show();
        obj.abc();
    }
}