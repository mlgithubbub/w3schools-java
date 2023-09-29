# Java Class Attributes

## Java Class Attributes

- `attributes`or `fields` are variables within a class

```java
public class Main {
  int x = 5;
  int y = 3;
}
```

## Accessing Attributes

- access attributes by creating an object of the class and using `.` dot syntax

Create an object of the Main class named myObj, and print the value of the x attribute

```java
public class Main {
  int x = 5;

  public static void main(String[] args) {
    Main myObj = new Main();
    System.out.println(myObj.x);
  }
}
```

## Modify Attributes

- you can modify attribute values

Set the value of x to 40:
```java
public class Main {
  int x;

  public static void main(String[] args) {
    Main myObj = new Main();
    myObj.x = 40;
    System.out.println(myObj.x);
  }
}
```

- or override existing attribute values:

```java
public class Main {
  int x = 10;

  public static void main(String[] args) {
    Main myObj = new Main();
    myObj.x = 25; // x is now 25
    System.out.println(myObj.x);
  }
}
```

- if you don't want that attribute values can be overridden, declare the attribute as `final`:

```java
public class Main {
  final int x = 10;

  public static void main(String[] args) {
    Main myObj = new Main();
    myObj.x = 25; // will generate an error: cannot assign a value to a final variable
    System.out.println(myObj.x);
  }
}
```

- `final` is useful when you want a variable to never change, like PI (3.14159...)
- `final` keyword is a `modifier

## Multiple Objects

- you can create multiple objects of one class
- and change the attribute values in one of those objects
- without affecting the attribute values in other objects

Change the value of x to 25 in myObj2, but leave x in myObj1 unchanged:
```java
public class Main {
  int x = 5;

  public static void main(String[] args) {
    Main myObj1 = new Main();  // Object 1
    Main myObj2 = new Main();  // Object 2
    myObj2.x = 25;
    System.out.println(myObj1.x);  // Outputs 5
    System.out.println(myObj2.x);  // Outputs 25
  }
}
```

## Multiple Attributes

- specify as many attributes as you want:
```java
public class Main {
  String fname = "John";
  String lname = "Doe";
  int age = 24;

  public static void main(String[] args) {
    Main myObj = new Main();
    System.out.println("Name: " + myObj.fname + " " + myObj.lname);
    System.out.println("Age: " + myObj.age);
  }
}
```