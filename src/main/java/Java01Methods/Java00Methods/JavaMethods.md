# Java Methods

- a `method` is a block of code that runs only when called
- you can pass `parameters` (data) into a method
- a.k.a. `functions`
- why? to reuse code: define code once and use it many times

## Create a Method

- must be declared within a class
- name of the method + `()`
- Java has predefined methods like `System.out.println()`, but you can create your own:

Example:
```java
public class Main {
  static void myMethod() {
    // code to be executed
  }
}
```
- `myMethod`: name of the method
- `static`: the method belongs to the Main class and is not an object of the Main class
- `void`: the method does not have a return value

## Call a Method

- to call a method, write the name of the method and `()`

Example:
```java
public class Main {
  static void myMethod() {
    System.out.println("I just got executed!");
  }

  public static void main(String[] args) {
    myMethod();
  }
}

// Outputs "I just got executed!"
```

A method can be called multiple times:

```java
public class Main {
  static void myMethod() {
    System.out.println("I just got executed!");
  }

  public static void main(String[] args) {
    myMethod();
    myMethod();
    myMethod();
  }
}

// I just got executed!
// I just got executed!
// I just got executed!
```