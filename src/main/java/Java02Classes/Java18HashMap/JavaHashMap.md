# Java HashMap

## Java HashMap

- `ArrayList`s store items as an ordered collection and you have to access items with an index number
- `HashMap`s store items in `key-value pairs` and you access them by an index of another type (i.e. `String`)
  - One object is used as a key (`index`) to another object (`value`)
  - can store different types in one HashMap or all the same type

Create a `HashMap` object called capitalCities that will store `String` keys and `String` values 

```java
import java.util.HashMap; // import the HashMap class

HashMap<String, String> capitalCities = new HashMap<String, String>();
```

## Add Items

- `HashMap` class has many useful methods, such as `put()``
```java
// Import the HashMap class
import java.util.HashMap;

public class Main {
  public static void main(String[] args) {
    // Create a HashMap object called capitalCities
    HashMap<String, String> capitalCities = new HashMap<String, String>();

    // Add keys and values (Country, City)
    capitalCities.put("England", "London");
    capitalCities.put("Germany", "Berlin");
    capitalCities.put("Norway", "Oslo");
    capitalCities.put("USA", "Washington DC");
    System.out.println(capitalCities);
  }
}
```

## Access an Item

- use the `get()` method and refer to the value's `key`

```java
capitalCities.get("England");
```

## Remove an Item

- use the `remove()` method and refer to the `key`

```java
capitalCities.remove("England");
```

- use the `clear()` method to remove all items

```java
capitalCities.clear();
```

## HashMap Size

- use the `size()` method to figure out how many items there are

```java
capitalCities.size();
```

## Loop Through a HashMap

- use a `for-each` loop
- use the `keySet()` method if you only want the keys

```java
// Print keys
for (String i : capitalCities.keySet()) {
  System.out.println(i);
}
```

- use the `values()` method if you only want the values

```java
// Print values
for (String i : capitalCities.values()) {
  System.out.println(i);
}
```

```java
// Print keys and values
for (String i : capitalCities.keySet()) {
  System.out.println("key: " + i + " value: " + capitalCities.get(i));
}
```

## Other Types

- keys and values in a `HashMap` are objects
- so you need to use a wrapper class to create objects out of primitive types:
  - boolean -> Boolean
  - char -> Character
  - double -> Double
  - etc.

Create a `HashMap` object called people that will store `String` `keys` and `Integer` `values`

```java
// Import the HashMap class
import java.util.HashMap;

public class Main {
  public static void main(String[] args) {

    // Create a HashMap object called people
    HashMap<String, Integer> people = new HashMap<String, Integer>();


    // Add keys and values (Name, Age)
    people.put("John", 32);
    people.put("Steve", 30);
    people.put("Angie", 33);

    for (String i : people.keySet()) {
      System.out.println("key: " + i + " value: " + people.get(i));
    }
  }
}
```


