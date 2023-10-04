# Java Iterator

## Java Iterator

- an `Iterator` is an object that can be used to loop through collections such as `ArrayList` and `HashSet`
- it's called an `iterator` because `iterating` is the technical term for looping

## Getting an Iterator

- the `iterator()` method can be used to get an Iterator for any collection

```java
// Import the ArrayList class and the Iterator class
import java.util.ArrayList;
import java.util.Iterator;

public class Main {
  public static void main(String[] args) {

    // Make a collection
    ArrayList<String> cars = new ArrayList<String>();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Mazda");

    // Get the iterator
    Iterator<String> it = cars.iterator();

    // Print the first item
    System.out.println(it.next());
  }
}
```

## Looping Through a Collection

- use the `hasNext()` and `next()` methods

```java
while(it.hasNext()) {
  System.out.println(it.next());
}
```

## Removing Items from a Collection

- the `remove()` method can remove items from a collection while looping

Use an iterator to remove numbers less than 10 from a collection:

```java
import java.util.ArrayList;
import java.util.Iterator;

public class Main {
  public static void main(String[] args) {
    ArrayList<Integer> numbers = new ArrayList<Integer>();
    numbers.add(12);
    numbers.add(8);
    numbers.add(2);
    numbers.add(23);
    Iterator<Integer> it = numbers.iterator();
    while(it.hasNext()) {
      Integer i = it.next();
      if(i < 10) {
        it.remove();
      }
    }
    System.out.println(numbers);
  }
}
```

NOTE: you cannot use a `for loop` or `for-each loop` to remove items from a collection because the collection is changing size at the same time that the code is trying to loop
