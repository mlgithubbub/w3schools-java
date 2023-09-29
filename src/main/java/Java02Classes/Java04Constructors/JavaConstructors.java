package Java02Classes.Java04Constructors;

public class JavaConstructors {

    int x;
    int z;

    //Create a class constructor
    //Pass a parameter into the constructor to initialize an attribute
    public JavaConstructors(int y){
        x = 5; //Set the initial value of the class attribute
        z = y;
    }

    public static void main(String[] args) {
        JavaConstructors myClass = new JavaConstructors(10);
        System.out.println(myClass.x); //Print the value of x
        System.out.println(myClass.z);
    }

}
