package DuoTaiWork;

public class Graphic {
}

class Shape{
    public double getArea(){
        return 0;
    }
    public double getGirth(){
        return 0;
    }
}


class Rectangle extends Shape{
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea(){
        return 2 * (width + height);
    }
    @Override
    public double getGirth(){
        return width * height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
