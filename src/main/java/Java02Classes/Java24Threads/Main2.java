package Java02Classes.Java24Threads;

//Use implements Runnable to create  new thread
public class Main2 implements Runnable{

    public static void main(String[] args) {
        Main2 main2Object = new Main2();
        Thread main2Thread = new Thread(main2Object);
        main2Thread.start();
        System.out.println("This code is running outside the Main2 thread.");

    }

    public void run() {
        System.out.println("This code is running inside the Main2 thread.");
    }
}
