package InterFaceTestALl;

public class PingPongSporter extends Sporter implements English {
    @Override
    public void speakingEnglish() {
        System.out.println("PP Saying English");
    }

    @Override
    public void learn() {
        System.out.println("PP learning playing pingpong");
    }

    public PingPongSporter() {
    }

    public PingPongSporter(int age, String name) {
        super(age, name);
    }
}
