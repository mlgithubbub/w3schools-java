# Java Inheritance

## Java Inheritance (Subclass and Superclass)

- `subclass`: child class, the class that inherits from another class
- `superclass`: parent class, the class inherited from
- to inherit from a class use `extends` keyword

```java
class Vehicle {
  protected String brand = "Ford";        // Vehicle attribute
  public void honk() {                    // Vehicle method
    System.out.println("Tuut, tuut!");
  }
}

class Car extends Vehicle {
  private String modelName = "Mustang";    // Car attribute
  public static void main(String[] args) {

    // Create a myCar object
    Car myCar = new Car();

    // Call the honk() method (from the Vehicle class) on the myCar object
    myCar.honk();

    // Display the value of the brand attribute (from the Vehicle class) and the value of the modelName from the Car class
    System.out.println(myCar.brand + " " + myCar.modelName);
  }
}
```

- we set brand to `protected` because if it was `private` the Car class couldn't access it

Why and when to use Inheritance?
- for code reusability

## The final keyword

If you don't want other classes to inherit from a class, use the `final` keyword

This will generate an error:
```java
final class Vehicle {
  ...
}

class Car extends Vehicle {
  ...
}
```