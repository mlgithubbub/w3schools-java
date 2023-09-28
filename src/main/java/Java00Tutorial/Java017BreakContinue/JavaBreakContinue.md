# Java Break and Continue

## Java Break

- `break` can be used to jump out of a switch
- `break` can also be used to jump out of a loop

Example:
```java
for (int i = 0; i < 10; i++) {
  if (i == 4) {
    break;
  }
  System.out.println(i);
}
```

## Java Continue

- `continue` just breaks one iteration of a loop if a condition occurs, but continues on to the next iteration

Example:
```java
for (int i = 0; i < 10; i++) {
  if (i == 4) {
    continue;
  }
  System.out.println(i);
}
```
- the example skips the value of 4

## Break and Continue in While Loop

You can also use `break` and `continue` in while loops:

Break example:
```java
int i = 0;
while (i < 10) {
  System.out.println(i);
  i++;
  if (i == 4) {
    break;
  }
}
```

Continue example:
```java
int i = 0;
while (i < 10) {
  if (i == 4) {
    i++;
    continue;
  }
  System.out.println(i);
  i++;
}
```