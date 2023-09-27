# Java Getting Started

## Java Install

- check if you have Java installed: `java -version`
- if not installed, download for free at: oracle.com
- in this tutorial we will write Java code in a text editor, however you can write Java in an IDE such as: Intellij 
  IDEA, Netbeans, or Eclipse (useful when managing larger collections of Java files)

## Setup for Windows

1. Control Panel > System and Security > System > Advanced System Settings > System Properties
2. Advanced > Environment Variables > Path > Edit > New
3. Add the path where Java is installed, followed by `\bin` > OK > save the settings
4. `java -version`

## Java Quickstart

- every application begins with a class name
- the class name must match the file name
- let's create our first Java file `Main.java` with a text editor:
```java
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
    }
}
```
- save the code as `Main.java`
- terminal: `javac Main.java` to compile your code
- terminal: `java Main` to run the file
  - NOTE, in my case: `java Java002GetStarted.Main` (execute from the java folder)

Congratulations on writing and executing your first Java program!