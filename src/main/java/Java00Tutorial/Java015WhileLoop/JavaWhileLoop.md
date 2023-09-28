# Java While Loop

## Loops

- can execute a code block as long as a specified condition is reached
- handy because: save time, reduce errors, make code readable

## Java While Loop

- loops through a block of code as long as a condition is true
Syntax:
```java
while (condition) {
  // code block to be executed
}
```

Example:
```java
int i = 0;
while (i < 5) {
  System.out.println(i);
  i++;
}
```

## The Do/While Loop

- executes the code block once to check if the condition is true
- then repeats the loop as long as the condition is true

Syntax:
```java
do {
  // code block to be executed
}
while (condition);
```

Example:
```java
int i = 0;
do {
  System.out.println(i);
  i++;
}
while (i < 5);
```

- Don't forget to increment the variable used in the condition or else you will get a neverending loop!