////interface Animal {
////    void sound();
////}
////
////class Cat implements Animal {
////    public void sound() {
////        System.out.println("喵喵喵");
////    }
////}
////
////class Dog implements Animal {
////    public void sound() {
////        System.out.println("汪汪汪");
////    }
////}
////
////public class Test {
////    public static void main(String[] args) {
////        Animal[] animals = {new Cat(), new Dog()};
////        for (Animal animal : animals) {
////            animal.sound();
////        }
////    }
////}
////
////
////
////
////
////
////
////
////
////abstract class Shape {
////    public abstract double area();
////}
////
////
////class Circle extends Shape {
////    private double r;
////
////    public Circle(double r) {
////        this.r = r;
////    }
////
////    @Override
////    public double area() {
////        return Math.PI * r * r;
////    }
////}
////
////
////class Rectangle extends Shape {
////    private double w;
////    private double h;
////
////    public Rectangle(double w, double h) {
////        this.w = w;
////        this.h = h;
////    }
////
////    @Override
////    public double area() {
////        return w * h;
////    }
////}
////
////
////class Triangle extends Shape {
////    private double base;
////    private double height;
////
////    public Triangle(double base, double height) {
////        this.base = base;
////        this.height = height;
////    }
////
////    @Override
////    public double area() {
////        return 0.5 * base * height;
////    }
////}
////
////
////class Calculator {
////    public void printArea(Shape s) {
////        System.out.println("面积是: " + s.area());
////    }
////}
////
////
////public class Main {
////    public static void main(String[] args) {
////        Calculator calculator = new Calculator();
////        Shape circle = new Circle(5);
////        Shape rectangle = new Rectangle(4, 6);
////        Shape triangle = new Triangle(3, 4);
////
////        calculator.printArea(circle);
////        calculator.printArea(rectangle);
////        calculator.printArea(triangle);
////    }
////}
//
//
//
//interface Payment {
//    void pay(double amount);
//}
//
//
//class Alipay implements Payment {
//    @Override
//    public void pay(double amount) {
//        System.out.println("支付宝支付：" + amount);
//    }
//}
//
//class WeChatPay implements Payment {
//    @Override
//    public void pay(double amount) {
//        System.out.println("微信支付：" + amount);
//    }
//}
//
//class CreditCard implements Payment {
//    @Override
//    public void pay(double amount) {
//        System.out.println("信用卡支付：" + amount);
//    }
//}
//
//class PaymentProcessor {
//    public void processPayment(Payment p, double amount) {
//        p.pay(amount);
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        PaymentProcessor processor = new PaymentProcessor();
//        processor.processPayment(new Alipay(), 100.0);
//        processor.processPayment(new WeChatPay(), 200.0);
//        processor.processPayment(new CreditCard(), 300.0);
//    }
//}
//
//
//
//
//interface Device {
//    void turnOn();
//    void turnOff();
//}
//
//class Light implements Device {
//    public void turnOn() {
//        System.out.println("灯已打开");
//    }
//    public void turnOff() {
//        System.out.println("灯已关闭");
//    }
//}
//
//class Fan implements Device {
//    public void turnOn() {
//        System.out.println("风扇启动");
//    }
//    public void turnOff() {
//        System.out.println("风扇停止");
//    }
//}
//
//class TV implements Device {
//    public void turnOn() {
//        System.out.println("电视开机");
//    }
//    public void turnOff() {
//        System.out.println("电视关机");
//    }
//}
//
//class RemoteControl {
//    public void controlDevice(Device device) {
//        device.turnOn();
//        device.turnOff();
//    }
//}
//
//public class Test {
//    public static void main(String[] args) {
//        RemoteControl remote = new RemoteControl();
//        remote.controlDevice(new Light());
//        remote.controlDevice(new Fan());
//        remote.controlDevice(new TV());
//    }
//}