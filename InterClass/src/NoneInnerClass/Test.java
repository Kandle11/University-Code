package NoneInnerClass;

import NoneInnerClass2.Swim;

public class Test {
    public static void main(String[] args) {
        Student s = new Student();
        goSwimming(s);


    }

    public static void goSwimming(Swim s){
        s.swim();
    }
}
