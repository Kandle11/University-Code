abstract class Payment {
    abstract void pay(double amount);
}

class Alipay extends Payment {
    void pay(double amount) {
        System.out.println("支付宝支付：" + amount);
    }
}

class WeChatPay extends Payment {
    void pay(double amount) {
        System.out.println("微信支付：" + amount);
    }
}

class CreditCard extends Payment {
    void pay(double amount) {
        System.out.println("信用卡支付：" + amount);
    }
}

class PaymentProcessor {
    void processPayment(Payment p, double amount) {
        p.pay(amount);
    }
}

public class Test1 {
    public static void main(String[] args) {
        PaymentProcessor processor = new PaymentProcessor();
        processor.processPayment(new Alipay(), 100.0);
        processor.processPayment(new WeChatPay(), 150.0);
        processor.processPayment(new CreditCard(), 200.0);
    }
}