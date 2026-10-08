public class Test2 {
    public static void main(String[] args) {
        Bank bank = new Bank();
        try{
            bank.income(200,-100);
            bank.income(300,-100);
            bank.income(400,-100);
            System.out.printf("银行目前有%d元\n",bank.getMoney());
            bank.income(200,100);
            bank.income(99999,-100);
        }catch(BankException e){
            System.out.println("计算收益的过程出现以下问题：");
            System.out.println(e.warnMess());
        }
        System.out.printf("银行目前有%d元\n",bank.getMoney());

    }

}

class Bank {
    private int money;

    public void income(int in, int out) throws BankException {
        if (in <= 0 || out >= 0 || in + out <= 0){
            throw new BankException(in,out);
        }
        int netIncome = in + out;
        System.out.printf("本次计算出的纯收入是：%d 元\n",netIncome);
        money = money + netIncome;
    }
    public int getMoney(){
        return money;
    }
}

class BankException extends Exception {
    String message;

    public BankException(int m, int n) {
        message = "入账资金" + m + "是负数或指出" + n + "是正数，不符合系统要求";
    }

    public String warnMess() {
        return message;
    }
}
