package Java00Tutorial.Java006Variables;

public class JavaVariables {

    public static void main(String[] args) {

        //Declare variables of different data types:
        String myName = "Melanie";
        String lastName = "Roberts";
        int myAge = 39;
        float mySalary = 2999.99F;
        char firstLetterOfMyName = 'M';
        boolean amITooFat = true;

        //Declare variable and initialize later:
        float myWeight;

        //Assign a new value to a variable
        mySalary = 9999.99F;

        //Use final to make a variable constant:
        final boolean amIGreat = true;

        //Print text and variable with +
        System.out.println("Hello, there. My name is " + myName);

        //Add two variables with +
        System.out.println(myName + " " + lastName);

        //Do math with +
        System.out.println(5+5);

        //Declare multiple variables on one line
        String firstName = "Melanie", middleName = "Rose", familyName = "Roberts";
        System.out.println(firstName+middleName+familyName);

        //Give multiple variables the same values
        String fName, mName, lName;
        fName = mName = lName = "Bob";
        System.out.println("Hello, my name is " +fName+mName+lName);


    }
}
