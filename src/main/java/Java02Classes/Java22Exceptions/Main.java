package Java02Classes.Java22Exceptions;

public class Main {

    public static void main(String[] args) {
        //Try...catch...finally
        try {
            String[] myFriends = {"Bob", "Rita", "Mary"};
            System.out.println(myFriends[3]);
        } catch (Exception e) {
            System.out.println("You don't have that many friends!");
        } finally {
            System.out.println("Here is the finally statement after the try-catch");
        }

        //Throw
        checkIfBob("Bob");


    }

    static void checkIfBob(String name) {
        if (name != "Bob") {
            throw new SecurityException("You are not Bob.");
        } else {
            System.out.println("Hi, Bob!");
        }
    }
}
