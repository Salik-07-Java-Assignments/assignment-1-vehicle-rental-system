public class Main {

    public static void main(String[] args) {

        // ---------- Part 1: Upcasting (child objects stored in Vehicle references) ----------
        Vehicle v1 = new Vehicle("Honda", "CG125", 20.0);                  // plain vehicle
        Vehicle v2 = new Car("Toyota", "Corolla", 50.0, 4);                // a Car stored as a Vehicle
        Vehicle v3 = new ElectricCar("Tesla", "Model 3", 90.0, 4, 60);     // an ElectricCar stored as a Vehicle

        Vehicle[] fleet = { v1, v2, v3 };

        // ---------- Part 2: Overriding in action (each object runs ITS OWN version) ----------
        for (Vehicle v : fleet) {
            v.start();          // overridden in Car and ElectricCar
            v.displayInfo();    // overridden in Car and ElectricCar
            returnVehicle(v);   // uses instanceof (see method below)
            System.out.println();
        }

        // ---------- Part 3: instanceof results for the Tesla and the Car ----------
        System.out.println("v3 instanceof ElectricCar: " + (v3 instanceof ElectricCar)); // true
        System.out.println("v3 instanceof Car: "         + (v3 instanceof Car));         // true
        System.out.println("v3 instanceof Vehicle: "     + (v3 instanceof Vehicle));     // true
        System.out.println("v2 instanceof ElectricCar: " + (v2 instanceof ElectricCar)); // false
        System.out.println();

        // ---------- Part 4: Overloading and cost calculation ----------
        Car myCar = new Car("Toyota", "Corolla", 50.0, 4);
        ElectricCar myTesla = new ElectricCar("Tesla", "Model 3", 90.0, 4, 60);

        System.out.println("Car, 3 days:                " + myCar.calculateRentalCost(3));        // 150.0
        System.out.println("Car, 3 days + insurance:    " + myCar.calculateRentalCost(3, true));  // 180.0
        System.out.println("Tesla, 3 days (10% off):    " + myTesla.calculateRentalCost(3));      // 243.0
        System.out.println();

        myCar.accelerate();     // overloaded: default +10
        myCar.accelerate(40);   // overloaded: +40
        myTesla.charge();       // overloaded: full charge
        myTesla.charge(15);     // overloaded: add 15%
    }

    // Called when a customer returns a vehicle.
    // Check the MOST SPECIFIC class first: an ElectricCar is also a Car and a Vehicle,
    // so the first matching check wins.
    static void returnVehicle(Vehicle v) {
        if (v instanceof ElectricCar) {
            ElectricCar e = (ElectricCar) v;   // cast is needed to use ElectricCar-only methods
            e.charge(20);
            System.out.println("Electric car returned: charging started.");
        } else if (v instanceof Car) {
            Car c = (Car) v;                   // cast is needed to use Car-only methods
            c.openTrunk();
            System.out.println("Car returned: trunk checked.");
        } else if (v instanceof Vehicle) {
            System.out.println("Basic vehicle returned: wash and refuel.");
        }
    }
}