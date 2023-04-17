### Abstraction Vs Interface

In Java, both abstract classes and interfaces are used to define common behavior
that can be inherited by other classes. However, there are some key 
differences between the two.

An abstract class is a class that cannot be instantiated directly, but must be
subclassed to be used. It may contain abstract methods, which are methods that
do not have a body and are intended to be overridden by subclasses. Abstract classes
can also have non-abstract methods, which can be inherited by subclasses or 
overridden if necessary.


* Abstraction

```java
public abstract class Animal {
   public abstract void makeSound();
   public void eat() {
      System.out.println("The animal is eating");
   }
}
```

An interface, on the other hand, is a contract that specifies a set of methods that
a class must implement. It does not contain any implementation code, only method 
signatures. Implementing an interface means that a class agrees to provide an implementation
for all of the methods in the interface.

* Interface

```java
public interface Vehicle {
   void start();
   void stop();
}

public class Car implements Vehicle {
   public void start() {
      // implementation code
   }
   public void stop() {
      // implementation code
   }
}
```