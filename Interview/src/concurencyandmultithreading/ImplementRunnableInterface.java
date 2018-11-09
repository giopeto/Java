package concurencyandmultithreading;

public class ImplementRunnableInterface {
    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);
        thread.start();

        /* Anonymous implementation of runnable */
        Runnable myAnnonymousRunnable =
                new Runnable(){
                    public void run(){
                        System.out.println("Runnable running");
                    }
                };
        /* Lambda runnable */
        Runnable runnable =
                () -> { System.out.println("Lambda Runnable running"); };
    }
}
