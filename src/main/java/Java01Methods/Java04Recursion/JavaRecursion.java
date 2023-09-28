package Java01Methods.Java04Recursion;

public class JavaRecursion {


    public static void main(String[] args) {
        int result = sum(5);
        System.out.println(result);

        int result2 = sum(1,3);
        System.out.println(result2);
    }

    static int sum(int k){
        if (k>0){
            return k + sum(k -1);
        } else {
            return 0;
        }
    };

    static int sum(int start, int end){
        if(end > start){
            return end + sum(start, end-1);
        } else {
            return end;
        }
    }
}
