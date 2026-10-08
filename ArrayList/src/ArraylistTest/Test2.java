package ArraylistTest;

import java.util.ArrayList;

public class Test2 {

    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Student s1 = new Student("001","Zhangsan",18);
        Student s2 = new Student("002","Lisi",18);
        Student s3 = new Student("003","Huanghong",18);
        list.add(s1);
        list.add(s2);
        list.add(s3);


    }





























}

class Student{
    private String id;
    private String name;
    private int age;

    public Student(String id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public Student() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
