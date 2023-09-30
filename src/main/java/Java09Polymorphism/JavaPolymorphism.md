# Java Polymorphism

## Java Polymorphism

- means 'many forms'
- occurs when many classes are related to each other by inheritance
- `inheritance` lets us inherit attributes and methods from another class
- `polymorphism` uses those methods to perform different tasks
- example: a `superclass` called `Animal` has a method called `animalSound()`; `subclasses` of animals could be Pigs,
  Cats, Dogs, Birds, etc. and they all have their own implementation of `animalSound()`

```java
class Animal {
  public void animalSound() {
    System.out.println("The animal makes a sound");
  }
}

class Pig extends Animal {
  public void animalSound() {
    System.out.println("The pig says: wee wee");
  }
}

class Dog extends Animal {
  public void animalSound() {
    System.out.println("The dog says: bow wow");
  }
}
```

Now create Pig and Dog objects and call the `animalSound()` method on them:

```java
class Animal {
  public void animalSound() {
    System.out.println("The animal makes a sound");
  }
}

class Pig extends Animal {
  public void animalSound() {
    System.out.println("The pig says: wee wee");
  }
}

class Dog extends Animal {
  public void animalSound() {
    System.out.println("The dog says: bow wow");
  }
}

class Main {
  public static void main(String[] args) {
    Animal myAnimal = new Animal();  // Create a Animal object
    Animal myPig = new Pig();  // Create a Pig object
    Animal myDog = new Dog();  // Create a Dog object
    myAnimal.animalSound();
    myPig.animalSound();
    myDog.animalSound();
  }
}
```

- Inheritance and Polymorphism help with code reusability: reuse an existing class when you create a new one

