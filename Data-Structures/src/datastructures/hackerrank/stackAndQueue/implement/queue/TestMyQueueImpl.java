package datastructures.hackerrank.stackAndQueue.implement.queue;

public class TestMyQueueImpl {

    public static void main(String[] args) {
        MyQueue myQueue = new MyQueueRecursiveImpl();
        MyQueueImpl myQueue1 = new MyQueueImpl();
        testQueue(myQueue1);

    }

    private static void testQueue(MyQueue myQueue) {
        myQueue.add(1);
        myQueue.add(2);
       /* myQueue.add(3);
        myQueue.add(4);
        myQueue.add(5);
        myQueue.add(6);
        myQueue.add(7);*/

        System.out.println(myQueue.remove());
        System.out.println(myQueue.remove());
       /* System.out.println(myQueue.remove());
        System.out.println(myQueue.remove());
        System.out.println(myQueue.remove());
        System.out.println(myQueue.remove());
        System.out.println(myQueue.remove());*/
    }
}
