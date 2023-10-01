package Java02Classes.Java10InnerClasses;

public class Main {
    public static void main(String[] args) {
        OuterClass myOuterClass = new OuterClass();
        OuterClass.InnerClass myInnerClass = myOuterClass.new InnerClass();
        //OuterClass.PrivateInnerClass myPrivateInnerClass = myOuterClass.new PrivateInnerClass(); //error
        //System.out.println(myOuterClass.x + myInnerClass.y + myPrivateInnerClass.z); //error
        System.out.println(myOuterClass.x + myInnerClass.y);
    }

}
