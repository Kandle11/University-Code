package InterFace2;

import InterFaceTestALl.Person;
import InterFaceTestALl.PingPongCoach;
import InterFaceTestALl.PingPongSporter;

public class Test {
    public static void main(String[] args) {
        System.out.println(inter.a);
        PingPongCoach p = new PingPongCoach(17,"pp");
        System.out.println(p.getAge() + ", " + p.getName());
        p.teach();
        p.speakingEnglish();
    }
}
