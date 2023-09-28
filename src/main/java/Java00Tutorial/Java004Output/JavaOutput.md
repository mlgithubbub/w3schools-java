# Java Output/Print

- in last chapter you learned that you can use `println()` to output values or print text in Java:
```java
System.out.println("Hello World!");
```

You can add as many `println()` statements as you want and it will add a new line at the end of each method:

```java
System.out.println("Hello World!");
System.out.println("I am learning Java.");
System.out.println("It is awesome!");
```

## Double Quotes

- Text must be wrapped in double quotation marks `""`

```java
System.out.println("This sentence will work!");
```

- If you forget, there will be an error:

```java
System.out.println(This sentence will produce an error);
```

## The print() Method

- `print()` is similar to `println()` but doesn't insert a new line at the end:

```java
System.out.print("Hello World! ");
System.out.print("I will print on the same line.");
```

# Java Output Numbers

## Print Numbers

- you can also use `println()` to print numbers
- we DON'T put numbers in `""`

```java
System.out.println(3);
System.out.println(358);
System.out.println(50000);
```

You can also perform mathematical calculations inside `println()`:

```java
System.out.println(3 + 3);
System.out.println(2 * 5);
```


