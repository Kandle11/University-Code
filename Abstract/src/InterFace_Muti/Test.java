package InterFace_Muti;

public class Test {
}


interface inter1 {
    public abstract void method1();

    public abstract void method2();
}


interface inter2 {
    public abstract void function1();

    public abstract void function2();
}


class interimpl extends Person implements inter2, inter1 {
    //如果一个类实现了多个接口，那么就要重写多个接口中所有抽象方法
    //  1.如果父类是一个抽象类的话，需要把所有的抽象方法进行重写，要么子类自身也是一个抽象类
    //  2.如果接口中出现了重复的抽象方法，只需要写一个方法
    @Override
    public void show() {

    }

    @Override
    public void method1() {

    }

    @Override
    public void method2() {

    }

    @Override
    public void function1() {

    }

    @Override
    public void function2() {

    }

}

abstract class Person {
    private String name;
    private int age;


    public abstract void show();



    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}