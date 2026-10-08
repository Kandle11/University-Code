package StaticInterClass;

public class Test {
    /*
    1.静态内部类只能访问外部类中的静态变量和静态方法
    2.如果想访问外部类，则只能通过在静态方法里进行创建对象
    3.创建静态对象：外部类.内部类名. 对象名 = new 外部类.内部类（）
    调用静态方法： 外部类.内部类.方法名（）；
    */
    public static void main(String[] args) {
        //创建静态内部类对象
        Outer.Inner oi = new Outer.Inner();
        oi.show1();

        //静态方法
         Outer.Inner.show2();

    }

}
