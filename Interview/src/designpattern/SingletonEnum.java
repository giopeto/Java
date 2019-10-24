package designpattern;
public class SingletonEnum {
    public static void main(String[] args) {
        final Singleton s = Singleton.INSTANCE;
        s.setValue(5);
        System.out.println(s.getValue());
        System.out.println(Singleton.INSTANCE.getValue());
    }

}
enum Singleton {
    INSTANCE;

    private int value;

    private Singleton() {
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}


