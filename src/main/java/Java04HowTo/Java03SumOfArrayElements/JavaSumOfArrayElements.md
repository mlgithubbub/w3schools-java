# Java How to Calculate the Sum of Elements

## Calculate the Sum of an Array

- get the sum of array elements:

```java
int[] myArray = {1, 5, 10, 25};
int sum = 0;
int i; 

// Loop through the array elements and store the sum in the sum variable
for (i = 0; i < myArray.length; i++) {
  sum += myArray[i];
}

System.out.println("The sum is: " + sum);
```