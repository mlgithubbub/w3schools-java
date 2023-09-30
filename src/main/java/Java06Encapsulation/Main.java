package Java06Encapsulation;

public class Main {

    public static void main(String[] args) {
        JavaEncapsulation myClass = new JavaEncapsulation();
        //System.out.println(myClass.myAge); //error
        //myClass.myAge = 40; //error

        int myRealAge = myClass.getMyAge();
        System.out.println(myRealAge);
        myClass.setMyAge(30);
        int mySetAge = myClass.getMyAge();
        System.out.println(mySetAge);

    }
}
