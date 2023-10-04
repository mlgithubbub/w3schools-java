package Java02Classes.Java17LinkedList;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        //Create a LinkedList
        LinkedList<String> shirtColors = new LinkedList<String>();
        shirtColors.add("pink");
        shirtColors.add("black");
        shirtColors.add("beige");
        shirtColors.add("striped");
        System.out.println(shirtColors);

        //Use addFirst()
        shirtColors.addFirst("navy");
        System.out.println(shirtColors);

        //Use addLast()
        shirtColors.addLast("white");
        System.out.println(shirtColors);

        //Use removeFirst()
        shirtColors.removeFirst();
        System.out.println(shirtColors);

        //Use removeLast()
        shirtColors.removeLast();
        System.out.println(shirtColors);

        //Use getFirst()
        String firstColor = shirtColors.getFirst();
        System.out.println(firstColor);

        //Use getLast()
        String lastColor = shirtColors.getLast();
        System.out.println(lastColor);

    }
}
