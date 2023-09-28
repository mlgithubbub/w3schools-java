package Java01Methods.Java02MethodOverloading;

public class JavaMethodOverloading {

    //Overload a method
    static int myMethod(int x){
        int result = x;
        return result;
    }

    static int myMethod(int x, int y){
        int result = x * y;
        return result;
    }

    static int myMethod(int x, int y, int z){
        int result = x * y * z;
        return result;
    }

    static double myMethod(double x, double y){
        double result = x * y;
        return result;
    }
    public static void main(String[] args) {

        //Call overloaded methods
        System.out.println(myMethod(5));
        System.out.println(myMethod(5,5));
        System.out.println(myMethod(5,5,5));
        System.out.println(myMethod(5.1, 2.3));
    }
}
