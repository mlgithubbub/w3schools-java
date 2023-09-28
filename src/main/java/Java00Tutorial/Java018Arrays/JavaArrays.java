package Java00Tutorial.Java018Arrays;

public class JavaArrays {

    public static void main(String[] args) {

        //Create an Array
        String[] myFavoriteFlowers = {"Magnolia", "Rose", "Peony"};

        //Access an element in an Array
        System.out.println(myFavoriteFlowers[0]);

        //Change an array element
        myFavoriteFlowers[1] = "Pansy";
        System.out.println(myFavoriteFlowers[1]);

        //Array length
        System.out.println(myFavoriteFlowers.length);

        //Loop through array with for
        for (int i = 0; i < myFavoriteFlowers.length; i++){
            System.out.println(myFavoriteFlowers[i]);
        }

        //Loop through array with for-each
        for (String i: myFavoriteFlowers
             ) {
            System.out.println(i);
        }

        //Create a multi-dimensional array
        String[][] students = {{"Rita", "Sally", "Susan"}, {"Bob", "Michael", "Richard"}};

        //Access elements in a multi-dimensional array
        System.out.println(students[0][1]);

        //Change element value in a multi-dimensional arry
        students[0][0] = "Melanie";
        System.out.println(students[0][0]);

        //Loop through a multi-dimensional array with a for loop
        for (int i = 0; i < students.length;i++){
            for (int j = 0; j < students[i].length; j++){
                System.out.println(students[i][j]);
            }
        }


    }
}
