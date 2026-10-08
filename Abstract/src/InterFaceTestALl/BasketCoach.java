package InterFaceTestALl;

public class BasketCoach extends Coach{
    @Override
    public void teach() {
        System.out.println("BC teach how to play basket");
    }

    public BasketCoach() {
    }

    public BasketCoach(int age, String name) {
        super(age, name);
    }
}
