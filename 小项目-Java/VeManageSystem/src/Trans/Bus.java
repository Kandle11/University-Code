package Trans;

public class Bus extends Vehicle {
    private String passengerCapacity;

    public Bus(String vehicleId, String plateNumber, String manufacturer,
               String purchaseDate, double totalKm, double fuelConsumption,
                double roadTax, String passengerCapacity) {
        super(vehicleId, plateNumber, manufacturer, purchaseDate, "大客车", totalKm, fuelConsumption, roadTax);
        this.passengerCapacity = passengerCapacity;
    }

    @Override
    public double getBasicMaintenance() {
        return 2000.0;
    }

    public String getPassengerCapacity() {
        return passengerCapacity;
    }

    public void setPassengerCapacity(String passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }

    @Override
    public String toFileString() {
        return "Bus," + super.toFileString() + "," + getPassengerCapacity();
    }

}
