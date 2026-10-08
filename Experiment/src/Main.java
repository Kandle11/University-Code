abstract class Shape {
    public abstract double area();
}

class Circle extends Shape {
    private double r;

    public Circle(double r) {
        this.r = r;
    }

    @Override
    public double area() {
        return Math.PI * r * r;
    }
}

class Rectangle extends Shape {
    private double w;
    private double h;

    public Rectangle(double w, double h) {
        this.w = w;
        this.h = h;
    }

    @Override
    public double area() {
        return w * h;
    }
}

class Calculator {
    public void printArea(Shape s) {
        System.out.println("面积: " + s.area());
    }
}

class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double area() {
        return 0.5 * base * height;
    }
}

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(4, 6);
        Shape triangle = new Triangle(3, 4);

        calculator.printArea(circle);
        calculator.printArea(rectangle);
        calculator.printArea(triangle);
    }
}