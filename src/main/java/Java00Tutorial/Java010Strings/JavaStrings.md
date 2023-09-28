# Java Strings

## Java Strings

- strings are used for storing text
- a `String` variable contains a collection of characters surrounded by double quotes `""`

Create a variable of type `String` and assign it a value:
```java
String greeting = "Hello";
```

## String Length

- a string is actually an object with methods
- the length of a string can be found with the `length()` method
```java
String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
System.out.println("The length of the txt string is: " + txt.length());
```

## More String Methods

- `toUpperCase()` and `toLowerCase()`

```java
String txt = "Hello World";
System.out.println(txt.toUpperCase());   // Outputs "HELLO WORLD"
System.out.println(txt.toLowerCase());   // Outputs "hello world"
```

## Finding a Character in a String

- `indexOf()` returns the `index` (position) of the first occurence of a specified text in a string (including 
  whitespace)
```java
String txt = "Please locate where 'locate' occurs!";
System.out.println(txt.indexOf("locate")); // Outputs 7
```

- indices start from zero

## Complete String Reference

https://www.w3schools.com/java/java_ref_string.asp

# Java String Concatenation

## String Concatenation

- use `+` operator to combine strings, called `concatenation`

```java
String firstName = "John";
String lastName = "Doe";
System.out.println(firstName + " " + lastName);
```

You can also use the `concat()` method to concatenate two strings:
```java
String firstName = "John ";
String lastName = "Doe";
System.out.println(firstName.concat(lastName));
```

# Java Numbers and Strings

## Adding Numbers and Strings

- java uses `+` both for concatenation and addition

Number + number:
```java
int x = 10;
int y = 20;
int z = x + y;  // z will be 30 (an integer/number)
```

String + string:
```java
String x = "10";
String y = "20";
String z = x + y;  // z will be 1020 (a String)
```

Number + string:
```java
String x = "10";
int y = 20;
String z = x + y;  // z will be 1020 (a String)
```

# Java Special Characters

## Strings - Special Characters

Java will misunderstand this string:
```java
String txt = "We are the so-called "Vikings" from the north.";
```

Escape Sequences

| escape sequence | result                                                 |
|-----------------|--------------------------------------------------------|
| \\'             | '                                                      |
| \\"             | "                                                      |
| \\\             | \\                                                     |
| \n              | new line                                               |
| \r              | return (move the cursor to the start of the same line) |
| \b              | backspace                                              |
| \f              | form feed (shows a page break)                         |







