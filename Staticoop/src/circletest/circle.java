package circletest;

public class circle {
    //属性
    private double radius; //半径
    private final double PI = 3.14;


    //构造参数
    public circle() {
    }

    public circle(double radius) {
        this.radius = radius;
    }


    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getPI() {
        return PI;
    }

    //行为
    //计算圆的面积
    public double getArea() {
        return PI * radius * radius;
    }

    public double getLength() {
        return 2 * PI * radius;
    }

}
