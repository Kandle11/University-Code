package ooptestAll;

public class Student {

    //私有化全部变量
    private String name;
    private int age;


    //构造方法 Alt+Insert tab tab
    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
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

    //行为
    public void study() {
        System.out.println(name + "学习");
    }

    public void eat() {
        System.out.println(name + "吃");
    }

    public void sleep() {
        System.out.println(name + "睡觉");
    }


}
