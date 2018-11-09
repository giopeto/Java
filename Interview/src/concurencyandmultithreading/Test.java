package concurencyandmultithreading;

public class Test {

    public static void main(String[] args) {
        testThreads();
    }

    private static void testThreads() {
        Thread thread = new Thread();
        thread.start();

        threadWithThreadSubClass();
        threadWithAnonymousThreadSubclass();

    }

    private static void threadWithAnonymousThreadSubclass() {
        Thread thread = new Thread() {
            @Override
            public void run() {
                System.out.println("Anonymous thread");
            }
        };

        thread.start();
    }

    private static void threadWithThreadSubClass() {

        MyThread myThread = new MyThread();
        myThread.start();
    }
}


class MyThread extends Thread {

    public void run(){
        System.out.println("MyThread running");
    }
}