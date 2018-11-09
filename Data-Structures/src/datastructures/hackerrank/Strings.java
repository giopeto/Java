package datastructures.hackerrank;

public class Strings {

    public static void main(String[] args) {
        String a = "a";
        String b = "a";
        String c = new String("a");
        String d = new String("a");


        System.out.println(a == b);
        System.out.println(c == d);

        testLiteralVsObject();
    }

    private static void testLiteralVsObject() {
        System.out.println("testLiteralVsObject");
        String a = "Java";
        String b = new String("Java");

        System.out.println(a == b);
    }
}
