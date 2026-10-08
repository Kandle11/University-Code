package StaticInterClass;

public class Outer {
    int a = 190;
    static int b = 123;

    public static void main(String[] args) {
        //创建静态内部类对象
        Inner oi = new Inner();
        oi.show1();

        //静态方法
        Outer.Inner.show2();

    }

    //静态内部类
    static class Inner{

        public void show1(){
            System.out.println("非静态的方法被调用了");
//            System.out.println(a); 报错
        }

        public static void show2(){
            System.out.println("静态内部类的方法被调用了");
        }

    }
}
