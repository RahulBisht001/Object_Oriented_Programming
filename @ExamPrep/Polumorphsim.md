## Polymorphism :)
_______________

* Polymorphism :

is a fundamental concept in object-oriented programming that allows objects
of different classes to be treated as if they were objects of the same class.
There are two types of polymorphism in Java:

1. Compile Time Polymorphism.
2. Run Time Polymorphism


* Compile Time Polymorphism (Method Overloading)

Compile-time polymorphism is also known as method overloading. It occurs when
a class has multiple methods with the same name but different parameter lists.
The compiler chooses the appropriate method to call based on the number, type,
and order of the arguments passed.

```java
class Calculator {
    public int add(int x, int y) {
        return x + y;
    }

    public double add(double x, double y) {
        return x + y;
    }

    public int add(int x, int y, int z) {
        return x + y + z;
    }
}

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.add(2, 3)); // Output: 5
        System.out.println(calculator.add(2.0, 3.0)); // Output: 5.0
        System.out.println(calculator.add(2, 3, 4)); // Output: 9
    }
}

```

* Runtime Polymorphism (Method Overriding):

Runtime polymorphism is also known as method overriding. It occurs when a 
subclass provides its own implementation of a method that is already defined
in its superclass. The method in the subclass must have the same name, return
type, and parameter list as the method in the superclass.

```java
class Animal {
    public void makeSound() {
        System.out.println("Animal is making a sound");
    }
}

class Dog extends Animal {
    public void makeSound() {
        System.out.println("Dog is barking");
    }
}

class Cat extends Animal {
    public void makeSound() {
        System.out.println("Cat is meowing");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal animal1 = new Dog();
        Animal animal2 = new Cat();
        animal1.makeSound(); // Output: "Dog is barking"
        animal2.makeSound(); // Output: "Cat is meowing"
    }
}

```
#### Important Points

1. Polymorphism allows a single method name to be used for multiple methods,
making the code easier to read and maintain.

2. Method overloading is an example of compile-time polymorphism, while 
method overriding is an example of runtime polymorphism.

3. In method overriding, the method in the subclass must have the same name,
return type, and parameter list as the method in the superclass.

4. The compiler determines which method to call in method overloading,
while the JVM determines which method to call in method overriding.