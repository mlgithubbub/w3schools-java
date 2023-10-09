# Java Create and Write To Files

## Create a File

- use `createNewFile()` method which returns a boolean value: 
  - `true` if created
  - `false` if already exists
- use a `try... catch block` to catch errors like `IOException` if file cannot be created for some reason

```java
import java.io.File;  // Import the File class
import java.io.IOException;  // Import the IOException class to handle errors

public class CreateFile {
  public static void main(String[] args) {
    try {
      File myObj = new File("filename.txt");
      if (myObj.createNewFile()) {
        System.out.println("File created: " + myObj.getName());
      } else {
        System.out.println("File already exists.");
      }
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }
}
```

To create a file in a specific directory, specify the path of the file

```java
File myObj = new File("C:\\Users\\MyName\\filename.txt");
```

## Write to a File

- use `FileWriter` class and its `write()` method to write some text to the file created above
- when done writing to the file, close it with the `close()` method

```java
import java.io.FileWriter;   // Import the FileWriter class
import java.io.IOException;  // Import the IOException class to handle errors

public class WriteToFile {
  public static void main(String[] args) {
    try {
      FileWriter myWriter = new FileWriter("filename.txt");
      myWriter.write("Files in Java might be tricky, but it is fun enough!");
      myWriter.close();
      System.out.println("Successfully wrote to the file.");
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }
}
```