package Java00Tutorial.Java016ForLoop;

public class JavaForLoop {

    public static void main(String[] args) {

        //For Loop
        for (int x = 5; x <= 100; x += 5){
            System.out.println(x);
        }

        //Nested For Loop
        for (int i = 0; i <= 4; i++){
            System.out.print("duh, duh, duh, duh, duh,");
            for (int j = 0; j <= 1; j++){
                System.out.print(" DUH, DUH!");
            }
            System.out.println();
        }

    }
}
