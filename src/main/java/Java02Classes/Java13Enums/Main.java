package Java02Classes.Java13Enums;

public class Main {

    public static void main(String[] args) {

        //Access an enum constant
        Rainbow firstColor = Rainbow.RED;
        System.out.println(firstColor);

        //Use an enum in a switch statement
        switch (firstColor){
            case RED:
                System.out.println("red");
                break;
            case ORANGE:
                System.out.println("orange");
                break;
            case YELLOW:
                System.out.println("yellow");
                break;
            case GREEN:
                System.out.println("green");
                break;
            case BLUE:
                System.out.println("blue");
                break;
            case PURPLE:
                System.out.println("purple");
                break;
        }

        //Loop through an enum
        for (Rainbow color : Rainbow.values()){
            System.out.println(color);
        }


    }
}
