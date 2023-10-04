# Java Date and Time

## Java Dates

- Java doesn't have a built-in Date class, but we can import the `java.time` package to work with the date and time API

| class | description |
|---|---|
| `LocalDate`|yyyy-MM-dd |
| `LocalTime`| HH--mm-ss-ns |
| `LocalDateTime`| yyyy-MM-dd-HH-mm-ss-ns |
| `DateTimeFormatter`| display and parse date-time objects |


## Display Current Date

- import `java.time.LocalDate` class, use `now()`method

```java
import java.time.LocalDate; // import the LocalDate class

public class Main {
  public static void main(String[] args) {
    LocalDate myObj = LocalDate.now(); // Create a date object
    System.out.println(myObj); // Display the current date
  }
}
```

## Display Current Time

- import `java.time.LocalTime` class, use `now()`method

```java
import java.time.LocalTime; // import the LocalTime class

public class Main {
  public static void main(String[] args) {
    LocalTime myObj = LocalTime.now();
    System.out.println(myObj);
  }
}
```

## Display the Current Date and Time

- import `java.time.LocalDateTime` class, use `now()`method

```java
import java.time.LocalDateTime; // import the LocalDateTime class

public class Main {
  public static void main(String[] args) {
    LocalDateTime myObj = LocalDateTime.now();
    System.out.println(myObj);
  }
}
```

## Formatting Date and Time

- use the `DateTimeFormatter` class with `ofPattern()` method to formate or parse date-time objects

```java
import java.time.LocalDateTime; // Import the LocalDateTime class
import java.time.format.DateTimeFormatter; // Import the DateTimeFormatter class

public class Main {
  public static void main(String[] args) {
    LocalDateTime myDateObj = LocalDateTime.now();
    System.out.println("Before formatting: " + myDateObj);
    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

    String formattedDate = myDateObj.format(myFormatObj);
    System.out.println("After formatting: " + formattedDate);
  }
}
```

- the `ofPattern()` method can display the date and time in many different formats:
  - yyyy-MM-dd
  - dd/MM/yyyy
  - dd-MMM-yyyy
  - E, MMM dd yyyy
