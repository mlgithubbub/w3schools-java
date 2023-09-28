# Java Operators

## Java Operators

- used to perform operations on variables and values

Use the plus operator to add two values:
```java
int x = 100 + 50;
```

The plus operator can also be used to:
- variable + value
- variable + variable:
```java
int sum1 = 100 + 50;        // 150 (100 + 50)
int sum2 = sum1 + 250;      // 400 (150 + 250)
int sum3 = sum2 + sum2;     // 800 (400 + 400)
```

Operators:
- Arithmetic operators 
- Assignment operators 
- Comparison operators 
- Logical operators 
- Bitwise operators

## Arithmetic Operators

- `+` addition
- `-` subtraction
- `*` multiplication
- `/` division
- `%` modulus
- `++` increment
- `--` decrement

## Java Assignment Operators

`=` assignment operator

Use `=` to assign the value of `10` to the variable `x`:

```java
int x = 10;
```

All assignment operators

| operator | example     | same as        |
|----------|-------------|----------------|
| =        | x = 5       | x = 5          |
| +=       | x += 5      | x = x + 5      |
| -=       | x -= 5      | x = x - 5      |
| *=       | x *= 5      | x = x * 5      |
| /=       | x /= 5      | x = x / 5      |
| %=       | x %= 5      | x = x % 5      |
| &=       | x &= 5      | x = x & 5      |
| &#124;=  | x &#124;= 5 | x = x &#124; 5 |
| ^=       | x ^= 5      | x = x ^ 5      |
| \>>=     | x \>>= 5    | x = x \>> 5    |
| <<=      | x <<= 5     | x =  x << 5    |


## Java Comparison Operators

- `comparison operators` compare two values or variables
- the return value is true or false

Use the `greater than` `>` operator to find out of 5 is greater than 3:
```java
int x = 5;
int y = 3;
System.out.println(x > y); // returns true, because 5 is higher than 3
```

Comparison Operators

| operator | name                     | example |
|----------|--------------------------|---------|
| ==       | equal                    | x == y  |
| !=       | not equal                | x != y  |
| \>       | greater than             | x \> y  |
| <        | less than                | x < y   |
| \>=      | greater than or equal to | x \>= y |
| <=       | less than or equal to    | x <= y  |

## Java Logical Operators

- test for `true` or `false` with `logical operators`:

| operator     | name | description           | example                  |
|--------------|------|-----------------------|--------------------------|
| &&           | and  | true if both are true | x < 5 && x < 10          |
| &#124;&#124; | or   | true if one is true   | x < 5 &#124;&#124; x < 4 |
| !            | not  | false if true         | !(x < 5 && x < 10)       |