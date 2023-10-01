# Java Interface

## Interfaces

- you can also achieve abstraction in Java with interfaces
- an `interface` is a completely `abstract class` that is used to group related methods with empty bodies

```java
// interface
interface Animal {
  public void animalSound(); // interface method (does not have a body)
  public void run(); // interface method (does not have a body)
}
```

- to access interface methods, they must be "implemented" by another class with `implements`

```java
// Interface
interface Animal {
  public void animalSound(); // interface method (does not have a body)
  public void sleep(); // interface method (does not have a body)
}

// Pig "implements" the Animal interface
class Pig implements Animal {
  public void animalSound() {
    // The body of animalSound() is provided here
    System.out.println("The pig says: wee wee");
  }
  public void sleep() {
    // The body of sleep() is provided here
    System.out.println("Zzz");
  }
}

class Main {
  public static void main(String[] args) {
    Pig myPig = new Pig();  // Create a Pig object
    myPig.animalSound();
    myPig.sleep();
  }
}
```

- like abstract classes, interfaces cannot be used to create objects
- interfaces cannot contain constructors
- interface methods do not have a body, the body is provided by the implementing class
- on implementation of an interface, you must override all of its methods
- by default, interface methods are `abstract` and `public`
- by default, interface attributes are `public`, `static` and `final`

Why and When to use Interfaces?

- to achieve security, hide certain details and only show important details of an object
- Java doesn't support `multiple inheritance`, a class can only inherit from one superclass
- But `multiple inheritance` can be achieved with interfaces, because a class can implement multiple interfaces 
  (separate them with a comma)

## Multiple Interfaces

- to implement multiple interfaces, separate with a comma:

```java
interface FirstInterface {
  public void myMethod(); // interface method
}

interface SecondInterface {
  public void myOtherMethod(); // interface method
}

class DemoClass implements FirstInterface, SecondInterface {
  public void myMethod() {
    System.out.println("Some text..");
  }
  public void myOtherMethod() {
    System.out.println("Some other text...");
  }
}

class Main {
  public static void main(String[] args) {
    DemoClass myObj = new DemoClass();
    myObj.myMethod();
    myObj.myOtherMethod();
  }
}
```