package Java02Classes.Java25Lambda;

import java.util.ArrayList;
import java.util.function.Consumer;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> myIntArrayList = new ArrayList<Integer>();
        myIntArrayList.add(1);
        myIntArrayList.add(2);
        myIntArrayList.add(3);
        myIntArrayList.add(4);
        myIntArrayList.forEach(n-> System.out.println(n));

        //Store lambda expressions in variables if the data type is an interface with only one method:

        //Store lambda expression in a void method
        LambdaInterface1 myLambda1 = () -> {
            System.out.println("Lambda void method");
        };
        myLambda1.myMethod();

        //Store lambda expression in a String method
        LambdaInterface2 myLambda2 = () -> {return "Lambda expression stored in String method with no parameters";};
        System.out.println(myLambda2.myMethod());

        //Store lambda expression in an int method with two parameters
        LambdaInterface3 myLambda3 = (int x, int y) -> {
            return x + y;
        };
        System.out.println("Lambda method of int return type with two parameters " + myLambda3.myMethod(5,10));

        //Store lambda expression in built-in Consumer interface
        Consumer<String> myLambda4 = (n) -> {
            System.out.println(n);
        };
        myLambda4.accept("Java Consumer lambda method with String return type");

        Consumer<Integer> myLambda5 = (n) -> {
            System.out.println(n);
        };
        myIntArrayList.forEach(myLambda5);


    }






}
