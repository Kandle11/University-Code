public class TestAll {
    public static void main(String[] args) {
        Person p = new Person("II",88,"Girl");
        System.out.println(p.getName() + ", " + p.getAge() + ", " + p.getGender());

        Car c = new Car("Ling",11.4);
        p.drive(c);

        bicycle b = new bicycle("PP",789);
        p.drive(b);

    }

}
class vehicle{
    private String brand;
    private double speed;

    public vehicle() {
    }

    public vehicle(String brand, double speed) {
        this.brand = brand;
        this.speed = speed;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public void move(){
        System.out.println(brand + "的交通工具正在以" + speed + "km/h的速度移动");
    }

}


class bicycle extends vehicle{
    public bicycle() {
    }

    public bicycle(String brand, double speed) {
        super(brand, speed);
    }
    @Override
    public void move(){
        System.out.println(getBrand() + "的自行车正在以" + getSpeed() + "km/h的速度移动");
    }
    public void ring(){
        System.out.println("Ding Ding Ding");
    }

}

class Car extends vehicle{
    public Car(String brand, double speed) {
        super(brand, speed);
    }

    public Car() {
    }

    @Override
    public void move(){
        System.out.println(getBrand() + "的Car正在以" + getSpeed() + "km/h的速度移动");
    }

    public void honk(){
        System.out.println("Bi Bi Bi");
    }
}

class Person{
    private String name;
    private int age;
    private String gender;

    public void drive(vehicle ve){
        ve.move();
        //响铃，鸣笛
        //判断传递过来的是不是自行车
        if(ve instanceof bicycle){
            bicycle b = (bicycle)ve;
            b.ring();
        }else if(ve instanceof Car){
            Car c = (Car)ve;
            c.honk();
        }else{
            System.out.println("There is no this grammar.");
        }

    }


    public Person(){
    }
    public Person(String name,int age,String gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}