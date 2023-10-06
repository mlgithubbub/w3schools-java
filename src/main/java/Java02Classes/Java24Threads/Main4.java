package Java02Classes.Java24Threads;

public class Main4 extends Thread{

    static int myInt = 0;
    public static void main(String[] args) {
        Main4 main4Thread = new Main4();
        main4Thread.start();

        //Use isAlive() to wait for thread to be done to avoid concurrency issues
        while (main4Thread.isAlive()){
            System.out.println("Waiting for thread to finish");
        }
        myInt++;
        System.out.println("Main3 first increment: "+ myInt);
        myInt++;
        System.out.println("Main3 second increment: "+ myInt);

    }


    public void run() {
        myInt++;
        System.out.println("Main3 thread first increment: "+myInt);
        myInt++;
        System.out.println("Main3 thread second increment: "+myInt);
    }
}
