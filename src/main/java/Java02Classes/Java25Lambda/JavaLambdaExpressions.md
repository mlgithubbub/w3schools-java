# Java Lambda Expressions

## Java Lambda Expressions

- were added in Java 8
- a short block of code which takes in parameters and returns a value
- similar to methods, but:
  - do not need a name
  - can be implemented right in the body of the method

## Syntax

Simplest lambda expression: single parameter + expression:

```java
parameter -> expression
```

To use more than one parameter, use parentheses:

```java
(parameter1, parameter2) -> expression
```


- Lambda expressions are limited:
  - must immediately return a value
  - cannot contain variables, assignments or statements like `if` and `for`
  - For more complex operations, you can use a code block with `{}`
  - If lambda returns a value, use `return` statement

```java
(parameter1, parameter2) -> { code block }
```

## Using Lambda Expressions

- `lambda expressions` are usually passed as parameters to a function

Use a `lambda expression` in the `ArrayList`'s `forEach()`method to print every item in the list:

```java
import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    ArrayList<Integer> numbers = new ArrayList<Integer>();
    numbers.add(5);
    numbers.add(9);
    numbers.add(8);
    numbers.add(1);
    numbers.forEach( (n) -> { System.out.println(n); } );
  }
}
```

- `lambda expressions` can be stored in variables if the variable's type is an interface with only one method
- the lambda expression should have the same number of parameters and the same return type as the interface's method
- Java has many of these interfaces built in, for example `Consumer` interface

Use the `Consumer` interface to store a lambda expression in a variable:

```java
import java.util.ArrayList;
import java.util.function.Consumer;

public class Main {
  public static void main(String[] args) {
    ArrayList<Integer> numbers = new ArrayList<Integer>();
    numbers.add(5);
    numbers.add(9);
    numbers.add(8);
    numbers.add(1);
    Consumer<Integer> method = (n) -> { System.out.println(n); };
    numbers.forEach( method );
  }
}
```

- to use a lambda expression in a method, the method should have a parameter with a single-method interface as its type
- calling the interface's method will run the lambda expression

Create a method which takes a lambda expression as a parameter:

```java
interface StringFunction {
  String run(String str);
}

public class Main {
  public static void main(String[] args) {
    StringFunction exclaim = (s) -> s + "!";
    StringFunction ask = (s) -> s + "?";
    printFormatted("Hello", exclaim);
    printFormatted("Hello", ask);
  }
  public static void printFormatted(String str, StringFunction format) {
    String result = format.run(str);
    System.out.println(result);
  }
}
```
