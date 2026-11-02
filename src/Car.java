public class Car extends Vehicle {
    private int numberOfDoors;

    public Car(String brand, String model, double dailyRate, int numberOfDoors) {
        super(brand, model, dailyRate);
        this.numberOfDoors = numberOfDoors;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void openTrunk() {
        System.out.println("Trunk of " + getBrand() + " " + getModel() + " is open.");
    }

    @Override
    public void start() {
        System.out.println(getBrand() + " " + getModel()
                + " engine started. All " + numberOfDoors + " doors are locked.");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Doors: " + numberOfDoors);
    }

    public double calculateRentalCost(int days, boolean withInsurance) {
        double cost = calculateRentalCost(days);
        if (withInsurance) {
            cost += days * 10;
        }
        return cost;
    }
}