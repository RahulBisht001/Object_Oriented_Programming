### Encapsulation Vs Abstraction

Abstraction and encapsulation are two important concepts in Java programming that 
help developers write modular and maintainable code. While they are related, they are
different concepts with distinct purposes.


Abstraction is the process of hiding implementation details and focusing on the 
essential features of an object. In Java, abstraction is achieved through the use 
of abstract classes and interfaces. Abstract classes define a template for a class 
and may contain both abstract and concrete methods. Abstract methods are declared 
but not implemented, and must be implemented by any concrete subclass of the abstract 
class. Interfaces are similar to abstract classes in that they define a set of methods 
that must be implemented by any class that implements the interface, but they cannot 
contain any implementation code.


Encapsulation is the process of hiding the internal details of an object and protecting 
its state from external access. In Java, encapsulation is achieved through the use of 
access modifiers such as private, protected, and public. Private members are only accessible 
within the class in which they are defined, while protected members are accessible within 
the class and its subclasses. Public members are accessible from any class.


Here is an example that illustrates the difference between abstraction and 
encapsulation in Java:


```java
public abstract class Shape {
    protected int x;
    protected int y;

    public Shape(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public abstract void draw();
}

public class Circle extends Shape {
    private int radius;

    public Circle(int x, int y, int radius) {
        super(x, y);
        this.radius = radius;
    }

    public void draw() {
        System.out.println("Drawing a circle with radius " + radius);
    }
}
```