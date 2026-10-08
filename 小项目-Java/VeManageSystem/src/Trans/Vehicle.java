package Trans;

public class Vehicle {
    private static double oilPrice = 8.5;
    private String vehicleId;
    private String plateNumber;
    private String manufacturer;
    private String purchaseDate;
    private String model;
    private double totalKm;
    private double fuelConsumption;
    private double basicMaintenance;
    private double roadTax;
//    private double totalCost = 0.0;

    public Vehicle(String vehicleId, String plateNumber,
                   String manufacturer, String purchaseDate,
                   String model, double totalKm,
                   double fuelConsumption,
                   double roadTax) {
        this.vehicleId = vehicleId;
        this.plateNumber = plateNumber;
        this.manufacturer = manufacturer;
        this.purchaseDate = purchaseDate;
        this.model = model;
        this.totalKm = totalKm;
        this.fuelConsumption = fuelConsumption;
        this.roadTax = roadTax;
    }

    public static void setOilPrice(double price) {
        oilPrice = price;
    }

    public static double getOilPrice() {
        return oilPrice;
    }

    public double getBasicMaintenance() {
        return basicMaintenance;
    }

    public void setBasicMaintenance(double basicMaintenance) {
        this.basicMaintenance = basicMaintenance;
    }

    public String getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(String purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getTotalKm() {
        return totalKm;
    }

    public void setTotalKm(double totalKm) {
        this.totalKm = totalKm;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }


    public double getRoadTax() {
        return roadTax;
    }

    public void setRoadTax(double roadTax) {
        this.roadTax = roadTax;
    }

    public String getInfo(){
        return "车型:" + getModel() + "|编号:" + getVehicleId() + "|车牌:" + getPlateNumber() +
                "|制造商:" + getManufacturer() + "|购买时间:" + getPurchaseDate() + "|总公里数:" + getTotalKm() +
                "|耗油量/公里:" + getFuelConsumption() + "|基本维护费:" + getBasicMaintenance() + "|养路费:"
              + getRoadTax();
    }

    public String toFileString() {
        return getVehicleId() + "," + getPlateNumber() + "," + getManufacturer() + ","
                + getPurchaseDate() + "," + getTotalKm() + "," + getFuelConsumption() + ","
                 + getRoadTax();
    }

    public static Vehicle fromFileString(String line) {
        String[] parts = line.split(",");
        String type = parts[0];  // Bus, Car, Truck

        return switch (type) {
            case "Bus" -> new Bus(parts[1], parts[2], parts[3], parts[4],
                    Double.parseDouble(parts[5]),
                    Double.parseDouble(parts[6]),
                    Double.parseDouble(parts[7]),
                    parts[8]);
            case "Car" -> new Car(parts[1], parts[2], parts[3], parts[4],
                    Double.parseDouble(parts[5]),
                    Double.parseDouble(parts[6]),
                    Double.parseDouble(parts[7]),
                    parts[8]);
            case "Truck" -> new Truck(parts[1], parts[2], parts[3], parts[4],
                    Double.parseDouble(parts[5]),
                    Double.parseDouble(parts[6]),
                    Double.parseDouble(parts[7]),
                    Double.parseDouble(parts[8]));
            default -> null;
        };
    }
}
