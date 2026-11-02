public class Vehicle {
    private String brand;
    private String model;
    private double dailyRate;
    private int speed;

    public Vehicle(String brand, String model, double dailyRate) {
        this.brand = brand;
        this.model = model;
        this.dailyRate = dailyRate;
        this.speed = 0;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getDailyRate() {
        return dailyRate;
    }

    public int getSpeed() {
        return speed;
    }

    public void start() {
        System.out.println(brand + " " + model + " is starting with a key.");
    }

    public void stop() {
        speed = 0;
        System.out.println(brand + " " + model + " has stopped.");
    }

    public void accelerate() {
        accelerate(10);
    }

    public void accelerate(int amount) {
        speed += amount;
        System.out.println(brand + " " + model + " speed is now " + speed + " km/h.");
    }

    public double calculateRentalCost(int days) {
        return days * dailyRate;
    }

    public void displayInfo() {
        System.out.println("Brand: " + brand + " | Model: " + model
                + " | Daily rate: " + dailyRate);
    }
}