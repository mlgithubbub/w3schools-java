package Java02Classes.Java14UserInput;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Enter your first name");
        String firstName = myScanner.nextLine();
        System.out.println("Enter your middle name");
        String middleName = myScanner.nextLine();
        System.out.println("Enter your last name");
        String lastName = myScanner.nextLine();
        System.out.println("Enter your age");
        int age = myScanner.nextInt();
        System.out.println("Are you single? true/false");
        boolean isSingle = myScanner.nextBoolean();

        System.out.println("First name: "+ firstName);
        System.out.println("Middle name: "+ middleName);
        System.out.println("Last name: "+ lastName);
        System.out.println("Age: " + age);
        System.out.println("Single: "+ isSingle);


    }
}
