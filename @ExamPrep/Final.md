### Final , Finally and Finalize Keywords

In Java, `final`, `finally`, and `finalize` are three distinct keywords that have 
different meanings and uses.


#### `final`

final is a keyword used to declare a variable, method, or class as unchangeable or immutable.
Once a variable is declared as final, its value cannot be changed. Similarly, when a method
or class is declared as final, they cannot be overridden or extended by any other class.

```java
final int a = 10; 
// declaring a variable 'a' as final
final class MyClass { 
   // declaring a class 'MyClass' as final
   // class code
}
```


#### `finally`

finally is a block of code that is associated with a try-catch block. It is executed 
regardless of whether an exception is thrown or not. This block is useful for releasing
any resources that were acquired during the execution of the try block.

```java
try {
   // code that may throw an exception
} catch(Exception e) {
   // exception handling code
} finally {
    /* code that will be executed regardless of whether an exception
      is thrown or not release any resources acquired during the 
      execution of the try block
    */
  System.out.println("I am inside finally Block")
}
```

#### `finalize`

finalize is a method that is called by the garbage collector when an object is no 
longer being used by the program. It is used to perform any final cleanup or releasing 
of resources associated with the object.

```java
public class MyClass {
   // class code
   
   protected void finalize() {
      // code to release any resources associated with the object
   }
}
```

* All Three in One

```java
public class Example {
    public static void main(String[] args) {
        final int a = 10; // declaring a variable 'a' as final
        System.out.println("The value of 'a' is: " + a);
        
        try {
            // code that may throw an exception
            int b = 0;
            int c = 10 / b;
            System.out.println("The result is: " + c);
        } catch(Exception e) {
            // exception handling code
            System.out.println("Exception caught: " + e.getMessage());
        } finally {
            // code that will be executed regardless of whether an exception is thrown or not
            System.out.println("This code is always executed.");
        }
        
        MyClass obj = new MyClass(); // creating an object of MyClass
        obj = null; // setting the reference to null to make the object eligible for garbage collection
        System.gc(); // requesting garbage collection
    }
}

final class MyClass {
    // class code
    
    protected void finalize() {
        // code to release any resources associated with the object
        System.out.println("Finalize method called.");
    }
}
```