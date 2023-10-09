package Java04HowTo.Java00AddTwoNumbers;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int x = myScanner.nextInt();
        System.out.println("Enter another number:");
        int y = myScanner.nextInt();

        System.out.println("The sum of " + x + " and " + y + " is "+  (x + y ));

    }
}
