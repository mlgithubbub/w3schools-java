package Java01Methods.Java03Scope;

import org.w3c.dom.ls.LSOutput;

public class JavaScope {

    //Method scope
    static int myMethod(){
        int result = 5;
        System.out.println(result);
        return result;
    }

    public static void main(String[] args) {
        //result is not available here
        //System.out.println(result);

        myMethod();

        //Block scope
        {
            String myName = "Bob";
            System.out.println(myName);
        }
        //myName is not available outside of the block
        //System.out.println(myName);

    }
}
