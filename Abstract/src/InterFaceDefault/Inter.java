package InterFaceDefault;

public interface Inter {
    public abstract void method();
    public abstract void method2();

    public default void funtion(){
        System.out.println("父类接口定义的新方法");
    }
}
