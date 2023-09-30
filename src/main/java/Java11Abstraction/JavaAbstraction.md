# Java Abstraction

## Abstract Classes and Methods

- `abstraction`: the process of hiding certain details and only showing essential information to the user
- `abstraction`: can be achieved with either `abstract classes` or `interfaces`
- `abstract` is a non-access modifier, used for classes and methods:
  - `abstract class`: a restricted class that cannot be used to create objects, can only be accessed through an 
    inheriting subclass
  - `abstract method`: can only be used in an abstract class, does not have a body

An abstract class can have both abstract and regular methods:

```java
abstract class Animal {
  public abstract void animalSound();
  public void sleep() {
    System.out.println("Zzz");
  }
}
```

It is not possible to create an object of the above class:

```java
Animal myObj = new Animal(); // will generate an error
```

To access tha abstract class, it must be inherited from another class

```java
// Abstract class
abstract class Animal {
  // Abstract method (does not have a body)
  public abstract void animalSound();
  // Regular method
  public void sleep() {
    System.out.println("Zzz");
  }
}

// Subclass (inherit from Animal)
class Pig extends Animal {
  public void animalSound() {
    // The body of animalSound() is provided here
    System.out.println("The pig says: wee wee");
  }
}

class Main {
  public static void main(String[] args) {
    Pig myPig = new Pig(); // Create a Pig object
    myPig.animalSound();
    myPig.sleep();
  }
}
```

Why and When to use abstract classes and methods?

To achieve security, hide certain details and only show the important details of an object
- Abstraction can also be achieved with `interfaces`