package oopextendtest1;

public class Test {
    public static void main(String[] args) {
        Student s = new Student();
        s.name = "Xiaoshishi";
        s.age = 19;
        s.grade = "!";

        System.out.println(s.name + ", " + s.age + ", " + s.grade);
        s.eat();
        s.study();

        System.out.println("______________________________");

        Teacher t = new Teacher();
        t.age = 20;
        t.name = "AWei";
        t.subject = "Computer";

        System.out.println(t.name + ", " + t.age + ", " + t.subject);
        t.teach();
        t.eat();
    }
}
