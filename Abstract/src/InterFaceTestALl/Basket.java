package InterFaceTestALl;

public class Basket extends Sporter{
    @Override
    public void learn() {
        System.out.println("LQ learning playing basket");
    }

    public Basket() {
    }

    public Basket(int age, String name) {
        super(age, name);
    }
}
