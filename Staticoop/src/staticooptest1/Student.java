package staticooptest1;

public class Student {

    //共享
    private String name;
    private int age;

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

    //一个学生共享一个老师
    static String teachername;

    public void eat(){
        System.out.println(name + "正在品尝答辩，还说VeryDelicious");

    }
    public void fly(){
        System.out.println(name + "说：我老冯飞升了");
    }

    public void ccc(){
        System.out.println(teachername + "把"+ name + "的手机收了" + name + "说zccycc,cdnmbkh,nmbwcnm,nmdbrrc");
    }


}
