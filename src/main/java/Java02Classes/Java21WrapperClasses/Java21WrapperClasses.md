# Java Wrapper Classes

## Java Wrapper Classes

- `wrapper classes` provide a way to use primitive data types as objects

| primitive type | wrapper class |
|----------------|---------------|
| byte           | Byte          |
| short          | Short         |
| int            | Integer       |
| long           | Long          |
| float          | Float         |
| double         | Double        |
| boolean        | Boolean       |
| char           | Character     |

You have to use wrapper classes in cases where primitive types can't be used, for example `ArrayList`

```java
ArrayList<int> myNumbers = new ArrayList<int>(); // Invalid
ArrayList<Integer> myNumbers = new ArrayList<Integer>(); // Valid
```

## Creating Wrapper Objects

- to create a wrapper object, use the wrapper class instead of the primitive type
- to get the value, just print the object

```java
public class Main {
  public static void main(String[] args) {
    Integer myInt = 5;
    Double myDouble = 5.99;
    Character myChar = 'A';
    System.out.println(myInt);
    System.out.println(myDouble);
    System.out.println(myChar);
  }
}
```

- because you're working with objects, you can use methods to get info about these objects, for example:
- you can use these methods to get the value of the wrapper object:
  - `intValue()`
  - `byteValue()`
  - `shortValue()`
  - `longValue()`
  - `floatValue()`
  - `doubleValue()`
  - `charValue()`
  - `booleanValue()`

```java
public class Main {
  public static void main(String[] args) {
    Integer myInt = 5;
    Double myDouble = 5.99;
    Character myChar = 'A';
    System.out.println(myInt.intValue());
    System.out.println(myDouble.doubleValue());
    System.out.println(myChar.charValue());
  }
}
```

- another useful method is the `toString()` method, used to convert wrapper objects to strings

Convert an `Integer` to a `String`and use the `length()` method of the String class to output the length of "string":

```java
ublic class Main {
  public static void main(String[] args) {
    Integer myInt = 100;
    String myString = myInt.toString();
    System.out.println(myString.length());
  }
}
```