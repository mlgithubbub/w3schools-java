# Java Threads

## Java Threads

- `threads` allow a program to do multiple things at the same time and operate more efficiently
- can be used to perform complicated tasks in the background without interrupting the main program

## Creating a Thread

Two ways to create a `thread`:

1. extend the `Thread` class and override its `run()` method

````java
public class Main extends Thread {
  public void run() {
    System.out.println("This code is running in a thread");
  }
}
````

2. implement the `Runnable` interface
```java
public class Main implements Runnable {
  public void run() {
    System.out.println("This code is running in a thread");
  }
}
```

## Running Threads

- if a class extends the `Thread` class, the thread can be run by creating an instance of the class and calling its 
  `start()` method

```java
public class Main extends Thread {
  public static void main(String[] args) {
    Main thread = new Main();
    thread.start();
    System.out.println("This code is outside of the thread");
  }
  public void run() {
    System.out.println("This code is running in a thread");
  }
}
```

- if a class implements the `Runnable` interface, the thread can be run by passing an instance of the class to a 
  `Thread`object's constructor and then calling the thread's `start()`method:

```java
public class Main implements Runnable {
  public static void main(String[] args) {
    Main obj = new Main();
    Thread thread = new Thread(obj);
    thread.start();
    System.out.println("This code is outside of the thread");
  }
  public void run() {
    System.out.println("This code is running in a thread");
  }
}
```

Differences between `extending` and `implementing` threads:
- when you `extend` a `Thread` class, you cannot extend any other class
- when you `implement` the `Runnable` interface, it is possible to extend from another class as well:
```java
MyClass extends OtherClass implements Runnable{
    
        }
```

## Concurrency Problems

- because threads run at the same time as other parts of the program, there is no way to know the order the code 
  will run in
- when threads and the main program are reading and writing the same variables, values are unpredictable
- these problems are called `concurrency problems`

In this code example, the value of `amount` is unpredictable
```java
public class Main extends Thread {
  public static int amount = 0;

  public static void main(String[] args) {
    Main thread = new Main();
    thread.start();
    System.out.println(amount);
    amount++;
    System.out.println(amount);
  }

  public void run() {
    amount++;
  }
}
```

- to avoid concurrency problems, it's best to share as few attributes between threads as possible
- if attributes need to be shared, one solution is to use the `isAlive()` method of the thread to check whether the 
  thread has finished running before using any attributes that the thread can change

```java
public class Main extends Thread {
  public static int amount = 0;

  public static void main(String[] args) {
    Main thread = new Main();
    thread.start();
    // Wait for the thread to finish
    while(thread.isAlive()) {
    System.out.println("Waiting...");
  }
  // Update amount and print its value
  System.out.println("Main: " + amount);
  amount++;
  System.out.println("Main: " + amount);
  }
  public void run() {
    amount++;
  }
}
```


