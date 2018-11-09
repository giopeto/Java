package concurencyandmultithreading;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class ThreadExample {
    static Map<Integer, String> map = new HashMap();

    public static void main(String[] args){

        System.out.println(Thread.currentThread().getName());
        for(int i=0; i<10; i++){
            new Thread("" + i){
                public void run(){
                    System.out.println("Thread: " + getName() + " running");
                    map.put(new Random().nextInt(200), getName());
                }
            }.start();
        }
    }
}
