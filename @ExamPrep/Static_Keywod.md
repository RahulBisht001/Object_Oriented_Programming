## Static Keyword :)
____________________

In Java, the `static` keyword is used to declare a member variable,
method, or block that belongs to the class itself, rather than to any
specific instance of the class.



1. Static variables:

 A static variable is a variable that belongs to the class itself, rather than
 to any specific instance of the class. This means that all instances of the class
 share the same value for the static variable. Static variables are accessed using
 the class name, followed by the variable name.

2. Static methods: 

A static method is a method that belongs to the class itself, rather than to 
any specific instance of the class. This means that a static method can be
called without creating an object of the class. Static methods are accessed
 using the class name, followed by the method name.

3. Static blocks: A static block is a block of code that is executed only once
 when the class is loaded into memory. This is useful for initializing static variables
 or performing other one-time setup tasks. Static blocks are typically used to
 initialize static variables.



Here are some additional points to keep in mind when working with the static keyword:

* Static members are shared across all instances of a class. This means that if a
 static variable is modified in one instance of the class, the change will be visible
  to all other instances of the class.

* Static members can be accessed without creating an object of the class. This can be
 useful for utility methods or constants that are used throughout the program.

* The this keyword cannot be used in a static context, since there is no specific 
instance of the class to refer to.

* Static members are loaded into memory when the class is loaded, which can have implications
 for performance and memory usage. It's important to use static members judiciously and only
  when they are truly necessary.
  

```java
public class StaticDemo {
  
    // Static variable
    static int count = 0;
  
    // Static block
    static {
        System.out.println("Static block called.");
    }
  
    // Static method
    static void increment() {
        count++;
    }
  
    public static void main(String[] args) {
        // Accessing static variable without object
        System.out.println("Initial count: " + StaticDemo.count);
        
        // Calling static method
        StaticDemo.increment();
        StaticDemo.increment();
        
        // Accessing static variable after method calls
        System.out.println("Final count: " + StaticDemo.count);
    }
}

```
