package Java02Classes.Java12Interface;

public class Pig implements Animal, Mammal{

    public void makeSound(){
        System.out.println("oink");
    }
    public void move(){
        System.out.println("frolick");
    }
    public void breath(){
        System.out.println("snort");
    }
    public void nurse(){
        System.out.println("nursing");
    }
}
