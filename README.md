# Assignment 1: Vehicle Rental System

A small Java coursework project that models a vehicle rental fleet and demonstrates object-oriented programming concepts. It uses only standard Java and has no external dependencies.

## What it demonstrates

- Inheritance: `Car` extends `Vehicle`, and `ElectricCar` extends `Car`.
- Polymorphism and upcasting: different vehicle objects are stored in a `Vehicle[]` and use their own overridden methods.
- Method overriding: vehicle startup, information display, and rental-cost behavior vary by vehicle type.
- Method overloading: rental cost with insurance, acceleration, and battery charging have alternate method signatures.
- `instanceof` and downcasting: returned vehicles are handled according to their most specific type.

## Project structure

```text
src/
├── Main.java
├── Vehicle.java
├── Car.java
└── ElectricCar.java
```

## Run the project

Install a Java Development Kit (JDK), then open the project in IntelliJ IDEA and run `Main.java`.

You can also compile and run it from the repository root:

```bash
javac -d out src/Vehicle.java src/Car.java src/ElectricCar.java src/Main.java
java -cp out Main
```

The program prints examples of the fleet behavior, rental-cost calculations, and electric-car charging.
