### Overloading vs Overriding


* Method Overloading:

Method overloading is a technique in which a class can have multiple methods with the
same name, but with different parameters. The compiler decides which method to call
based on the number and type of arguments passed to the method. In other words, the method
signature should be different in each case.


1. Method overloading is also known as compile-time polymorphism or static polymorphism,
as the compiler determines which method to call at compile-time based on the arguments 
passed to the method.

2. Method overloading allows developers to define multiple methods with the same name, 
but with different parameter lists, to perform similar operations.

3. The return type of the method does not matter for method overloading. Two methods can
have the same name and same parameters, but different return types.

4. Constructors can also be overloaded in Java, which allows developers to create objects in different ways.


```java
public class Calculator {
   public int add(int a, int b) {
      return a + b;
   }
   
   public int add(int a, int b, int c) {
      return a + b + c;
   }
}
```



* Method Overriding:

Method Overriding is a technique in which a subclass provides its own implementation
of a method that is already provided by its parent class. The method signature should
be the same in both cases.


1. Method overriding is also known as runtime polymorphism or dynamic polymorphism, as
the method to be called is determined at runtime based on the type of the object that
invokes the method.

2. Method overriding allows developers to provide their own implementation of a method 
that is already provided by the parent class.

3. The return type of the method in the subclass must be the same as the return type 
of the method in the superclass or a subtype of the return type of the method in
the superclass.

4. Access modifiers can be changed while overriding a method, but the access level of the
overridden method cannot be more restrictive than the access level of the overriding method.
For example, a public method in the superclass can be overridden with a protected or private
method in the subclass, but not with a package-private or private method.


```java
class Animal {
   public void sound() {
      System.out.println("Animal is making a sound");
   }
}

class Dog extends Animal {
   public void sound() {
      System.out.println("Woof woof");
   }
}

```