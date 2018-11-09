package random;

public class WhileAndDoWhile {

    public static void main(String[] args) {
        testWhile(20);
        testDoWhile(20);
    }

    private static void testDoWhile(int x) {

        do{
          x++ ;
          System.out.println(x);
        } while(x<20);
    }

    private static void testWhile(int x) {

        while(x < 20) {
            System.out.println("X: " + x);
            x++;
        }
    }
}
