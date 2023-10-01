# Java Enums

## Enums

- `enum` a special class that represents a group of constants (unchangeable variables, like `final` variables)
- to create an enum, use the `enum` keyword instead of `class` or `interface` and separate constants with a comma
- constants should be in uppercase letters

```java
enum Level {
  LOW,
  MEDIUM,
  HIGH
}
```

You can access `enum` constants with `dot syntax` `.`

```java
Level myVar = Level.MEDIUM;
```

- `enum` is short for "enumerations", which means "specifically listed"

## Enum inside a Class

- you can also have an `enum` inside a class

```java
public class Main {
  enum Level {
    LOW,
    MEDIUM,
    HIGH
  }

  public static void main(String[] args) {
    Level myVar = Level.MEDIUM; 
    System.out.println(myVar);
  }
}
```

## Enum in a Switch Statement

- `enum`s are often used in `switch` statements to check for corresponding values:
```java
enum Level {
  LOW,
  MEDIUM,
  HIGH
}

public class Main {
  public static void main(String[] args) {
    Level myVar = Level.MEDIUM;

    switch(myVar) {
      case LOW:
        System.out.println("Low level");
        break;
      case MEDIUM:
         System.out.println("Medium level");
        break;
      case HIGH:
        System.out.println("High level");
        break;
    }
  }
}
```

## Loop Through an Enum

- `enum` type has a `values()` method: returns an array of all enum constants
- useful when you want to loop through the constants of an enum
```java
for (Level myVar : Level.values()) {
  System.out.println(myVar);
}
```

# Difference between Enums and Classes

- enums and classes can both have attributes and methods
- the only difference is enum constants are: `public`, `static`, and `final`
- `enum`s cannot be used to create objects
- `enum`s cannot extend other classes
- but `enum`s CAN implement interfaces

# Why and When to Use Enums?
- when you have values you know aren't going to change (months, days, colors, deck of cards, etc.)