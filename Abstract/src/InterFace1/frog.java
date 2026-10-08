package InterFace1;

public class frog extends animal implements Swim{
    @Override
    public void swim() {
        System.out.println("Frog is swimming");
    }

    @Override
    public void eat() {
        System.out.println("Frog is eating bugs");
    }

    public frog() {
    }

    public frog(String name, String color) {
        super(name, color);
    }


}
