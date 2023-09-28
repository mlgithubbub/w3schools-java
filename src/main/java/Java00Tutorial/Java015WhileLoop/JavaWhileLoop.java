package Java00Tutorial.Java015WhileLoop;

public class JavaWhileLoop {

    public static void main(String[] args) {

        int i = 0;
        //While Loop
        while (i < 5){
            System.out.println(i);
            i++;
        }

        i = 0;
        //Do/While Loop
        do {
            System.out.println(i);
            i++;
        } while (i < 5);
    }
}
