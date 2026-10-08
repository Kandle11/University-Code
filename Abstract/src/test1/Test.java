package test1;

public class Test {

    public static void main(String[] args) {
        Cat c = new Cat("Tom", "white");
        System.out.println(c.getName() + " " + c.getColor());
        c.eat();
        c.drink();
        c.catchMouse();

    }


}

abstract class Animal{
    private String name;
    private String color;
    //Alt + Enter,是自动修复，快速修复代码
    public abstract void eat();

    public void drink(){
        System.out.println(" drinking ");
    }


    public Animal() {
    }

    public Animal(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}

class Cat extends Animal{
    public Cat() {
    }

    public Cat(String name, String color) {
        super(name, color);
    }

    public void catchMouse(){
        System.out.println(" catching mouse ");
    }

    @Override
    public void eat(){
        System.out.println(" eating fish ");
    }
}

abstract class Dog extends Animal{
    public Dog() {
    }

    public Dog(String name, String color) {
        super(name, color);
    }

    public void lookHome(){
        System.out.println(" looking home ");
    }

    @Override
    public void eat(){
        System.out.println(" eating bone ");
    }
}