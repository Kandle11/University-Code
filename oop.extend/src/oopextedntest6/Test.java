package oopextedntest6;

public class Test {
    //父类构造的方法不能被子类继承,只能用super调用

    //



    public static void main(String[] args) {
//        Student stu = new Student("Zhangsan",18,3);
//        System.out.println(stu.name + ", " + stu.age + ", " + stu.grade);
//        会输出
//        父类的带参构造被执行了 -->先去使用父类的构造方法
//        子类Student的带参构造被执行了
//        Zhangsan, 18, 3
        Student stu1 = new Student(); //调用空参构造
    }

}


class Human {
    String name;
    int age;


    public Human() {
        System.out.println("父类空参被执行了");

    }

    public Human(String name, int age) {
        System.out.println("父类的带参构造被执行了");
        this.name = name;
        this.age = age;
    }
}


class Teacher extends Human {
    String subject;

    public Teacher() {
//        super();
        System.out.println("子类Teacher的空参构造被执行了");
    }

    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
        System.out.println("子类Teacher带参构造被i执行了");
    }
}


class Student extends Human {
    int grade;

    public Student() {
//        super();
        System.out.println("子类的Student的无参构造被i执行了");
    }

    public Student(String name, int age, int grade) {
        super(name, age);
        this.grade = grade;
        System.out.println("子类Student的带参构造被执行了");
    }
}