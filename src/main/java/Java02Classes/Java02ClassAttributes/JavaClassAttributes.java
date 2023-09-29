package Java02Classes.Java02ClassAttributes;

public class JavaClassAttributes {

    //Define attributes
    int age = 5;
    String name = "Donna";
    int weight;

    public static void main(String[] args) {
        //Access attributes
        JavaClassAttributes myClass = new JavaClassAttributes();
        System.out.println(myClass.age);
        System.out.println(myClass.name);

        //Modify attributes
        JavaClassAttributes myClass2 = new JavaClassAttributes();
        myClass2.age = 39;
        myClass2.name = "Melanie";
        myClass2.weight = 65;
        System.out.println(myClass2.age);
        System.out.println(myClass2.name);
        System.out.println(myClass2.weight);


    }



}
