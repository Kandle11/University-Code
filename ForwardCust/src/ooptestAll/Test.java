package ooptestAll;

public class Test {
    public static void main(String[] args) {
        Student stu1 = new Student();

        stu1.setName("张三");
        stu1.setAge(18);
        System.out.println(stu1.getName());
        System.out.println(stu1.getAge());
        stu1.study();
        stu1.eat();
        stu1.sleep();

        Student stu2 = new Student("lisi", 19);
        System.out.println(stu2.getName());
        System.out.println(stu2.getAge());
        stu1.study();
        stu1.eat();
        stu1.sleep();

    }


}
