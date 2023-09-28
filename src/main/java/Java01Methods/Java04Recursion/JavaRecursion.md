# Java Recursion

- a technique to make a function call itself
- helps break complicated problems down into simpler problems

Example:

Use recursion to add all of the numbers up to 10:
```java
public class Main {
  public static void main(String[] args) {
    int result = sum(10);
    System.out.println(result);
  }
  public static int sum(int k) {
    if (k > 0) {
      return k + sum(k - 1);
    } else {
      return 0;
    }
  }
}
```

## Halting Condition

- every recursive function should have a halting condition

Add a range of numbers between a start value and an end value:
```java
public class Main {
  public static void main(String[] args) {
    int result = sum(5, 10);
    System.out.println(result);
  }
  public static int sum(int start, int end) {
    if (end > start) {
      return end + sum(start, end - 1);
    } else {
      return end;
    }
  }
}
```