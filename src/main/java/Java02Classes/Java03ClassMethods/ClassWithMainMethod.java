package Java02Classes.Java03ClassMethods;

import static Java02Classes.Java03ClassMethods.ClassWithAttributesAndMethods.myStaticMethod;

public class ClassWithMainMethod {


    public static void main(String[] args) {

        //Call a static method
        myStaticMethod();

        //Call a public method
        ClassWithAttributesAndMethods myClass = new ClassWithAttributesAndMethods();
        myClass.myPublicMethod();
    }
}
