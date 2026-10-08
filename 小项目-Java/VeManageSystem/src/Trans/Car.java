package Trans;

public class Car extends Vehicle {
    private String carriage;

    public Car(String vehicleId, String plateNumber, String manufacturer, String purchaseDate,
               double totalKm, double fuelConsumption, double roadTax, String carriage) {
        super(vehicleId, plateNumber, manufacturer, purchaseDate, "小轿车", totalKm, fuelConsumption, roadTax);
        this.carriage = carriage;
    }

    public String getCarriage() {
        return carriage;
    }

    public void setCarriage(String carriage) {
        this.carriage = carriage;
    }

    @Override
    public double getBasicMaintenance() {
        return 1000.0;
    }

    @Override
    public String toFileString() {
        return "Car," + super.toFileString() + "," + getCarriage();
    }


}
