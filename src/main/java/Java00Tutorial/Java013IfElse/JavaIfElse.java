package Java00Tutorial.Java013IfElse;

public class JavaIfElse {

    public static void main(String[] args) {

        int x = 5;

        //if.. else if.. else..
        if (x >= 10){
            System.out.println(x + " is greater than or equal to 10");
        } else if (x >= 5){
            System.out.println(x + " is greater than or equal to 5");
        } else {
            System.out.println(x + " is less than 5");
        }

        //Ternary Operator
        int age = 39;
        String result = (age >= 40)? "Over the hill": "Still young";
        System.out.println(result);
    }
}
