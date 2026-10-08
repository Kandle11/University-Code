package oopextendtestAll;

public class Test {
    public static void main(String[] args) {
        HighStudent hs = new HighStudent("Zhangsan", 19, 1);
        System.out.println(hs.getName() + ", " + hs.getAge() + ", " + hs.getGrade());
        hs.eat();
        hs.sleep();
        hs.learn();

        System.out.println("________________________");

        Postgraduate pg = new Postgraduate("QiuYe", 24, 1);
        System.out.println(pg.getName() + ", " + pg.getAge() + ", " + pg.getGrade());
        pg.eat();
        pg.learn();
        pg.sleep();


        System.out.println("________________________");

        MasterCourseTeacher mct = new MasterCourseTeacher("LiLi", 40, "Math");
        System.out.println(mct.getName() + ", " + mct.getAge() + ", " + mct.getSubject());
        mct.eat();
        mct.teach();
        mct.sleep();

        System.out.println("________________________");

        AssistantCourseTeacher act = new AssistantCourseTeacher("PO", 60);
        System.out.println(act.getName() + ", " + act.getAge());
        act.sleep();
        act.eat();
        act.teach();
    }
}

class Human {
    private String name;
    private int age;

    public Human() {
    }

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void eat() {
        System.out.println(name + "正在吃饭");
    }

    public void sleep() {
        System.out.println(name + "正在睡觉");
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

class HighStudent extends Human {
    private int grade;

    public HighStudent() {
    }

    public HighStudent(String name, int age, int grade) {
        super(name, age);
        this.grade = grade;
    }

    public void learn() {
        System.out.println(getName() + "正在攻读学士学位");
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
}

class Postgraduate extends HighStudent {
    public Postgraduate() {
    }

    public Postgraduate(String name, int age, int grade) {
        super(name, age, grade);
    }

    @Override
    public void learn() {
        System.out.println(getName() + "正在攻读硕士学位");
    }

    @Override
    public void sleep() {
        System.out.println(getName() + "在豪华版公寓里睡觉");
    }
}

class MasterCourseTeacher extends Human {
    protected static final String DEFAULT_SUBJECT = "通识教育";
    private String subject;

    public MasterCourseTeacher() {
    }

    public MasterCourseTeacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    public void teach() {
        System.out.println(getName() + "正在教专业课知识");
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}

class AssistantCourseTeacher extends MasterCourseTeacher {
    public AssistantCourseTeacher() {
    }

    public AssistantCourseTeacher(String name, int age) {
        super(name, age, MasterCourseTeacher.DEFAULT_SUBJECT);
    }

    @Override
    public void teach() {
        System.out.println(getName() + "正在教通识课知识");
    }
}
