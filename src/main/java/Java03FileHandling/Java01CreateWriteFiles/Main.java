package Java03FileHandling.Java01CreateWriteFiles;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        //Create a file and use a try catch block to catch any errors
        try {
            File myNewFile = new File("/Users/morganlinn/IdeaProjects/w3schools-java/farts.txt");

            if (myNewFile.createNewFile()) {
                System.out.println("File created: " + myNewFile.getAbsolutePath());
            } else {
                System.out.println("File was not created.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        //Write to the file with the FileWriter class's write() method

        try {
            FileWriter myWriter = new FileWriter("farts.txt");
            myWriter.write("Lots of farting going on in this file...");
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e){
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
