package InterFaceTestALl;

public class PingPongCoach extends Coach implements English{
    @Override
    public void teach() {
        System.out.println("PC teaching pp");
    }

    @Override
    public void speakingEnglish() {
        System.out.println("PC learning saying english");
    }

    public PingPongCoach() {
    }

    public PingPongCoach(int age, String name) {
        super(age, name);
    }
}
