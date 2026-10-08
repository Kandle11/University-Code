package InterFace1;

public class Dog extends animal implements Swim{
    @Override
    public void swim() {
        System.out.println("Dog is swimming");
    }

    @Override
    public void eat() {
        System.out.println("Dog is eating bones");
    }

    public Dog() {
    }

    public Dog(String name, String color) {
        super(name, color);
    }
}
