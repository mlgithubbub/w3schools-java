# Java Variables

- containers for storing values
- Variable types:
  - `String`: stores text, surrounded by double quotes: "Hello"
  - `int`: stores integers(whole numbers), without decimals: 123, -123
  - `float`: stores floating point numbers, with decimals: 19.99, -19.99
  - `char`: stores single characters, surrounded by single quotes: 'a', 'B'
  - `boolean`: true or false

## Declaring(Creating) Variables

```java
type variableName = value;
```

- `=` sign used to assign values to a variable

Create a variable called `name` of type `String` and assign it the value of `John`:

```java
String name = "John";
System.out.println(name);
```

Create a variable called `myNum` of type `int` and assign it the value `15`:

```java
int myNum = 15;
System.out.println(myNum);
```

Declare a variable without assigning a value and assign the value later:

```java
int myNum;
myNum = 15;
System.out.println(myNum);
```

Assign a new value to an existing variable and overwrite the previous value:

```java
int myNum = 15;
myNum = 20;  // myNum is now 20
System.out.println(myNum);
```

## Final Variables

- use `final` keyword to make a variable constant (unchangeable and read-only):

```java
final int myNum = 15;
myNum = 20;  // will generate an error: cannot assign a value to a final variable
```

## Other Types:

How to declare variables of other types:
```java
int myNum = 5;
float myFloatNum = 5.99f;
char myLetter = 'D';
boolean myBool = true;
String myText = "Hello";
```

# Java Print Variables

## Display Variables

- the `println()` method is often used to display variables
- use `+` to combine both text and a variable

```java
String name = "John";
System.out.println("Hello " + name);
```

- use `+` to add a variable to another variable:
- 
```java
String firstName = "John ";
String lastName = "Doe";
String fullName = firstName + lastName;
System.out.println(fullName);
```

- use `+` as a mathematical operator for addition:
- 
```java
int x = 5;
int y = 6;
System.out.println(x + y); // Print the value of x + y
```

# Java Declare Multiple Variables

- declare more than one variable of the same type using a comma-separated list
Instead of:
```java
int x = 5;
int y = 6;
int z = 50;
System.out.println(x + y + z);
```
Write:
```java
int x = 5, y = 6, z = 50;
System.out.println(x + y + z);
```

## One Value to Multiple Variables

- you can also assign the same value to multiple variables in one line:
```java
int x, y, z;
x = y = z = 50;
System.out.println(x + y + z);
```

# Java Identifiers

- all Java variables must be `identified` with unique names called `identifiers`
- can be short: x, y, z OR descriptive: age, sum, totalVolume
- descriptive names are recommended because make code understandable and maintainable
```java
// Good
int minutesPerHour = 60;

// OK, but not so easy to understand what m actually is
int m = 60;
```

General rules for naming variables:
- can contain letters, digits, underscores and dollar signs
- must begin with a letter, `$` or `_`
- should start with a lowercase letter
- no whitespace
- case-sensitive: myVar =/= myvar
- reserved words(like Java keywords: `int`, `boolean`, etc.) cannot be used as names

