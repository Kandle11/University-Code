package Meiju;

public enum OrderState {
    //第一步写这个类所有的对象
    //枚举的第一行必须是所有的枚举项
    //枚举必须是private修饰

    PAYMENT_PENDING("待支付"),
    PROCESSING("处理中"),
    SHIPPED("已发货"),
    OUT_FOR_DELIVERARY("配送中"),
    CANCELLED("已取消");


    private String name;

    OrderState(String name) {
//        System.out.println("AB");
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
