package test1;

public class StudentManager {
    //定义方法定义用户
    //参数Person：表示此时可以传递Person本身的对象,同时也可也传递子类对象
    public void register(Person person) {
        System.out.println("Name:" + person.getName() + ", " + person.getUsername() + ", Password" + person.getPassword());
        person.work();
    }

}
