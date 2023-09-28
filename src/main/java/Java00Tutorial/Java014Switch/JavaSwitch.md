# Java Switch

## Java Switch Statements

```java
switch(expression) {
  case x:
    // code block
    break;
  case y:
    // code block
    break;
  default:
    // code block
}
```

1. `switch` expression is evaluated once
2. the value is compared with the values of each case
3. if the values match, the block of code is executed
4. `break` and `default` keywords are optional

Example:
```java
int day = 4;
switch (day) {
  case 1:
    System.out.println("Monday");
    break;
  case 2:
    System.out.println("Tuesday");
    break;
  case 3:
    System.out.println("Wednesday");
    break;
  case 4:
    System.out.println("Thursday");
    break;
  case 5:
    System.out.println("Friday");
    break;
  case 6:
    System.out.println("Saturday");
    break;
  case 7:
    System.out.println("Sunday");
    break;
}
// Outputs "Thursday" (day 4)
```

## The break keyword

- when `break` keyword is reached, the program breaks out of the switch block
- saves a lot of execution time because ignores the rest of the code in the switch

## The default keyword

- specifies some code to run if there is no match:
```java
int day = 4;
switch (day) {
  case 6:
    System.out.println("Today is Saturday");
    break;
  case 7:
    System.out.println("Today is Sunday");
    break;
  default:
    System.out.println("Looking forward to the Weekend");
}
// Outputs "Looking forward to the Weekend"
```

- if `default` is used as the last statement in a switch block, it doesn't need a break
