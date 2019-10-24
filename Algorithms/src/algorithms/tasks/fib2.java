package algorithms.tasks;

public class fib2 {


    public static void main(String[] args) {
        //Xn = Xn-1 + Xn-2
        /* Print the n fibonachi number n = 3 (answer is 3)*/

        int n = 5;
        System.out.println(secondWay(n));


        int a = 0, b = 1;
        int temp;
        for(int i = 2; i<= n; i++) {
            if(i == n) {
                System.out.println();
                System.out.println(a + b);
            } else {
                int c = a + b;
                a = b;
                b = c;
                System.out.print(" " + c);
            }
        }


    }

    private static int secondWay(int n) {

        if(n <= 1) {
            return n;
        } else {
            return secondWay(n-1) + secondWay(n - 2);
        }

    }

}
