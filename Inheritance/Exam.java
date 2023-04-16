// package Inheritance;

abstract class A {
    void display() {
        System.out.println("Display version of Parent Class");
    }
}

public class Exam extends A {
    void display() {
        System.out.println("hello");
    }

    public static void main(String args[]) {
        Exam b = new Exam();
        b.display();
    }
}