package API.util.Random;
//导包:定位Random的位置
//扩展：在什么时候，不需要导包？
//1.使用本包中的类
//2.使用java.lang包（核心）的类
import java.util.Random;

public class Test {
    public static void main(String[] args) {
    //1.创建Random的对象
        Random r = new Random();
    //2.调用方法 (double-->0.0~1.0
        double v = r.nextDouble(-100,100);
        System.out.println(v);
        for (int i = 0; i < 10; i++) {
            double v1 = r.nextDouble(-100,740);
            System.out.println(v1);

        }
    }
}
