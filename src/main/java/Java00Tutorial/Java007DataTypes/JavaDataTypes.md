# Java Data Types

## Java Data Types

- a variable must be a specified data type

```java
int myNum = 5;               // Integer (whole number)
float myFloatNum = 5.99f;    // Floating point number
char myLetter = 'D';         // Character
boolean myBool = true;       // Boolean
String myText = "Hello";     // String
```

Data types are divided into two groups:
1. primitive data types: 
   - byte
   - short
   - int
   - long
   - float
   - double
   - boolean
   - char
2. non-primitive data types:
    - String
    - Array
    - Class

## Primitive Data Types

| Data Type | Size    | Stores                                     |
| ---|---------|--------------------------------------------| 
|byte| 1 byte  | whole numbers -128 - 127                   |
|short| 2 bytes | whole numbers 32,768 - 32,767              | 
|int| 4 bytes| whole numbers -2,147,483,648 - 2,147,483,647 |
|long|	8 bytes| whole numbers -9,223,372,036,854,775,808 - 9,223,372,036,854,775,807 |
|float|	4 bytes| fractional numbers of 6 to 7 decimal digits|
|double| 8 bytes| fractional numbers of 15 decimal digits|
|boolean|1 bit|	true or false values|
|char| 2 bytes|	a single character/letter or ASCII values|

# Java Numbers

- primitive number types are divided into 2 groups:
1. `integer` types: whole numbers, positive or negative, without decimals: `byte`, `short`, `int`, `long`
2. `floating point` types: fractional numbers, with decimals: `float`, `double`
- `int` is most often used for whole numbers
- `double` is most often used for floating point numbers

## Integer Types

### Byte

- whole numbers -128 to 127
```java
byte myNum = 100;
System.out.println(myNum);
```

### Short

- whole numbers -32768 to 32767

```java
short myNum = 5000;
System.out.println(myNum);
```

### Int

- whole numbers -2147483648 to 2147483647
```java
int myNum = 100000;
System.out.println(myNum); 
```

### Long

- whole numbers -9223372036854775808 to 9223372036854775807
- end the value with an `L`
```java
long myNum = 15000000000L;
System.out.println(myNum);
```

## Floating Point Types

- `float` and `double` can store fractional numbers
- add `f` to the end of value for a float
```java
float myNum = 5.75f;
System.out.println(myNum);
```
- add `d` to the end of value for a double
```java
double myNum = 19.99d;
System.out.println(myNum);
```

- double is more precise than float

### Scientific Numbers

- a floating point number can be a scientific number with `e` to indicate the power of ten:
```java
float f1 = 35e3f;
double d1 = 12E4d;
System.out.println(f1);
System.out.println(d1);
```

# Java Boolean Data Types

## Boolean Types

- when you need a data type that can only have one of two values, like:
  - yes/no
  - on/off
  - true/false
- `boolean` can only take values true or false
```java
boolean isJavaFun = true;
boolean isFishTasty = false;
System.out.println(isJavaFun);     // Outputs true
System.out.println(isFishTasty);   // Outputs false
```
- booleans are used mostly for conditional testing

# Java Characters

## Characters

- `char` data type stores a single character
- should be surrounded by single quotes `''`
```java
char myGrade = 'B';
System.out.println(myGrade);
```
- or use ASCII value https://www.w3schools.com/charsets/ref_html_ascii.asp
```java
char myVar1 = 65, myVar2 = 66, myVar3 = 67;
System.out.println(myVar1);
System.out.println(myVar2);
System.out.println(myVar3);
```

## Strings

- `String` stores sequence of characters
- should be surrounded by double quotes `""`

```java
String greeting = "Hello World";
System.out.println(greeting);
```

- some people call the `String` type the **special ninth type** because it is used so often in Java
- `String`s are non-primitive because they refer to objects

# Java Non-Primitive Data Types

## Non-Primitive Data Types

- `non-primitive data types` are called  `reference types` because they refer to objects

Main differences between `primitive` and `non-primitive`data types:

| primitive                                             | non-primitive |
|-------------------------------------------------------| ---|
| predefined in java                                    | created by the programmer |
| cannot be used to call methods and perform operations | can be used to call methods and perform operations |
| always has a value                                    | can be `null`|
| starts with a lowercase letter                        | starts with an uppercase letter |
| byte, short, int, long, float, double, boolean, char  | String, Array, Class, Interface, etc. |

