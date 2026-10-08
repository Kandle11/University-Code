package NoneInnerClass2;

public class Test {
    public static void main(String[] args) {



        //类似多态
        Swim s = new Swim(){
            @Override
            public void swim() {
                System.out.println("Stu Swimming");
            }
        };
        s.swim();

    }

    public static void goSwimming(Swim s){
        s.swim();
    }
}
