package ooptest3;

public class DOG {
    private String name;
    private int age;

    //get set;

    //name
    public void setName(String name){
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setAge(int age){
        if(age>=0 && age<=15){
            this.age = age;
        }else{
            System.out.println("不在范围");
        }
    }

    public int getAge(){
        return age;
    }

}
