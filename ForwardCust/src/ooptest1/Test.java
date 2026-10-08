package ooptest1;

public class Test {

    //描述一类事物的叫javabean类；
    //带有main方法的类叫做测试类
    public static void main(String[] args) {


        //类名 对象名 = new 类名（）；
        Dog d1 = new Dog();

        d1.age = 5;
        d1.name = "小白";
        d1.color = "白色";
        d1.weight = 3.5;

        System.out.println(d1.name);
        System.out.println(d1.age);
        System.out.println(d1.color);
        System.out.println(d1.weight);

        Dog d2 = new Dog();

        d2.name = "大黄";
        d2.age = 6;
        d2.color = "黄";
        d2.weight = 11.5;

        System.out.println(d2.name);
        System.out.println(d2.name);
        System.out.println(d2.name);
        System.out.println(d2.name);
    }
}
