package Java01Methods.Java01MethodParameters;

public class JavaMethodParameters {

    //Static void method with a parameter
    static void brownFamilyMethod(String firstName){
        System.out.println(firstName + " Brown");
    }

    //Static void method with multiple parameters
    static void boxDimensions(int width, int length, int height){
        System.out.println("The box is "+ width + " cm wide by " + length +" cm long by "+ height + " cm tall");
    }

    //Static method with a return value
    static void boxVolume(int width, int length, int height){
        System.out.println("The box's volume is: " + (width*length*height));
    }

    //Static method with a return value and result stored in a variable (recommended)
    static void boxVolumeEnhanced(int width, int length, int height){
        int volume = width * length * height;
        System.out.println("The box's volume is: " + volume);
    }
    public static void main(String[] args) {

        //Call static void method with a parameter
        brownFamilyMethod("Lisa");
        brownFamilyMethod("Bob");
        brownFamilyMethod("Martha");

        //Call static void method with multiple parameters
        boxDimensions(5,6,7);
        boxDimensions(10,20,30);

        //Call static method with return value
        boxVolume(5,6,7);
        boxVolume(10,20,30);

        //Call static method with return value with result stored in a variable (recommended)
        boxVolumeEnhanced(5,6,7);
        boxVolumeEnhanced(10,20,30);
    }
}
