# Java Scope

- `scope`: variables are only accessible inside of the region they are created

## Method Scope

- variables declared in a method are only available **after** they are declared **within** that method

```java
public class Main {
  public static void main(String[] args) {

    // Code here CANNOT use x

    int x = 100;

    // Code here can use x
    System.out.println(x);
  }
}
```

## Block Scope

- `block` = all code between `{}`
- variables declared in a block are only available **after** they are declared **within** that block

```java
public class Main {
  public static void main(String[] args) {

    // Code here CANNOT use x

    { // This is a block

      // Code here CANNOT use x

      int x = 100;

      // Code here CAN use x
      System.out.println(x);

    } // The block ends here

  // Code here CANNOT use x

  }
}
```

- variables declared in `for-statements` are also available within the block's scope
