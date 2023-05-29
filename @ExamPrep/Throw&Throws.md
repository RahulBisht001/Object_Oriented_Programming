### Throws & Throws keyword
___________________________


In Java, `throw` and `throws` are two different keywords used in exception handling.

1. `throw` keyword:
The `throw` keyword is used to explicitly throw an exception within a method or 
block of code. It is followed by an instance of an exception class or a subclass
of `Throwable`. This is useful when you want to raise an exception in your code 
to indicate that an error or exceptional condition has occurred.

Example that demonstrates the usage of the `throw` keyword:

```java
public class Example {
    public static void main(String[] args) {
        int age = -1;
        try {
            if (age < 0) {
                throw new IllegalArgumentException("Age cannot be negative");
            }
            System.out.println("Age: " + age);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
```

In the above code, the `throw` keyword is used to explicitly throw an 
`IllegalArgumentException` if the `age` variable is negative. This will 
result in the execution flow being transferred to the catch block, where 
the error message will be printed.


2. `throws` keyword:
The `throws` keyword is used in method signatures to indicate that a particular
method may throw one or more types of exceptions. It specifies that the responsibility
of handling the exception is delegated to the caller of the method. The caller can 
then choose to handle the exception using a try-catch block or propagate it further 
up the call stack.

Example that demonstrates the usage of the `throws` keyword:

```java
public class Example {
    public static void main(String[] args) {
        try {
            validateAge(-1);
            System.out.println("Valid age");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void validateAge(int age) throws IllegalArgumentException {
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative");
        }
    }
}
```


In the above code, the `validateAge` method is declared with the `throws` keyword,
 indicating that it may throw an `IllegalArgumentException`. The caller of the method,
  in this case, the `main` method, needs to handle the exception or propagate it further.

To summarize, the `throw` keyword is used to throw an exception explicitly within
a method or block of code, while the `throws` keyword is used in a method signature
to indicate that the method may throw certain types of exceptions, delegating 
the responsibility of handling them to the caller.



## My Own code
______________



```java
public class Throws {

    // this  NegativeException is a custom error by extending the exception class 
    // overriding the methods in exception class
    public static double area(int r) throws NegativeException {

        if (r < 0) {
            throw new NegativeException();
        }
        double res = Math.PI * r * r;
        return res;
    }

    public static int divide(int a, int b) throws ArithmeticException {

        int ans = a / b;
        return ans;
    }

    public static void main(String[] args) {

        double res = 0;
        try {
            // c = divide(6, 0);
            res = area(-1);
            System.out.print("Result is:" + res);
        } catch (Exception err) {
            System.out.println(err);
        }

    }
}

class NegativeException extends Exception {
    @Override
    public String toString() {
        return "The radius can't be negative";
    }

    @Override
    public String getMessage() {
        return "Message from override getMessage()";
    }
}
```