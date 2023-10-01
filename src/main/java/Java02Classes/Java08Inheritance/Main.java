package Java02Classes.Java08Inheritance;

public class Main {

    public static void main(String[] args) {

        Pencil myPencil = new Pencil();

        myPencil.utensilDescription("red", 10);
        myPencil.sharpenPencil(true);
        System.out.println(myPencil.sharp);
    }
}
