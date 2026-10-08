package staticooptest1;

public class Test {
    public static void main(String[] args) {
        Student stu1 = new Student();
//        stu1.setName("s");
//        stu1.setAge(114514);
        System.out.println(stu1);


        Student stu2 = new Student();
        stu2.setName("XYY");
        stu2.setAge(7891);

        Student.teachername = "校长";

        System.out.println(Student.teachername);
        stu1.eat();
        stu1.fly();
        stu1.ccc();

        Student.teachername = "Laofeng";
        System.out.println(Student.teachername);
    }


}
