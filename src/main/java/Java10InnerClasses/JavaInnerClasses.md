# Java Inner Classes

## Java Inner Classes

- it's possible to nest classes within classes
- to access the inner class, create an object of the outer class and then create an object of the inner class:

```java
class OuterClass {
  int x = 10;

  class InnerClass {
    int y = 5;
  }
}

public class Main {
  public static void main(String[] args) {
    OuterClass myOuter = new OuterClass();
    OuterClass.InnerClass myInner = myOuter.new InnerClass();
    System.out.println(myInner.y + myOuter.x);
  }
}

// Outputs 15 (5 + 10)
```

## Private Inner Class

- unlike regular classes, inner classes can be `private` or `protected`
- if you don't want outside classes to have access to the inner class, declare it as `private`

```java
class OuterClass {
  int x = 10;

  private class InnerClass {
    int y = 5;
  }
}

public class Main {
  public static void main(String[] args) {
    OuterClass myOuter = new OuterClass();
    OuterClass.InnerClass myInner = myOuter.new InnerClass();
    System.out.println(myInner.y + myOuter.x);
  }
}
```

- If you try to access a private inner class from an outside class, an error occurs

