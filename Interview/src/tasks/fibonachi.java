package tasks;

public class fibonachi {

    static int a = 0;
    static int b = 1;
    static int count = 5;

    public static void main(String[] args) {
        System.out.print(a + " " + b);
        printFibonacci(count - 2);

    }

    private static void printFibonacci(int counter) {
        if(counter > 0) {
            int c = a + b;
            System.out.print(" " + c);
            a = b;
            b = c;
            printFibonacci(--counter);
        }
    }
}
