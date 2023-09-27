# Java Type Casting

## Java Type Casting

Two types:

1. `widening casting` (automatically): converting a smaller type to a larger type:
- byte > short > char > int > long > float > double
2. `narrowing casting` (manually)
converting a larger type to a smaller type:
- double > float > long > int > char > short > byte

### Widening Casting
Widening casting happens automatically when passing a smaller type to a larger type:
```java
public class Main {
  public static void main(String[] args) {
    int myInt = 9;
    double myDouble = myInt; // Automatic casting: int to double

    System.out.println(myInt);      // Outputs 9
    System.out.println(myDouble);   // Outputs 9.0
  }
}
```

### Narrowing Casting

Must be done manually by placing the type in front of the value:
```java
public class Main {
  public static void main(String[] args) {
    double myDouble = 9.78d;
    int myInt = (int) myDouble; // Manual casting: double to int

    System.out.println(myDouble);   // Outputs 9.78
    System.out.println(myInt);      // Outputs 9
  }
}
```