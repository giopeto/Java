package immutableobject;

public class ImmutableObjects {

    public static void main(String[] args) {

        Money money = new Money(1, new Currency("USD"));

        System.out.println(money.toString());

        //testString();
    }



    static void testString() {
        String name = "A";
        name = "B";

        System.out.println(name);

        final String finalName = "C";
        // finalName = "D"; // Cant do that
    }

}
