package test1;

public class Test {
    public static void main(String[] args) {
        StudentManager sm = new StudentManager();
        Student stu = new Student("Zhangsan","zs","114514");
        sm.register(stu);
        System.out.println();
        Teacher te = new Teacher("Lo","lllll","7891");
        sm.register(te);
        System.out.println();
        Admin ad = new Admin("PPP","pipi","99999");
        sm.register(ad);
        System.out.println();
        Person per = new Person("78","91","1111");
        sm.register(per);
    }
}

