package oopextendtest2;

public class Test {
    public static void main(String[] args) {
        Android a = new Android();
        a.brand = "MeiZu";
        a.price = 1999;
        a.call();
        a.sendMessage();
        a.nfc();

        Apple i = new Apple();
        i.brand = "17pro";
        i.price = 2011;

    }
}