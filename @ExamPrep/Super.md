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

```java

class Animal {
    String sound = "Animal sound";

    public void makeSound() {
        System.out.println(sound);
    }
}

class Dog extends Animal {
    String sound = "Bark";

    @Override
    public void makeSound() {
        super.makeSound(); // Call parent class's makeSound() method
        System.out.println(sound);
    }
}

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.makeSound(); // Output: "Animal sound" "Bark"
    }
}

```

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

```java
class Animal {
    public void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal {

    public void eat() {
        super.eat(); // Call parent class's eat() method
        System.out.println("Dog is eating");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat(); // Output: "Animal is eating" "Dog is eating"
    }
}

```

* Accessing Parent Class's Static Members: 

You can also use super keyword to access the static members of the 
parent class from a child class.

```java
class Animal {
    static String species = "Mammal";
}

class Dog extends Animal {
    static String breed = "Labrador";
}

public class Main {
    public static void main(String[] args) {
        System.out.println(Dog.species);
        // Output: "Mammal"
    }
}

```


Overall, the super keyword is an essential tool for working with inheritance in Java, allowing you to easily access and use parent class members from within child classes.




