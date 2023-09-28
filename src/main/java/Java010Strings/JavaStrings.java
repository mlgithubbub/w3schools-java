package Java010Strings;

public class JavaStrings {

    public static void main(String[] args) {

        //String length() method
        String myString = "0123456789";
        System.out.println("My string is "+ myString.length() + " characters long.");

        //toUpperCase()
        String myString2 = "hi, there. this is a lowercase string.";
        System.out.println(myString2.toUpperCase());
        System.out.println(myString2.toLowerCase());

        //indexOf()
        System.out.println(myString2.indexOf("hi"));

        //String concatenation with +
        String firstName = "Barbara";
        String lastName = "Jones";
        System.out.println(firstName+" "+lastName);

        //String concatenation with concat()
        System.out.println(firstName.concat(" " + lastName));

        // + with numbers
        System.out.println(5+5);

        // + with strings
        System.out.println("hi"+"5");

        // + with numbers and strings
        System.out.println("hi"+5); //is converted into a String

        //Escape sequences
        System.out.println("She thought \'I know\', \nbut said, \"I don't know\". ");
    }
}
