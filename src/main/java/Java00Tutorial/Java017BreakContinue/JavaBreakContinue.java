package Java00Tutorial.Java017BreakContinue;

public class JavaBreakContinue {

    public static void main(String[] args) {

        //Break
        for (int i = 0; i < 10; i++){
            if (i == 5){
                System.out.println("Giving up halfway at 5");
                break;
            }
            System.out.println(i);
        }
        //Continue
        for (int i = 0; i < 10; i++){
            if (i == 5){
                System.out.println("Skipping 5 for fun ");
                continue;
            }
            System.out.println(i);
        }
    }
}
