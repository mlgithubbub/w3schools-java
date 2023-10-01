# Java User Input

## Java User Input

- `Scanner` class is used to get input
- is found int the `java.util` package
- to use `Scanner` class, create an object of the class and use any available methods

We will use `nextLine()` method:
```java
import java.util.Scanner;  // Import the Scanner class

class Main {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);  // Create a Scanner object
    System.out.println("Enter username");

    String userName = myObj.nextLine();  // Read user input
    System.out.println("Username is: " + userName);  // Output user input
  }
}
```

## Input Types

| method | reads this value input from the user |
|---|--------------------------------------|
| nextBoolean()| `boolean`|
| nextByte() | `byte` |
| nextDouble() | `double`|
| nextFloat() | `float` |
| nextInt() | `int`|
| nextLine() | `String`|
| nextLong() | `long`|
| nextShort() | `short`|

Use different methods to read data of various types:

```java
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);

    System.out.println("Enter name, age and salary:");

    // String input
    String name = myObj.nextLine();

    // Numerical input
    int age = myObj.nextInt();
    double salary = myObj.nextDouble();

    // Output input by user
    System.out.println("Name: " + name);
    System.out.println("Age: " + age);
    System.out.println("Salary: " + salary);
  }
}
```

- If you enter the wrong input, you will get an exception/error message like "InputMismatchException"