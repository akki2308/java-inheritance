class Vehicle {
    // Class attributes
    protected int maxSpeed;
    protected String model;

    // Constructor
    public Vehicle(int maxSpeed, String model) {
        this.maxSpeed = maxSpeed;
        this.model = model;
    }

    // Method to display vehicle details
    public void displayDetails() {
        System.out.println("Max Speed (in kmph): " + maxSpeed);
        System.out.println("Model: " + model);
    }
}

// Interface
interface Refuelable {
    void refuel();
}

// Subclass
class ElectricVehicle extends Vehicle {
    // Class attributes
    private String electricVehicleType;

    // Subclass Constructor
    public ElectricVehicle(int maxSpeed, String model, String electricVehicleType) {
        // Calling superclass constructor
        super(maxSpeed, model);
        this.electricVehicleType = electricVehicleType;
    }

    // Method to display details
    public void displayElectricVehicleDetails() {
        super.displayDetails();
        System.out.println("Vehicle Type: " + electricVehicleType);
    }

    // Method to charge the vehicle
    public void charge() {
        System.out.println("The vehicle is being charged.");
    }
}

// Subclass
class PetrolVehicle extends Vehicle implements Refuelable {
    // Class attributes
    private String petrolVehicleType;

    // Subclass Constructor
    public PetrolVehicle(int maxSpeed, String model, String petrolVehicleType) {
        // Calling superclass constructor
        super(maxSpeed, model);
        this.petrolVehicleType = petrolVehicleType;
    }

    // Method to display details
    public void displayPetrolVehicleDetails() {
        super.displayDetails();
        System.out.println("Vehicle Type: " + petrolVehicleType);
    }

    // Method to refuel the vehicle
    @Override
    public void refuel() {
        System.out.println("The vehicle is being refueled.");
    }
}

public class VehicleManagementSystem {
    public static void main(String[] args) {
        ElectricVehicle electricVehicle = new ElectricVehicle(25, "Activa", "Scooter");
        System.out.println("Electric Vehicle Details:");
        electricVehicle.displayElectricVehicleDetails();
        electricVehicle.charge();

        PetrolVehicle petrolVehicle = new PetrolVehicle(140, "Ferrari", "Car");
        System.out.println("\nPetrol Vehicle Details:");
        petrolVehicle.displayPetrolVehicleDetails();
        petrolVehicle.refuel();
    }
}

