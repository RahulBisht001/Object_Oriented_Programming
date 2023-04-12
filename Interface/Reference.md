## Talk about Interfaces
________________________

An interface is a fully abstract class. It includes a group 
of abstract methods (methods without a body).


```java
interface Language {
  
  int alphabet = 26;
  public void getType();
  public void getVersion();

}
```
Here,

`Language` is an interface.
It includes abstract methods: `getType()` and `getVersion()`.



### Implementation of An Interface

Like abstract classes we can't create objects of interface the
variables inside the interfaces are static and final by default

To use an interface, other classes must implement it. We use the
`implements` keyword to implement an interface.





* Differences 

1. Java  Abstract class can have any access modifiers but the 
Interfaces are public by default.
2. 


### Advantages of Interface in Java

Interfaces are also used to achieve multiple inheritance in Java.

```java
interface Line {
    // Code
}

interface Polygon { 
    // Code
}

class Rectangle implements Line, Polygon {
    //code
}

```
 
