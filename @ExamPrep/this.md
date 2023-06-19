## This Keyword

In Java, the `this` keyword is a reference to the current object within a non-static method or constructor.
It is used to refer to the instance variables and methods of the current object, differentiate between 
instance variables and local variables with the same name, and pass the current object as a parameter to 
other methods or constructors.

Here are some common uses of the `this` keyword:

1. Referencing instance variables and methods:

   Inside a non-static method or constructor, you can use `this` to refer to the current object's instance variables and invoke its methods. It is particularly useful when there is a naming conflict between instance variables and method parameters or local variables.

   Example:
   ```java
   public class MyClass {
       private int value;

       public void setValue(int value) {
           this.value = value; // 'this' is used to refer to the instance variable
       }
   }
   ```

2. Invoking another constructor:

   Within a constructor, `this` can be used to invoke another constructor of the same class. This is known as constructor chaining. It allows you to reuse code and initialize instance variables using different sets of parameters.

   Example:
   ```java
   public class MyClass {
       private int value;

       public MyClass() {
           this(0); // Invokes the constructor with a single int parameter
       }

       public MyClass(int value) {
           this.value = value;
       }
   }
   ```

3. Passing the current object as a parameter:

   `this` can be used to pass the current object as a parameter to other methods or constructors. It is often used when you want to pass the current object's reference to another method or create a new object with the same state as the current object.

   Example:
   ```java
   public class MyClass {
       private int value;

       public void doSomething() {
           OtherClass other = new OtherClass(this); // Passes the current object to the constructor of OtherClass
           // ...
       }
   }
   ```