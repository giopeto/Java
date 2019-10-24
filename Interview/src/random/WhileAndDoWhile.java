package random;

public class WhileAndDoWhile {

    public static void main(String[] args) {
        testWhile(20);
        testDoWhile(20);
    }

    private static void testDoWhile(int x) {

        System.out.println("testDoWhile");
        do{
          x++ ;
          System.out.println(x);
        } while(x<20);
    }

    private static void testWhile(int x) {

        System.out.println("testWhile");
        while(x < 20) {
            x++;
            System.out.println("X: " + x);
        }
    }
}
