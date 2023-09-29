# Java Modifiers

## Modifiers

- `public` keyword
```java
public class Main
```
- `public` is an `access modifier`
- `access modifier`: used to set the access level for:
  - classes
  - attributes
  - methods
  - constructors

Two groups of modifiers:
1. `Access Modifiers`: controls access level
2. `Non-Access Modifiers`: does not control access level, but provides other functionality

## Access Modifiers

`classes`:

| modifier | description |
|---|---|
|public| class is accessible by any other class |
| *default* | class is only accessible by classes in the same package, this is used when you don't specify a modifier |

`attributes`, `methods`, `constructors`:

| modifier  | description                                                                                 |
|-----------|---------------------------------------------------------------------------------------------|
| public    | code is accessible by any other class                                                       |
| private   | code is only accessible within declared class                                               |
| *default* | code is only accessible in the same package, this is used when you don't specify a modifier |
| protected | code is accessible in the same package and subclasses                                       |

## Non-Access Modifiers

`classes`:

| modifier | description|
|----------|----------------------------------------------|
| final    | class cannot be inherited by other classes   |
| abstract | class cannot be used to create objects, to access and abstract class it must be inherited by another class|

`attributes` and `methods`:

| modifier     | description                                                                                                                           |
|--------------|---------------------------------------------------------------------------------------------------------------------------------------|
| final        | attributes and methods cannot be overridden/modified                                                                                  |
| static       | attributes and methods belong to the class instead of an object                                                                       |
| abstract     | can only be used in an abstract class, can only be used on methods, the method does not have a body, the body is provided by subclass |
| transient    | attributes and methods are skipped when serializing objects containing them                                                           |
| synchronized | methods can only be accessed one thread at a time                                                                                     |
| volatile     | value of an attribute is not cached thread-locally, and is always read from the "main memory"                                          |


## Final

- if you don't want the ability to override existing attribute values, declare attributes as `final`:

```java
public class Main {
  final int x = 10;
  final double PI = 3.14;

  public static void main(String[] args) {
    Main myObj = new Main();
    myObj.x = 50; // will generate an error: cannot assign a value to a final variable
    myObj.PI = 25; // will generate an error: cannot assign a value to a final variable
    System.out.println(myObj.x);
  }
}
```

## Static

- can be accessed without creating an object of the class, unlike public

```java
public class Main {
  // Static method
  static void myStaticMethod() {
    System.out.println("Static methods can be called without creating objects");
  }

  // Public method
  public void myPublicMethod() {
    System.out.println("Public methods must be called by creating objects");
  }

  // Main method
  public static void main(String[ ] args) {
    myStaticMethod(); // Call the static method
    // myPublicMethod(); This would output an error

    Main myObj = new Main(); // Create an object of Main
    myObj.myPublicMethod(); // Call the public method
  }
}
```

## Abstract

- an `abstract` method belongs to an `abstract` class and doesn't have a body
- the body is provided by the subclass

```java
// Code from filename: Main.java
// abstract class
abstract class Main {
  public String fname = "John";
  public int age = 24;
  public abstract void study(); // abstract method
}

// Subclass (inherit from Main)
class Student extends Main {
  public int graduationYear = 2018;
  public void study() { // the body of the abstract method is provided here
    System.out.println("Studying all day long");
  }
}
// End code from filename: Main.java

// Code from filename: Second.java
class Second {
  public static void main(String[] args) {
    // create an object of the Student class (which inherits attributes and methods from Main)
    Student myObj = new Student();

    System.out.println("Name: " + myObj.fname);
    System.out.println("Age: " + myObj.age);
    System.out.println("Graduation Year: " + myObj.graduationYear);
    myObj.study(); // call abstract method
  }
}
```