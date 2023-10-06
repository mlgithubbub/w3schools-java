package Java02Classes.Java21WrapperClasses;

public class Main {

    public static void main(String[] args) {

        //Create and print wrapper classes
        Byte myByteObject = 127;
        Short myShortObject = 32767;
        Integer myIntegerObject = 2147483647;
        Long myLongObject = 9223372036854775807L;
        Double myDoubleObject = 55.55d;
        Float myFloatObject = 44.44f;
        Boolean myBooleanObject = true;
        Character myCharacterObject = 'M';

        System.out.println(myByteObject);
        System.out.println(myShortObject);
        System.out.println(myIntegerObject);
        System.out.println(myLongObject);
        System.out.println(myDoubleObject);
        System.out.println(myFloatObject);
        System.out.println(myBooleanObject);
        System.out.println(myCharacterObject);

        //Use -Value() methods
        System.out.println(myByteObject.byteValue());
        System.out.println(myShortObject.shortValue());
        System.out.println(myIntegerObject.intValue());
        System.out.println(myLongObject.longValue());
        System.out.println(myDoubleObject.doubleValue());
        System.out.println(myFloatObject.floatValue());
        System.out.println(myBooleanObject.booleanValue());
        System.out.println(myCharacterObject.charValue());

        //Convert wrapper objects to strings with toString() so you can use string methods like .length()
        System.out.println(myByteObject.toString().length());
        System.out.println(myShortObject.toString().length());
        System.out.println(myIntegerObject.toString().length());
        System.out.println(myLongObject.toString().length());
        System.out.println(myDoubleObject.toString().length());
        System.out.println(myFloatObject.toString().length());
        System.out.println(myBooleanObject.toString().length());
        System.out.println(myCharacterObject.toString().length());


    }
}
