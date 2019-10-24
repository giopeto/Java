package algorithms.tasks;

public class PrimeNumber {

    public static void main(String[] args) {
        int start = 1;
        int end = 5;

        findPrimeNumber(start, end);
    }

    private static void findPrimeNumber(int start, int end) {

        int interval = end - start;

        for (int i = start; i < interval; i++) {
            if(checkIfPrime(i)) {
                System.out.print(i + " ");
            }

        }
    }

    private  static  boolean checkIfPrime(int num) {
        boolean isPrime = true;

        for(int i=2; i<= num/2; i++) {
            if(num%i == 0){
                isPrime = false;
                break;
            }
        }

        return isPrime;
    }

}
