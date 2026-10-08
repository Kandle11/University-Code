package NoneInnerClass;

import NoneInnerClass2.Swim;

public class Student implements Swim {
    @Override
    public void swim() {
        System.out.println("Swimming Stu");
    }
}
