package oopextendtest5;

public class Test {
    public static void main(String[] args) {
        //final 修饰变量、修饰类、修饰方法、
        //final 修饰类：表示这个类为最终类，不能被继承
        //final 修饰方法:这个方法是最终方法，不能被子类重写；
        //private static final最终方法都不能被重写

    }
}
/*final*/ class Fu{
    public void method(){
        System.out.println("method Doingthing");
    }
}


class Zi extends Fu{
    @Override
    public void method(){
        super.method();
        System.out.println("Son rebuild the method");
    }

    public void callParentMethod(){
        super.method();
    }
}