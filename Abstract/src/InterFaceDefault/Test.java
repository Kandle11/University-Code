package InterFaceDefault;

public class Test {
    public static void main(String[] args) {
        /*
        接口中默认方法：为了接口升级而存在
        格式：public default 返回值类型 方法名（形式参数）{}

        注意事项：
        1.默认方法不是抽象方法，所以不会强制重写。但如果被重写，要去掉default关键字
        2.public可以省略，default不行
        3.如果实现了多个接口，多个接口中存在相同名字的默认方法，子类就必须重写该方法
         */
        interFace in = new interFace();
        in.funtion();

    }
}
