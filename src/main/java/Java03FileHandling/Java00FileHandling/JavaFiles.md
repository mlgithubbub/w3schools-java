# Java Files

- `file handling` is an important part of any application
- java has several methods for creating, reading, updating and deleting files

To use the `File` class, create an object of the class and specify the filename or directory name

```java
import java.io.File;  // Import the File class

File myObj = new File("filename.txt"); // Specify the filename
```

Useful methods of the `File` class:

| method            | return type | description                                  |
|-------------------|-------------|----------------------------------------------|
| canRead()         | Boolean     | tests whether file is readable               |
| canWrite()        | Boolean     | tests whether file is writable               |
| createNewFile()   | Boolean     | creates an empty file                        |
| delete()          | Boolean     | deletes a file                               |
| exists()          | Boolean     | tests whether file exists                    |
| getName()         | String      | returns file name                            |
| getAbsolutePath() | String      | returns absolute path name of file           |
| length()          | Long        | returns size of the file in bytes            |
| list()            | String[]    | returns array of file names in the directory |
| mkdir()           | Boolean     | creates a directory                          |
