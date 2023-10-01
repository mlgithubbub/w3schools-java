# Java Packages

## Java Packages & API

- `package`: used to group related classes
- think of it as a folder in a file directory
- we use packages to avoid name conflicts and to write more maintainable code

Two categories of packages:
1. `built-in packages`: packages from the Java API
2. `user-defined packages`

## Built-in Packages

- `Java API`: a library of pre-written classes that are free to use included in the `Java Development Environment`
- contains components for managing input, database programming, etc.
- https://docs.oracle.com/javase/8/docs/api/
- `packages` contain `classes`, you can import a single class or a whole package

```java
import package.name.Class;   // Import a single class
import package.name.*;   // Import the whole package
```

## Import a Class

Import the `Scanner` class, which is used to get user input
```java
import java.util.Scanner;
```
- `java.util` is the package
- `Scanner` is the class

Using the `nextLine()` method to read a complete line:
```java
import java.util.Scanner;

class MyClass {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);
    System.out.println("Enter username");

    String userName = myObj.nextLine();
    System.out.println("Username is: " + userName);
  }
}
```

## Import a Package

To import a whole package, use the `*` sign
```java
import java.util.*;
```

## User-defined Packages

Java uses a file system directory to store packages you create:
```java
└── root
  └── mypack
    └── MyPackageClass.java
```

Use the `package` keyword to create a package
```java
package mypack;
class MyPackageClass {
  public static void main(String[] args) {
    System.out.println("This is my package!");
  }
}
```

Compile the class:
```java
C:\Users\Your Name>javac MyPackageClass.java
```

Then compile the package:
```java
C:\Users\Your Name>javac -d . MyPackageClass.java
```

- the `-d` keyword specifies the destination where to save the class file
- you can use a directory name like:  c:/user
- or you can use `.` to keep the package in the same directory

You can run the package class:
```java
C:\Users\Your Name>java mypack.MyPackageClass
```