package Trans;

public class Truck extends Vehicle {
    private double loadCapacity;

    public Truck(String vehicleId, String plateNumber, String manufacturer, String purchaseDate, double totalKm, double fuelConsumption, double roadTax, double loadCapacity) {
        super(vehicleId, plateNumber, manufacturer, purchaseDate, "卡车", totalKm, fuelConsumption, roadTax);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public double getBasicMaintenance() {
        return 1500.0;
    }

    public double getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(double loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    @Override
    public String toFileString() {
        return "Truck," + super.toFileString() + "," + getLoadCapacity();
    }
}
