package Java009Operators;

public class JavaOperators{

    public static void main(String[] args) {

        int myInt = 6;
        int myInt2 = 5;

        //Add two values with +
        System.out.println(5+6);

        //Add a value and a variable with +
        System.out.println(5 + myInt);

        //Add a variable and a variable
        System.out.println(myInt2 + myInt);

        //Arithmetic Operators
        System.out.println(5+5);
        System.out.println(5*5);
        System.out.println(10/2);
        System.out.println(10%3);
        myInt++;
        myInt--;
        System.out.println(myInt + "++ = " + (myInt++)); //Hmm...
        System.out.println(myInt + "-- = " + (myInt--)); //Hmm...

        //Assignment Operators
        System.out.println(myInt + " + 5 = " + (myInt += 5));
        System.out.println(myInt + " - 5 = " + (myInt -= 5));
        System.out.println(myInt + " * 5 = " + (myInt *= 5));
        System.out.println(myInt + " / 5 = " + (myInt /= 5));
        System.out.println(myInt + " % 5 = " + (myInt %= 5));
        System.out.println(myInt + " ^ 5 = " + (myInt ^= 5));
        System.out.println(myInt + " & 5 = " + (myInt & 5)); //?
        System.out.println(myInt + " | 5 = " + (myInt | 5)); //?
        System.out.println(myInt + " >> 5 = " + (myInt >> 5)); //?
        System.out.println(myInt + " << 5 = " + (myInt << 5)); //?

        //Comparison Operators
        System.out.println(myInt + " == 5 = " + (myInt == 5));
        System.out.println(myInt + " != 5 = " + (myInt != 5));
        System.out.println(myInt + " > 5 = " + (myInt > 5));
        System.out.println(myInt + " < 5 = " + (myInt < 5));
        System.out.println(myInt + " >= 5 = " + (myInt >= 5));
        System.out.println(myInt + " <= 5 = " + (myInt <= 5));

        //Logical Operators
        System.out.println(myInt + " == 5 && 5 == 5 " + (myInt == 5 && 5 == 5));
        System.out.println(myInt + " == 5 || 5 == 5 " + (myInt == 5 || 5 == 5));
        System.out.println("!(" + myInt + " == 5 || 5 == 5) " + (myInt == 5 || 5 == 5));

    }


}