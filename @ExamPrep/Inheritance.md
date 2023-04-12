## Inheritance :)
_________________

### Inheritance:
is an important concept in object-oriented programming that allows
a class to inherit properties and methods from another class.
In Java, there are several types of inheritance.


we need to use `extends` keyword for using inheritance.

* Single Inheritance:

Single inheritance is a type of inheritance in which a subclass extends only 
one superclass. It is the most commonly used type of inheritance.

```java
class Animal {
    public void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal {
    public void bark() {
        System.out.println("Dog is barking");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat(); // Output: "Animal is eating"
        dog.bark(); // Output: "Dog is barking"
    }
}
```

* Multilevel Inheritance:

Multilevel inheritance is a type of inheritance in which a subclass inherits
from a superclass, and that superclass also inherits from another superclass.
In other words, it is a chain of inheritance where a subclass inherits from 
a superclass, which in turn inherits from another superclass.

```java
class Animal {
    public void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal {
    public void bark() {
        System.out.println("Dog is barking");
    }
}

class Labrador extends Dog {
    public void swim() {
        System.out.println("Labrador is swimming");
    }
}

public class Main {
    public static void main(String[] args) {
        Labrador labrador = new Labrador();
        labrador.eat(); // Output: "Animal is eating"
        labrador.bark(); // Output: "Dog is barking"
        labrador.swim(); // Output: "Labrador is swimming"
    }
}

```

* Hierarchical Inheritance:

Hierarchical inheritance is a type of inheritance in which multiple 
subclasses inherit from a single superclass.

```java
class Animal {
    public void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal {
    public void bark() {
        System.out.println("Dog is barking");
    }
}

class Cat extends Animal {
    public void meow() {
        System.out.println("Cat is meowing");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat(); // Output: "Animal is eating"
        dog.bark(); // Output: "Dog is barking"

        Cat cat = new Cat();
        cat.eat(); // Output: "Animal is eating"
        cat.meow(); // Output: "Cat is meowing"
    }
}

```

* Multiple Inheritance:

Multiple inheritance is a type of inheritance in which a subclass inherits 
from two or more superclasses. However, Java does not support multiple inheritance
of classes, only multiple inheritance of interfaces.

```java
interface Animal {
    void eat();
}

interface Pet {
    void play();
}

class Dog implements Animal, Pet {
    public void eat() {
        System.out.println("Dog is eating");
    }

    public void play() {
        System.out.println("Dog is playing");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat(); // Output: "Dog is eating"
        dog.play(); // Output: "Dog is playing"
    }
}

```


#### Important Points:

1. Inheritance allows classes to be organized in a hierarchical manner,
with more general classes at the top and more specific classes at the bottom.

2. Subclasses inherit all the non-private members (fields, methods, and
nested classes) of their parent