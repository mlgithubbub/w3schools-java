# Java Constructors

## Java Constructors

- a `constructor` is a special method used to initialize objects
- is called when an object of a class is created
- it can be used to set initial values for object attributes

```java
// Create a Main class
public class Main {
  int x;  // Create a class attribute

  // Create a class constructor for the Main class
  public Main() {
    x = 5;  // Set the initial value for the class attribute x
  }

  public static void main(String[] args) {
    Main myObj = new Main(); // Create an object of class Main (This will call the constructor)
    System.out.println(myObj.x); // Print the value of x
  }
}

// Outputs 5
```

- the constructor name must match the class name
- the constructor can not have a return type
- the constructor is called when the object is created
- all classes have constructors by default, if you do not create a constructor, java creates one for you, but then 
  you cannot set the initial values for object attributes

## Constructor Parameters

- constructors can also take in parameters to initialize attributes

```java
public class Main {
  int x;

  public Main(int y) {
    x = y;
  }

  public static void main(String[] args) {
    Main myObj = new Main(5);
    System.out.println(myObj.x);
  }
}

// Outputs 5
```

You can have as many parameters as you want

```java
public class Main {
  int modelYear;
  String modelName;

  public Main(int year, String name) {
    modelYear = year;
    modelName = name;
  }

  public static void main(String[] args) {
    Main myCar = new Main(1969, "Mustang");
    System.out.println(myCar.modelYear + " " + myCar.modelName);
  }
}

// Outputs 1969 Mustang
```

