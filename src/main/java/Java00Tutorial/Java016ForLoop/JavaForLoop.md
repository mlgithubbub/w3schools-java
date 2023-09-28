# Java For Loop

## Java For Loop

- when you know how many times you want to loop through a block of code, use a `for` loop instead of a `while` loop

Syntax:
```java
for (statement 1; statement 2; statement 3) {
  // code block to be executed
}
```

- `statement 1`: executed 1 time before execution of code block
- `statement 2`: defines condition for executing the code block
- `statement 3`: executed every time after code block has been executed

Example:

```java
for (int i = 0; i < 5; i++) {
  System.out.println(i);
}
```

Another Example:

```java
for (int i = 0; i <= 10; i = i + 2) {
  System.out.println(i);
}
```

## Nested Loops

- a loop inside another loop
- the inner loop will be executed once for each iteration of the outer loop

Example:
```java
// Outer loop
for (int i = 1; i <= 2; i++) {
  System.out.println("Outer: " + i); // Executes 2 times
  
  // Inner loop
  for (int j = 1; j <= 3; j++) {
    System.out.println(" Inner: " + j); // Executes 6 times (2 * 3)
  }
}
```

# Java For Each Loop

## For-Each Loop

- used to loop through elements in an array

Syntax: 
```java
for (type variableName : arrayName) {
  // code block to be executed
}
```

Example:
```java
String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
for (String i : cars) {
  System.out.println(i);
}
```