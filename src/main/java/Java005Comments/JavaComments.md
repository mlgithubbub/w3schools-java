# Java Comments

## Java Comments

- comments can be used to:
  - explain Java code and make it more readable
  - prevent execution when testing alternative code

## Single-line Comments

- text between `//` and end of line is ignored by Java and not executed

Single-line comment before a line of code:
```java
// This is a comment
System.out.println("Hello World");
```
Single-line comment after a line of code:
```java
System.out.println("Hello World"); // This is a comment
```

## Java Multi-line Comments

- start with `/*` and end with `*/`
- any text between is ignored by Java
- `multi-line comment` = `comment block`

```java
/* The code below will print the words Hello World
to the screen, and it is amazing */
System.out.println("Hello World");
```