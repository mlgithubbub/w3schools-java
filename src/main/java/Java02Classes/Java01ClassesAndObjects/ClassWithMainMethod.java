package Java02Classes.Java01ClassesAndObjects;

public class ClassWithMainMethod {

    public static void main(String[] args) {

        ClassWithAttributesAndMethods myObj = new ClassWithAttributesAndMethods();
        System.out.println(myObj.x);
        int myObjSum = myObj.sum(5,5);
        System.out.println(myObjSum);

    }

}
