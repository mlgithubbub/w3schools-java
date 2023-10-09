package Java04HowTo.Java04AreaOfRectangle;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);

        System.out.println("Enter the length of the rectangle:");
        double length = myScanner.nextDouble();

        System.out.println("Enter the width of the rectangle:");
        double width = myScanner.nextDouble();

        System.out.println("The area is " + length + " * " + width + " : " + (length * width));

    }
}
