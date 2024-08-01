// Vehicle.java

package com.example.constructorchaining;

// Define the base class Vehicle
public class Vehicle {
    private String make;
    private String model;
    private int year;

    // Constructor with no arguments
    public Vehicle() {
        this("Unknown Make", "Unknown Model", 0); // Calls the constructor with make, model, and year
        System.out.println("A vehicle with unknown specifications is created.");
    }

    // Constructor with make and model
    public Vehicle(String make, String model) {
        this(make, model, 0); // Calls the constructor with make, model, and year
        System.out.println("A vehicle with make " + this.make + " and model " + this.model + " is created.");
    }

    // Constructor with make, model, and year
    public Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
        System.out.println("A " + this.year + " " + this.make + " " + this.model + " is created.");
    }
}

// Car.java

package com.example.constructorchaining;

// Define the subclass Car, extending Vehicle
public class Car extends Vehicle {
    private int doors;

    // Constructor with no arguments
    public Car() {
        this(4); // Calls the constructor with the number of doors
        System.out.println("A car with an unknown make and model is created.");
    }

    // Constructor with the number of doors
    public Car(int doors) {
        this("Unknown Make", "Unknown Model", 0, doors); // Calls the constructor with make, model, year, and doors
        System.out.println("A car with " + this.doors + " doors is created.");
    }

    // Constructor with make, model, year, and doors
    public Car(String make, String model, int year, int doors) {
        super(make, model, year); // Calls the constructor of the superclass (Vehicle)
        this.doors = doors;
        System.out.println("A " + year + " " + make + " " + model + " with " + doors + " doors is created.");
    }
}

// Main.java

package com.example.constructorchaining;

// Define the Main class
public class Main {
    public static void main(String[] args) {
        // Create an instance of Car using the no-argument constructor
        Car car1 = new Car();

        System.out.println("\n");

        // Create an instance of Car using the constructor with doors
        Car car2 = new Car(2);

        System.out.println("\n");

        // Create an instance of Car using the constructor with make, model, year, and doors
        Car car3 = new Car("Tesla", "Model S", 2022, 4);
    }
}

