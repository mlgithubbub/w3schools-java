package Java02Classes.Java18HashMap;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        //Create a HashMap object
        HashMap<String, LocalDate> birthdayList = new HashMap<String, LocalDate>();


        //Add items to the HashMap
        birthdayList.put("Margot", LocalDate.of(1984, 03, 18));
        birthdayList.put("Raymond", LocalDate.of(1980, 05, 11));
        birthdayList.put("Susie", LocalDate.of(1992, 12, 20));
        birthdayList.put("Bart", LocalDate.of(1975, 10, 01));

        //Access an item
        LocalDate margotBday = birthdayList.get("Margot");
        System.out.println(margotBday);

        //Remove an item
        birthdayList.remove("Bart");

        //Find size of HashMap
        int numOfBirthdays = birthdayList.size();
        System.out.println(numOfBirthdays);


        //Loop through the hashmap
        //Print keys
        for (String i: birthdayList.keySet()
             ) {
            System.out.println(i);
        }

        //Print values
        for (LocalDate i: birthdayList.values()
             ) {
            System.out.println(i);
        }

        //Print keys and values
        for (String i: birthdayList.keySet()
             ) {
            System.out.println("key: "+i+ ", value: "+ birthdayList.get(i));
        }

        //Clear the list
        birthdayList.clear();
        numOfBirthdays= birthdayList.size();
        System.out.println(numOfBirthdays);
    }





}
