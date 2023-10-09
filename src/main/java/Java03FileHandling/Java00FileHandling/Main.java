package Java03FileHandling.Java00FileHandling;

import java.io.File;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        //Create a File object and use some File methods
        File myFile = new File("myFirstFile.txt");

        System.out.println("File exists: " + myFile.exists());

        try {

//            System.out.println("Creating the directory: " + myFile.mkdir());
//            System.out.println("See files in directory: " + myFile.list());
//            System.out.println("Files in this directory: ");
//            for (String f: myFile.list()
//                 ) {
//                System.out.println(f);
//
//            }
            if (myFile.createNewFile()){
                System.out.println("File does not already exist. Creating the file now...");
            } else {
                System.out.println("File already exists. Not creating the file.");
            }
            System.out.println("File exists: " + myFile.exists());
            System.out.println("Name of file: " + myFile.getName());
            System.out.println("Absolute path of file: " + myFile.getAbsolutePath());
            System.out.println("Path of file: " + myFile.getPath());
            System.out.println("File is readable: " + myFile.canRead());
            System.out.println("File is writable: " + myFile.canWrite());
            System.out.println("Size of file in bytes: " + myFile.length());
            System.out.println("Deleting the file: " + myFile.delete());

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
