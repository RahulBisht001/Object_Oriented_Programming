## Super Keyword :)
________________

In Java, the super keyword is used to refer to the parent class and its members. 
Here are some common use cases of the super keyword:

* Accessing Parent Class Members:

 When a child class overrides a method or hides a variable of its
parent class, you can use the super keyword to refer to the parent 
class's version of that method or variable. This can be useful when 
you want to call the parent class's implementation of a method 
from within the child class.

* Invoking Parent Class Constructors:

  When you create an instance of a child class, the parent class's 
constructor is always called first. You can use the super keyword 
to call a specific constructor of the parent class. This is useful
when the parent class has multiple constructors, and you need to 
call a specific one with specific parameters.

``` java
class Animal {
    int age;

    public Animal(int age) {
        this.age = age;
    }
}

class Dog extends Animal {
    String breed;

    public Dog(int age, String breed) {
        super(age); // Call parent class's constructor
        this.breed = breed;
    }
}

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog(3, "Labrador");
        System.out.println(dog.age); // Output: 3
        System.out.println(dog.breed); // Output: "Labrador"
    }
}

```

* Calling Parent Class Methods: 

  You can use the super keyword to call any method of the parent class,
even if the child class does not override or hide it. This can be 
useful when you want to use the parent class's implementation of a
method from within the child class.

* Accessing Parent Class's Static Members: 

You can also use super keyword to access the static members of the 
parent class from a child class.


Overall, the super keyword is an essential tool for working with inheritance in Java, allowing you to easily access and use parent class members from within child classes.




