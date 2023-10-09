package Java04HowTo.Java01CountWords;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Type a sentence:");
        String userInput = scanner.nextLine();

        int numOfWords = userInput.split("\s").length;

        System.out.println("This sentence has " + numOfWords + " words in it");

    }
}
