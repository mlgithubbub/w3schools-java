package Java04HowTo.Java03SumOfArrayElements;

public class Main {

    public static void main(String[] args) {

        int[] myIntArray = {1,2,3,4,5,6};
        int arraySum = 0;

        System.out.println(myIntArray.length);

        for (int i = 0; i < myIntArray.length; i++){
            arraySum = myIntArray[i] + arraySum;
        }

        System.out.println("The sum of all elements in the array is: " + arraySum);
    }
}
