package Java03FileHandling.Java04DeleteFiles;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {




            File myFolder = new File("/Users/morganlinn/IdeaProjects/w3schools-java/createdfiles");
            File myFile = new File("/Users/morganlinn/IdeaProjects/w3schools-java/createdfiles/newfile.txt");
            if (myFolder.mkdir()){
                System.out.println("Folder " + myFolder.getAbsolutePath() + " successfully created.");
            } else {
                System.out.println("Folder " + myFolder.getAbsolutePath() + " already exists.");
            }
            try {
                if (myFile.createNewFile()) {
                    System.out.println("File: " + myFile.getName() + "successfully created.");
                } else if (myFile.exists()) {
                    System.out.println("File could not be created, because it already exists.");
                } else {
                    System.out.println("File could not be created for some other reason.");
                }
            } catch (IOException e) {
                System.out.println("an error occured");
                e.printStackTrace();
            }

        System.out.println();

        System.out.println("Would you like to delete the file? Type 'y' yes and 'n' for no");
        Scanner userInput1 = new Scanner(System.in);
        if (userInput1.nextLine().equals("y")){

            if (myFile.delete()){
                System.out.println("The file " + myFile.getName() + " has been successfully deleted");
            } else {
                System.out.println("The file " + myFile.getName() + " still exists.");
            }
        } else {
            System.out.println("The file " + myFile.getName() + " has been retained.");
        }





        System.out.println("Would you like to delete the folder? Type 'y' yes and 'n' for no");
        Scanner userInput2 = new Scanner(System.in);
        if (userInput2.nextLine().equals("y")){
            if (myFolder.delete()){
                System.out.println("The folder " + myFolder.getAbsolutePath() + " has been successfully deleted");
            } else {
                System.out.println("The folder " + myFolder.getAbsolutePath() + " still exists.");
            }
        }else {
            System.out.println("The folder " + myFolder.getAbsolutePath() + " has been retained.");
        }





    }
}
