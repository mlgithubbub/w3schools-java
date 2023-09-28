package Java00Tutorial.Java014Switch;

public class JavaSwitch {

    public static void main(String[] args) {

        String color = "blue";

        switch(color){

            case "blue":
                System.out.println("Blueberry flavor");
                break;
            case "red":
                System.out.println("Strawberry flavor");
                break;
            case "green":
                System.out.println("Lime flavor");
                break;
            default:
                System.out.println("Mystery flavor");
        }

    }
}
