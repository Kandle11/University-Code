package InterFace1;

public class Rabbit extends animal{
    @Override
    public void eat() {
        System.out.println("Rabbit is eating carrot");
    }

    public Rabbit(String name, String color) {
        super(name, color);
    }

    public Rabbit() {
    }



}
