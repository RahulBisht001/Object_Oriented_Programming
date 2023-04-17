### Garbage Collector


Garbage Collector is an automatic memory management system in Java that automatically 
frees up memory occupied by objects that are no longer in use by the program. The Java
Garbage Collector (GC) runs in the background and continuously monitors the memory 
usage of the application. If an object is no longer being used or referenced by the 
application, the Garbage Collector frees up the memory allocated to that object. This 
frees up memory for other objects to be allocated.


```java
public class GarbageCollectorExample {
    
    public static void main(String[] args) {
        // create object1
        Object object1 = new Object();
        // create object2 and assign object1 to it
        Object object2 = object1;
        // set object1 to null
        object1 = null;
        // call the garbage collector explicitly
        System.gc();
    }
}
```