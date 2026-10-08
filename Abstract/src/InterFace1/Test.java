package InterFace1;

public class Test {
    public static void main(String[] args) {
        frog f = new frog("QQ", "green");
        System.out.println(f.getName() + " " + f.getColor());
        f.eat();
        f.swim();
        System.out.println("------------------");
        Dog d = new Dog("QQ", "green");
        System.out.println(d.getName() + " " + d.getColor());
        d.eat();
        d.swim();
        System.out.println("------------------");
        Rabbit r = new Rabbit("QQ", "green");
        System.out.println(r.getName() + " " + r.getColor());
        r.eat();
        System.out.println("------------------");
    }
}
