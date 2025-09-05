package unit_3.super_demo;

public class Trucks extends Vehicle {
    String modelName = "Mustang"; // Vehicle attribute

    // usage of super in constructor call 
    Trucks() {
        super(); // Call the constructor of the parent class (Vehicle)
        System.out.println("Truck is created");
    }

    public void displayModel() {
        super.displayBrand(); // Call the displayBrand() method from the Vehicle class
        System.out.println("Model: " + modelName);
    }

    public static void main(String[] args) {
        Trucks myTruck = new Trucks();
        myTruck.honk(); // Call the honk() method from the Vehicle class
        myTruck.displayBrand(); // Call the displayBrand() method from the Vehicle class
        System.out.println("Model: " + myTruck.modelName); // Print the model name
    }
    
}
