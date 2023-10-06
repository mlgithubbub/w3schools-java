package Java02Classes.Java24Threads;

//Use extends Thread to create a new thread
public class Main1 extends Thread{
    public static void main(String[] args) {
        Main1 main1Thread = new Main1();
        main1Thread.start();
        System.out.println("This code is running outside the Main1 thread");
    }

    public void run() {
        System.out.println("This code is running inside the Main1 thread.");
    }

}
