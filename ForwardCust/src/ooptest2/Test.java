package ooptest2;

public class Test {
    public static void main(String[] args) {
        Teacher t = new Teacher();
        t.age = 18;
        t.name = "Polly";

        System.out.println(t.age);
        System.out.println(t.name);

        t.teach();
        t.eat();
        t.sleep();
    }
}
