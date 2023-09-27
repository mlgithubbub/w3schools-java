package Java008TypeCasting;

public class JavaTypeCasting {

    public static void main(String[] args) {

        //Widening Casting
        int myInt = 5;
        double myDouble = myInt;

        System.out.println(myInt);
        System.out.println(myDouble);

        //Narrowing Casting
        double myDouble2 = 9.78d;
        int myInt2 = (int) myDouble2;

        System.out.println(myInt2);
        System.out.println(myDouble2);
    }
}
