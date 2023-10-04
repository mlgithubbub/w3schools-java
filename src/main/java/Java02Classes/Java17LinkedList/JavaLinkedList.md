# Java LinkedList

## Java LinkedList

- the `LinkedList` class is almost identical to `ArrayList`
```java

// Import the LinkedList class
import java.util.LinkedList;

public class Main {
  public static void main(String[] args) {
    LinkedList<String> cars = new LinkedList<String>();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Mazda");
    System.out.println(cars);
  }
}
```

## ArrayList vs. LinkedList

| `LinkedList`  vs. `ArrayList`                                |
|--------------------------------------------------------------|
| a collection which can contain many objects of the same type | a collection which can contain many objects of the same type |
| have same methods because both implement the `List` interface |
| built DIFFERENTLY                                            |

### How the ArrayList works

- this class has a regular array inside it
- when an element is added, it is placed into the array
- if the array is not big enough, a new larger array is created to replace the old one and the old one is removed

### How the LinkedList works

- stores items in containers
- the list has a link to the first container
- each container has a link to the next container
- to add an element to the list, the element is placed into a new container and that container is linked to one of 
  the other containers in the list

-> Use an `ArrayList` to store and access data, use a `LinkedList`to manipulate data

## LinkedList Methods

- in many cases `ArrayList` is more efficient, because it is common to need to access random items in the list
- `LinkedList` provides several methods to do operations more efficiently

| method        | description                        |
|---------------|------------------------------------|
| addFirst()    | add item to beginning of list      |
| addLast()     | add item to end of list            |
| removeFirst() | remove item from beginning of list |
| removeLast()  | remove item from end of list       |
| getFirst()    | get item from beginning of list    |
| getLast()     | get item from end of list          |


