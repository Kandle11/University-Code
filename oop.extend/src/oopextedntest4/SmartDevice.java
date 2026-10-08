package oopextedntest4;

public class SmartDevice {
    String name;
    double price;

    public double payment() {
        if (price >= 0 && price < 1000) {
            return price;
        } else if (price >= 1000 && price < 5000) {
            return 0.9 * price;
        } else if (price >= 5000 && price < 10000) {
            return 0.8 * price;
        } else if (price >= 10000) {
            return 0.7 * price;
        } else {
            return 0;
        }
    }
}


