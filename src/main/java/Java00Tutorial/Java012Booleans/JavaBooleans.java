package Java00Tutorial.Java012Booleans;

public class JavaBooleans {

    public static void main(String[] args) {

        //Boolean values
        boolean amIFemale = true;
        boolean isMyNameBob = false;
        System.out.println(amIFemale);
        System.out.println(isMyNameBob);

        //Boolean expressions
        System.out.println(5 > 1);
        System.out.println(5 < 1);
        System.out.println(5 == 5);

        //Boolean example
        String myName = "Bob";
        String requestedName = "Bob";
        System.out.println(myName == requestedName);

        //Boolean example with if statement
        if (myName == requestedName){
            System.out.println("Congratulations, you are Bob.");
        } else{
            System.out.println("Sorry, you are not Bob.");
        }


    }
}
