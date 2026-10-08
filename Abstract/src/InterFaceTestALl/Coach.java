package InterFaceTestALl;

public abstract class Coach extends Person{
    public abstract void teach();


    public Coach() {
    }

    public Coach(int age, String name) {
        super(age, name);
    }
}
