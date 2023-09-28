# Java If... Else

## Java Conditions and If Statements

Java supports logical conditions from mathematics:

- less than: a < b
- less than or equal to : a <= b
- greater than: a > b
- greater than or equal to: a >= b
- equal to: a == b
- not equal to: a != b

Java has the following conditional statements:

- `if`: executes code block if condition is true
- `else`: executes code block if condition is false
- `else if`: tests a new condition if first condition is false
- `switch`: specifies many conditions and code blocks to be executed if true

## The if Statement

```java
if (condition) {
  // block of code to be executed if the condition is true
}
```

Example:
```java
if (20 > 18) {
  System.out.println("20 is greater than 18");
}
```

You can also test variables:

```java
int x = 20;
int y = 18;
if (x > y) {
  System.out.println("x is greater than y");
}
```

## The else Statement

````java
if (condition) {
  // block of code to be executed if the condition is true
} else {
  // block of code to be executed if the condition is false
}
````

Example:
```java
int time = 20;
if (time < 18) {
  System.out.println("Good day.");
} else {
  System.out.println("Good evening.");
}
// Outputs "Good evening."
```

## The else if Statement

```java
if (condition1) {
  // block of code to be executed if condition1 is true
} else if (condition2) {
  // block of code to be executed if the condition1 is false and condition2 is true
} else {
  // block of code to be executed if the condition1 is false and condition2 is false
}
```

Example:
```java
int time = 22;
if (time < 10) {
  System.out.println("Good morning.");
} else if (time < 18) {
  System.out.println("Good day.");
} else {
  System.out.println("Good evening.");
}
// Outputs "Good evening."
```

# Java Short Hand If...Else (Ternary Operator)

- is called `ternary operator` because consists of 3 operands
```java
variable = (condition) ? expressionTrue :  expressionFalse;
```


Instead of:
```java
int time = 20;
if (time < 18) {
  System.out.println("Good day.");
} else {
  System.out.println("Good evening.");
}
```

Write:
```java
int time = 20;
String result = (time < 18) ? "Good day." : "Good evening.";
System.out.println(result);
```