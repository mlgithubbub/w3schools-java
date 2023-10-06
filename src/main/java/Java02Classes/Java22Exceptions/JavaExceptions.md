# Java Exceptions

## Java Exceptions

- different errors can occur during execution of java code:
  - coding errors by programmer
  - errors due to wrong input
  - other unforeseeable things
- in these cases java will `throw an exception`

## Java try and catch

- the `try` statement allows you to define a block of code to be tested for errors while being executed
- the `catch` statement allows you to define a block of code to be executed if an error occurs in the try block

```java
try {
  //  Block of code to try
}
catch(Exception e) {
  //  Block of code to handle errors
}
```

This code will generate an error because **myNumbers[10]** doesn't exist

```java
public class Main {
  public static void main(String[ ] args) {
    int[] myNumbers = {1, 2, 3};
    System.out.println(myNumbers[10]); // error!
  }
}
```

We can use `try...catch`

```java
public class Main {
  public static void main(String[ ] args) {
    try {
      int[] myNumbers = {1, 2, 3};
      System.out.println(myNumbers[10]);
    } catch (Exception e) {
      System.out.println("Something went wrong.");
    }
  }
}
```

## Finally

- the `finally` statement lets you execute code after `try...catch`, regardless of the result

```java
public class Main {
  public static void main(String[] args) {
    try {
      int[] myNumbers = {1, 2, 3};
      System.out.println(myNumbers[10]);
    } catch (Exception e) {
      System.out.println("Something went wrong.");
    } finally {
      System.out.println("The 'try catch' is finished.");
    }
  }
}
```

## The throw keyword

- `throw` keyword allows you to create a custom error
- `throw statement` is used together with an `exception type`
- example exceptions:
  - `ArithmeticException`
  - `FileNotFoundException`
  - `ArrayIndexOutOfBoundsException`
  - `SecurityException`

If age is below 18, print "Access denied". If age is 18 or older, print "Access granted"

```java
public class Main {
  static void checkAge(int age) {
    if (age < 18) {
      throw new ArithmeticException("Access denied - You must be at least 18 years old.");
    }
    else {
      System.out.println("Access granted - You are old enough!");
    }
  }

  public static void main(String[] args) {
    checkAge(15); // Set age to 15 (which is below 18...)
  }
}
```

If age was 20, you would not get an exception:

```java
checkAge(20);
```