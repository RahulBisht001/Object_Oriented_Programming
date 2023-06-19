## Method Overloading vs Constructor Overloading


Method overloading and constructor overloading are two concepts in Java that allow multiple 
methods or constructors to have the same name but with different parameters. However, there are 
some key differences between them:

1. Purpose:
   - Method Overloading: Method overloading is used to define multiple methods within a class with the same name but different parameter lists. It allows you to provide different ways to invoke a method based on different argument types or a different number of arguments.
   - Constructor Overloading: Constructor overloading is used to define multiple constructors within a class with the same name but different parameter lists. It allows you to create objects of a class in different ways by providing different sets of arguments during object creation.

2. Usage:
   - Method Overloading: Method overloading is primarily used to enhance code readability and provide convenience to the developers. It allows you to define variations of a method that perform similar tasks but with different input types or different numbers of parameters.
   - Constructor Overloading: Constructor overloading is used to initialize objects in different ways depending on the provided arguments. It allows you to create objects with different initial states or configurations.

3. Invocation:
   - Method Overloading: Method overloading is invoked by calling the method name with appropriate arguments, and the compiler determines the appropriate method to invoke based on the argument types and number of parameters.
   - Constructor Overloading: Constructor overloading is invoked when creating an object using the `new` keyword, and the appropriate constructor is automatically selected based on the provided arguments.

4. Inheritance:
   - Method Overloading: Method overloading can be done in the same class or in a subclass. It is not overridden by subclass methods; instead, it is a separate method with a different signature.
   - Constructor Overloading: Constructor overloading can only be done within the same class and is not inherited by subclasses. Each subclass needs to define its own constructors separately.

5. Return Type:
   - Method Overloading: Method overloading can have the same name but different return types. The return type alone is not sufficient for method resolution; it is determined based on the method's parameter list.
   - Constructor Overloading: Constructors do not have a return type. They are called implicitly during object creation and are responsible for initializing the object.

In summary, method overloading is used to define multiple methods with the same name but different parameter lists, providing flexibility and convenience in method invocation. Constructor overloading is used to define multiple constructors with the same name but different parameter lists to create objects in different ways.