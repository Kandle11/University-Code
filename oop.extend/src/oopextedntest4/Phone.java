package oopextedntest4;

public class Phone extends SmartDevice {
    @Override
    public double payment() {
        double payment = super.payment();
        return payment * 0.9;
    }
}
