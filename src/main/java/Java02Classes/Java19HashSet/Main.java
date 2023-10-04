package Java02Classes.Java19HashSet;

import java.util.HashSet;

public class Main {

    public static void main(String[] args) {
        //Create a java HashSet
        HashSet<String> rainbowColors = new HashSet<String>();

        //Add items to the HashSet
        rainbowColors.add("red");
        rainbowColors.add("orange");
        rainbowColors.add("yellow");
        rainbowColors.add("green");
        rainbowColors.add("blue");
        rainbowColors.add("purple");
        rainbowColors.add("purple");

        //Check if an item exists
        boolean redExists = rainbowColors.contains("red");
        System.out.println(redExists);
        boolean blackExists = rainbowColors.contains("black");
        System.out.println(blackExists);

        //Remove an item
        rainbowColors.remove("blue");

        //Check the HashSet size
        int numOfColors = rainbowColors.size();
        System.out.println(numOfColors);

        //Loop through a HashSet
        for (String i: rainbowColors
             ) {
            System.out.println(i);
        }


    }
}
