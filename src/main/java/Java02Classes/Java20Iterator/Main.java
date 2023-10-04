package Java02Classes.Java20Iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {

        //Make a collection
        ArrayList<String> shades = new ArrayList<String>();
        shades.add("dark");
        shades.add("medium");
        shades.add("light");

        //Get the iterator
        Iterator<String> shadesIterator0 = shades.iterator();
        Iterator<String> shadesIterator1 = shades.iterator();
        Iterator<String> shadesIterator2 = shades.iterator();


        //Use next() to print the first item
        System.out.println("shadesIterator0: " + shadesIterator0.next());

        //Use hasnext() and next() to loop through the collection
        while(shadesIterator1.hasNext()){
            System.out.println("shadesIterator1.next: " + shadesIterator1.next());
        }

        System.out.println(shades);

        //Remove items from the collection while looping
        while (shadesIterator2.hasNext()){
            String i = shadesIterator2.next();
            if (i == "medium"){
                shadesIterator2.remove();
            }
        }
        Iterator<String> shadesIterator3 = shades.iterator();

        System.out.println(shades);

        //Use hasnext() and next() to loop through the collection
        while(shadesIterator3.hasNext()){
            System.out.println("shadesIterator3.next: " + shadesIterator3.next());
        }

    }
}
