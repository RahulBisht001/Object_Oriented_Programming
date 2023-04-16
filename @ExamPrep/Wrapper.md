### Wrapper Classes

Wrapper classes in Java are a set of classes that allow primitive data types to be
treated as objects. Each of the eight primitive data types in Java (byte, short, int,
long, float, double, char, and boolean) has a corresponding wrapper class that provides
additional functionality. The wrapper classes are part of the `java.lang` package and 
are used extensively in Java programming.


Here are some key points about wrapper classes in Java:

1. Wrapper classes provide methods to convert primitive data types to and from strings,
and to perform various operations on the data.

2. The wrapper classes are immutable, meaning that the values they represent cannot be
changed once they are created.

3. Wrapper classes are used extensively in collections and other classes that require
objects, as they allow primitive data types to be stored and manipulated as objects.

4. Autoboxing and unboxing are features of Java that automatically convert primitive data types to and from their corresponding wrapper classes, allowing them to be used interchangeably in code.

```java

Integer num1 = new Integer(10); // using constructor
Integer num2 = Integer.valueOf("20"); // using valueOf method

int sum = num1.intValue() + num2.intValue(); // using intValue method

System.out.println("Sum of " + num1 + " and " + num2 + " is " + sum);

```

* Autoboxing and unboxing allows us to write the above code in a more concise manner:

```java
Integer num1 = 10; // autoboxing
Integer num2 = Integer.valueOf("20"); // using valueOf method

int sum = num1 + num2; // unboxing and addition

System.out.println("Sum of " + num1 + " and " + num2 + " is " + sum);
```

#### Applications

1. Storing primitive data types in collections:

Collections in Java, such as ArrayList and HashMap, require objects to be stored.
By using wrapper classes, we can store primitive data types in these collections without
needing to manually convert them to objects.

2. Passing primitive data types as arguments to methods:

When a method requires an object as an argument, we can use wrapper classes to pass 
in primitive data types instead.

3. Formatting and parsing of strings:

Wrapper classes provide methods for converting primitive data types to and from strings.
This is useful when we need to format numbers as strings or parse strings as numbers.

4. Object-oriented programming: 

Wrapper classes allow us to treat primitive data types as objects, which is important in object-oriented programming. We can create classes and methods that operate on these objects,
making our code more modular and reusable.

5. Interoperability with legacy code:

Some legacy code may not be designed to work with primitive data types. Wrapper classes
can be used to bridge the gap between the legacy code and modern Java code that uses
primitive data types.

Overall, wrapper classes provide a lot of flexibility and functionality when working with primitive data types in Java.




