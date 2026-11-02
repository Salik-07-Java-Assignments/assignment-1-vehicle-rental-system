public class ElectricCar extends Car {
    private int batteryCapacityKWh;
    private int batteryPercentage;

    public ElectricCar(
            String brand,
            String model,
            double dailyRate,
            int numberOfDoors,
            int batteryCapacityKWh
    ) {
        super(brand, model, dailyRate, numberOfDoors);
        this.batteryCapacityKWh = batteryCapacityKWh;
        this.batteryPercentage = 100;
    }

    public int getBatteryPercentage() {
        return batteryPercentage;
    }

    public int getBatteryCapacityKWh() {
        return batteryCapacityKWh;
    }

    @Override
    public void start() {
        System.out.println(getBrand() + " " + getModel()
                + " is starting silently. Battery at " + batteryPercentage + "%.");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Battery: " + batteryCapacityKWh + " kWh, "
                + batteryPercentage + "% charged");
    }

    public void charge() {
        batteryPercentage = 100;
        System.out.println("Battery fully charged: " + batteryPercentage + "%");
    }

    public void charge(int percent) {
        batteryPercentage += percent;
        if (batteryPercentage > 100) {
            batteryPercentage = 100;
        }
        System.out.println("Battery now at " + batteryPercentage + "%.");
    }

    @Override
    public double calculateRentalCost(int days) {
        double normalCost = super.calculateRentalCost(days);
        return normalCost * 0.90;
    }
}