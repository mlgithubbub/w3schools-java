# Java Classes and Objects

## Java Classes/Objects

- everything in Java is associated with `classes` and `objects` and their `attributes` and `methods`
- Example:
  - `object`: car
  - `attributes`: weight, color
  - `methods`: drive, brake
- a class is like and object constructor or blueprint

## Create a Class

```java
public class Main {
  int x = 5;
}
```
- Class name should always start with an uppercase letter
- Name of the java file should match the class name

## Create an Object

- use the class we have created, Main, to create an object:

```java
public class Main {
  int x = 5;

  public static void main(String[] args) {
    Main myObj = new Main();
    System.out.println(myObj.x);
  }
}
```

## Multiple Objects

- you can create multiple objects of one class

```java
public class Main {
  int x = 5;

  public static void main(String[] args) {
    Main myObj1 = new Main();  // Object 1
    Main myObj2 = new Main();  // Object 2
    System.out.println(myObj1.x);
    System.out.println(myObj2.x);
  }
}
```

## Using Multiple Classes

- create an object of one class and access it in another class:
  - one class has all the attributes and methods
  - the other class holds the main() method (code to be executed)

Main.java
```java
public class Main {
  int x = 5;
}
```

Second.java
```java
class Second {
  public static void main(String[] args) {
    Main myObj = new Main();
    System.out.println(myObj.x);
  }
}
```

After you compile both files, run the Second.java file


