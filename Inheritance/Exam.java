// package Inheritance;

abstract class A {
    A() {
        System.out.println("I am Inside A");
    }
    void display() {
        System.out.println("Display version of Parent Class");
    }
}

public class Exam extends A {
    Exam() {
        super();
        System.out.println("I am Inside Exam");
    }
    void display() {
        System.out.println("Hello");
    }

    public static void main(String args[]) {
        Exam b = new Exam();
        b.display();
    }
}