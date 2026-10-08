package ooptest5;
//构造方法
public class Student {
    private String name;
    private int age;
    private String gender;
    private double height;

    //构造方法
    //习惯：空参   带全部参数
    public Student(){

    }

    public Student(String name,int age,String gender,double height){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.height = height;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }
    public void setGender(String gender){
        this.gender = gender;
    }
    public String getGender(){
        return gender;
    }
    public void setHeight(double height){
        this.height = height;
    }
    public double getHeight(){
        return height;
    }

}
