# Java Arrays

## Java Arrays

- define the variable type with `[]` square brackets to declare and array:
```java
String[] cars;
```
To insert values, put values in comma-separated list in curly braces:

```java
String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
```

Create an array of integers:
```java
int[] myNum = {10, 20, 30, 40};
```

## Access Elements of an Array

- refer to an index number
```java
String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
System.out.println(cars[0]);
// Outputs Volvo
```
- Array indexes start with 0!

## Change an Array Element

- use the index number

```java
cars[0] = "Opel";
```

Example:
```java
String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
cars[0] = "Opel";
System.out.println(cars[0]);
// Now outputs Opel instead of Volvo
```

## Array Length

- use the `length` property to find out how many elements an array has:

```java
String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
System.out.println(cars.length);
// Outputs 4
```

# Java Arrays Loop

## Loop Through An Array

- loop through an array using `for` loop and the `length` property to specify how many times the loop should run

Example:
```java
String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
for (int i = 0; i < cars.length; i++) {
  System.out.println(cars[i]);
}
```

## Loop Through an Array with For-Each

- used exclusively for looping through elements in arrays

Syntax:
```java
for (type variable : arrayname) {
  ...
}
```

Example:
```java
String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
for (String i : cars) {
  System.out.println(i);
}
```

# Java Multi-Dimensional Arrays

## Multidimensional Arrays

- an array of arrays
- useful when want to store data in tabular form (like a table with rows and columns)

Example of two-dimensional array:
```java
int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
```

## Access Elements

- specify two indexes
  - the index of the array
  - the index of the element in the array

```java
int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
System.out.println(myNumbers[1][2]); // Outputs 7
```

## Change Element Values

```java
int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
myNumbers[1][2] = 9;
System.out.println(myNumbers[1][2]); // Outputs 9 instead of 7
```

## Loop Through a Multi-Dimensional Array

- use a `for loop` inside of another `for loop`

```java
public class Main {
  public static void main(String[] args) {
    int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
    for (int i = 0; i < myNumbers.length; ++i) {
      for(int j = 0; j < myNumbers[i].length; ++j) {
        System.out.println(myNumbers[i][j]);
      }
    }
  }
}
```
