# Java Array List

## Java ArrayList

- the `ArrayList` class is a resizable array, can be found in the `java.util` package
- difference between built-in array vs. ArrayList:
  - size of array cannot be modified; if you want to add or remove elements, you have to create a new array
  - elements can be added and removed from an `ArrayList`

Create an `ArrayList` objects called `cars` that will store strings:
```java
import java.util.ArrayList; // import the ArrayList class

ArrayList<String> cars = new ArrayList<String>(); // Create an ArrayList object
```

## Add Items

- `ArrayList` class has many useful methods, for example `add()`to add elements:

```java
import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    ArrayList<String> cars = new ArrayList<String>();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Mazda");
    System.out.println(cars);
  }
}
```

## Access an Item

- use the `get()` method to access an item by the index number

```java
cars.get(0);
```

## Change an Item

- use the `set()` method and index number to set a value in the ArrayList

```java
cars.set(0, "Opel");
```

## Remove an Item

- use the `remove()` method and index number to remove an element

```java
cars.remove(0);
```

- use the `clear()` method to remove all the elements

```java
cars.clear();
```

## ArrayList Size

- use the `size` method to find out how many elements an ArrayList has

```java
cars.size();
```

## Loop Through and ArrayList

- loop through the elements of an ArrayList with a `for` loop, and use `size()` method to specify how many times the 
  loop should run

```java
public class Main {
  public static void main(String[] args) {
    ArrayList<String> cars = new ArrayList<String>();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Mazda");
    for (int i = 0; i < cars.size(); i++) {
      System.out.println(cars.get(i));
    }
  }
}
```

- you can also loop through an `ArrayList` with the `for-each` loop:

```java
public class Main {
  public static void main(String[] args) {
    ArrayList<String> cars = new ArrayList<String>();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Mazda");
    for (String i : cars) {
      System.out.println(i);
    }
  }
}
```

## Other Types

- elements in ArrayLists are objects
- in examples above we used `String` objects
- to use other types such as `int` you must specify an equivalent `wrapper class`: Integer

| type    | wrapper class |
|---------|---------------|
| boolean | `Boolean`     |
| integer | `Integer`     |
| char    | `Character`   |
| double  | `Double`      |

Create an `ArrayList` to store elements of type `Integer`

```java
import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    ArrayList<Integer> myNumbers = new ArrayList<Integer>();
    myNumbers.add(10);
    myNumbers.add(15);
    myNumbers.add(20);
    myNumbers.add(25);
    for (int i : myNumbers) {
      System.out.println(i);
    }
  }
}
```

## Sort an ArrayList

- another useful class in `java.util` is `Collections`
- it has a `sort()` method for sorting lists alphabetically or numerically

```java
import java.util.ArrayList;
import java.util.Collections;  // Import the Collections class

public class Main {
  public static void main(String[] args) {
    ArrayList<String> cars = new ArrayList<String>();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Mazda");
    Collections.sort(cars);  // Sort cars
    for (String i : cars) {
      System.out.println(i);
    }
  }
}
```

Sort an ArrayList of Integers:

```java
import java.util.ArrayList;
import java.util.Collections;  // Import the Collections class

public class Main {
  public static void main(String[] args) {
    ArrayList<Integer> myNumbers = new ArrayList<Integer>();
    myNumbers.add(33);
    myNumbers.add(15);
    myNumbers.add(20);
    myNumbers.add(34);
    myNumbers.add(8);
    myNumbers.add(12);

    Collections.sort(myNumbers);  // Sort myNumbers

    for (int i : myNumbers) {
      System.out.println(i);
    }
  }
}
```