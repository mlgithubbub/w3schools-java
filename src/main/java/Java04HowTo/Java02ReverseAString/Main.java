package Java04HowTo.Java02ReverseAString;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);
        String reversedString = "";
        System.out.println("Enter a string to have it reversed:");
        String userInput = myScanner.nextLine();

        for (int i = 0; i < userInput.length(); i++){
            reversedString = userInput.charAt(i) + reversedString;
        }

        System.out.println("The reversed string is: " + reversedString);

    }
}
