package AreaInterClass;

public class Outer {

    public void show(){
        int a = 1;
        class Inner{

            String name = "17";
            int age;

            public void method1(){
                System.out.println("局部内部类中method1方法");
            }
            public static void method2(){
                System.out.println("method2");
            }

        }
        Inner i = new Inner();
        System.out.println(i.name);
        i.method1();
        Inner.method2();

    }
}
