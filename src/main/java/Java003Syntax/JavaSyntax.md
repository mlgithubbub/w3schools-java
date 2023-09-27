# Java Syntax

## Java Syntax

- in previous chapter we created `Main.java` and printed "Hello World" to the screen:

```java
public class Main {
  public static void main(String[] args) {
    System.out.println("Hello World");
  }
}
```

- every line of code in Java must be inside a class
- a class should always start with an uppercase letter
- Java is case-sensitive: MyClass =/= myclass
- the name of the java file MUST MATCH the class name

## The Main Method

- the `main()` method is required, you will see it in every Java Program

```java
public static void main(String[] args)
```

- any code inside of the main() method will be executed

## System.out.println()

```java
public static void main(String[] args) {
  System.out.println("Hello World");
```

- `{}` mark the beginning and end of a code block
- `System` is a built-in Java class that contains useful members like `out` (short for "output")
- each code statement must end with a semicolon
