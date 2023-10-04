# Java HashSet

## Java HashSet

- `HashSet`: a collection of items when every item is unique

Create a `HashSet` object called `cars` that will store `strings`

```java
import java.util.HashSet; // Import the HashSet class

HashSet<String> cars = new HashSet<String>();
```

## Add Items

- `HashSet` class has many useful methods, for example use `add()` method to add items to the set

```java
// Import the HashSet class
import java.util.HashSet;

public class Main {
  public static void main(String[] args) {
    HashSet<String> cars = new HashSet<String>();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("BMW");
    cars.add("Mazda");
    System.out.println(cars);
  }
}
```

NOTE: even though **BMW** is added twice, it only appears once because every item in the set must be unique

## Check if an Item Exists

- use the `contains()` method

```java
cars.contains("Mazda");
```

## Remove an Item

- use the `remove()` method

```java
cars.remove("Volvo");
```

- use the `clear()` method to remove all items

```java
cars.clear();
```

## HashSet Size

- use the `size()` method to find out how many items there are

```java
cars.size();
```

## Loop Through a Hash Set

- use a `for-each` loop

```java
for (String i : cars) {
  System.out.println(i);
}
```

## Other Types

- items in a `HashSet` are objects
- use wrapper classes top make primitive types into objects

```java
import java.util.HashSet;

public class Main {
  public static void main(String[] args) {

    // Create a HashSet object called numbers
    HashSet<Integer> numbers = new HashSet<Integer>();

    // Add values to the set
    numbers.add(4);
    numbers.add(7);
    numbers.add(8);

    // Show which numbers between 1 and 10 are in the set
    for(int i = 1; i <= 10; i++) {
      if(numbers.contains(i)) {
        System.out.println(i + " was found in the set.");
      } else {
        System.out.println(i + " was not found in the set.");
      }
    }
  }
}
```