package Meiju;

public class Test {
    //定义javabean类，描述电商项目中的订单状态
    //java--》枚举
    public static void main(String[] args) {

//        OrderState o1 = OrderState.PAYMENT_PENDING;
//        System.out.println(o1.getName());

//        switch(o1){
//            case PAYMENT_PENDING -> System.out.println("a");
//            case SHIPPED -> System.out.println("b");
//            case CANCELLED -> System.out.println("c");
//        }
        OrderState[] arr = OrderState.values();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        OrderState o2 = OrderState.valueOf("SHIPPED");
        System.out.println(o2);
    }
}
