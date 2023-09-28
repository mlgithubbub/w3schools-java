# Java Booleans

## Java Booleans

- very often in programming you need a data type that can only have 2 values:
  - yes/no
  - true/false
  - on/off

```java
boolean isJavaFun = true;
boolean isFishTasty = false;
System.out.println(isJavaFun);     // Outputs true
System.out.println(isFishTasty);   // Outputs false
```

## Boolean Expression

- more common to return boolean values from boolean expressions

```java
int x = 10;
int y = 9;
System.out.println(x > y); // returns true, because 10 is higher than 9
```

```java
System.out.println(10 > 9); // returns true, because 10 is higher than 9
```

```java
int x = 10;
System.out.println(x == 10); // returns true, because the value of x is equal to 10
```

```java
System.out.println(10 == 15); // returns false, because 10 is not equal to 15
```

## Real Life Example

- find out if someone is old enough to vote:

```java
int myAge = 25;
int votingAge = 18;
System.out.println(myAge >= votingAge);
```

- perform different actions depending on the result with an `if statement`:

```java
int myAge = 25;
int votingAge = 18;

if (myAge >= votingAge) {
  System.out.println("Old enough to vote!");
} else {
  System.out.println("Not old enough to vote.");
}
```

- Booleans are the basis for all Java comparisons and conditions