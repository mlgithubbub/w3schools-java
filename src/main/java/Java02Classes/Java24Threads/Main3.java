package Java02Classes.Java24Threads;

//See concurrency problems when attributes in main and another thread are similar
public class Main3 extends Thread{

    static int myInt = 0;
    public static void main(String[] args) {
        Main3 main3Thread = new Main3();
        main3Thread.start();
        myInt++;
        System.out.println("Main3 first increment: "+ myInt);
        myInt++;
        System.out.println("Main3 second increment: "+ myInt);


    }

    public void run() {
        //Code inside of main3Thread
        myInt++;
        System.out.println("Main3 thread first increment: "+myInt);
        myInt++;
        System.out.println("Main3 thread second increment: "+myInt);
    }

    //Notice that the order the ++ happens in is different sometimes
}
