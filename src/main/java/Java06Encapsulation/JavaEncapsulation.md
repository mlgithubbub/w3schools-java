# Java Encapsulation

## Encapsulation

- `encapsulation` make sure that sensitive data is hidden from users
- To achieve `encapsulation`;
    - declare class variables/attributes as `private`
    - provide public `get` and `set` methods to access and update the value of a `private` variable

## Get and Set

- `private` variables can only be accessed within the same class
- it's possible to access `private` variables if we provide `public` `get` and `set` methods
- `get` method returns the variable value
- `set` method sets the variable value
- Syntax of getter/setter: `get`/`set`+ NameOfTheVariable

```java
public class Person {
  private String name; // private = restricted access

  // Getter
  public String getName() {
    return name;
  }

  // Setter
  public void setName(String newName) {
    this.name = newName;
  }
}
```
- `this` refers to the current object

Without `get` and `set` methods we cannot access `private` variables from outside a class:

```java
public class Main {
  public static void main(String[] args) {
    Person myObj = new Person();
    myObj.name = "John";  // error
    System.out.println(myObj.name); // error 
  }
}
```

We can use `get` to access and `set`to update the variable:

```java
public class Main {
  public static void main(String[] args) {
    Person myObj = new Person();
    myObj.setName("John"); // Set the value of the name variable to "John"
    System.out.println(myObj.getName());
  }
}

// Outputs "John"
```

## Why Encapsulation?

- better control of class attributes and methods
- class attributes can be made `read-only`(if you only use the `get` method) or `write-only` (if you only use the 
  `set` method)
- flexible: programmer can change one part of the code without affecting other parts
- increased data security