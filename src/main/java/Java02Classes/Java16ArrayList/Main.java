package Java02Classes.Java16ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        //Create an ArrayList of Strings
        ArrayList<String> friends = new ArrayList<String>();
        //Use .add() method
        friends.add("Angeliki");
        friends.add("Rubeji");
        friends.add("Zeynep");
        friends.add("Gabi");
        System.out.println(friends);

        //Access an item
        String bestFriend = friends.get(0);
        System.out.println(bestFriend);

        //Change an item
        friends.set(3, "Denia");
        System.out.println(friends.get(3));

        //Remove an item
        friends.remove(3);
        System.out.println(friends);

        //Loop through an ArrayList
        for (int i = 0; i < friends.size(); i++){
            System.out.println(friends.get(i));
        }

        //Loop through ArrayList with foreach loop
        for (String friend: friends
             ) {
            System.out.println(friend);
        }

        //Clear all the elements
        friends.clear();
        System.out.println(friends);

        //Find out the size of an ArrayList
        int numOfFriends = friends.size();
        System.out.println(numOfFriends);

        //Create an ArrayList of integers
        ArrayList<Integer> integerList = new ArrayList<Integer>();
        integerList.add(9);
        integerList.add(2);
        integerList.add(5);

        //Sort integer ArrayList
        Collections.sort(integerList);
        System.out.println(integerList);

        //Create an ArrayList of Characters
        ArrayList<Character> characterList = new ArrayList<Character>();
        characterList.add('M');
        characterList.add('m');
        characterList.add('O');
        characterList.add('o');
        characterList.add('n');
        characterList.add('N');

        //Sort Character ArrayList
        Collections.sort(characterList);
        System.out.println(characterList);

        //Create Boolean ArrayList
        ArrayList<Boolean> booleanList = new ArrayList<>();
        booleanList.add(true);
        booleanList.add(false);
        booleanList.add(true);
        booleanList.add(false);
        System.out.println(booleanList);

        //Sort a Boolean ArrayList
        Collections.sort(booleanList);
        System.out.println(booleanList);
    }
}
