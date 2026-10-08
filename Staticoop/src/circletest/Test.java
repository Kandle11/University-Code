package circletest;

public class Test {
    //创建一个圆的对象
    public static void main(String[] args) {
        circle c = new circle(1.5);

        //获取圆的属性
        System.out.println(c.getRadius());
        System.out.println(c.getPI());

        //获取圆的面积与周长
        System.out.println(c.getArea());
        System.out.println(c.getLength());

    }
}
