package Java02Classes.Java05Modifiers;

//Declare a public class: accessible by any other class
public class PublicClass {

//    public static void main(String[] args) {
//
//        PublicClass myClass = new PublicClass();
//
//        //PUBLIC accessible by any other class
//        System.out.println(myClass.publicAttribute);
//        System.out.println(myClass.publicFinalAttribute); //cannot be overridden/modified
//        System.out.println(PublicClass.publicStaticAttribute); //belongs to class instead of object
//        myClass.publicMethod();
//        myClass.publicFinalMethod();
//        publicStaticMethod();//belongs to class instead of object
//
//        //PRIVATE accessible only within declared class
//        System.out.println(myClass.privateAttribute);
//        myClass.privateMethod();
//
//        //DEFAULT accessible in the same package
//        System.out.println(myClass.defaultAttribute);
//        System.out.println(myClass.finalAttribute); //cannot be overridden/modified
//        System.out.println(PublicClass.staticAttribute); //belongs to class instead of object
//        myClass.defaultMethod();
//        myClass.finalMethod(); //cannot be overridden/modified
//        staticMethod(); //belongs to class instead of object
//
//        //PROTECTED accessible in the same package and by subclasses
//        System.out.println(myClass.protectedAttribute);
//        myClass.protectedMethod(); //accessible in the same package and by subclasses
//
//        //ABSTRACT only for inherited classes, create an object of the inheriting class to access methods and attributes
//        SubclassOfAbstractClass myInheritingClass = new SubclassOfAbstractClass();
//        System.out.println(myInheritingClass.abstractAttribute);
//        myInheritingClass.abstractMethod();
//
//    }

    public String publicAttribute = "Public Attribute"; //Declare public attribute: accessible by any other class
    private String privateAttribute = "Private Attribute";  //Declare a private attribute: accessible only within
    // declared class
    String defaultAttribute = "Default Attribute"; //Declare a default attribute: accessible in the same package
    String protectedAttribute = "Protected Attribute"; //Declare a protected attribute: accessible in the same package
    // and by subclasses
    final String finalAttribute = "Final Attribute"; //Declare a final attribute: cannot be overridden/modified
    public final String publicFinalAttribute = "Public Final Attribute"; //Declare a final attribute: cannot be
    // overridden/modified
    static String staticAttribute = "Static Attribute"; //Declare a static attribute: belongs to a class instead of an
    // object
    public static String publicStaticAttribute = "Public Static Attribute"; //Declare a static attribute: belongs to a
    // class
    // instead of an
    // object


    //Declare a public method: accessible by any other class
    public void publicMethod(){
        System.out.println("Public Method");
    }
    //Declare a private method: only accessible within declared class
    private void privateMethod(){
        System.out.println("Private Method");
    }
    //Declare a default method: only accessible within the same package
    void defaultMethod(){
        System.out.println("Default Method");
    }
    //Declare a protected method: accessible in the same package and subclasses
    protected void protectedMethod(){
        System.out.println("Protected Method");
    }
    //Declare a final method: cannot be overridden/modified
    final void finalMethod(){
        System.out.println("Final Method");
    }
    //Declare a public final method: cannot be overridden/modified
    public final void publicFinalMethod(){
        System.out.println("Public Final Method");
    }
    //Declare a static method: belong to the class instead of an object
    static void staticMethod(){
        System.out.println("Static Method");
    }
    //Declare a public static method: belong to the class instead of an object
    public static void publicStaticMethod(){
        System.out.println("Public Static Method");
    }

}
