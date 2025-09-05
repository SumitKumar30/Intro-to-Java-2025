package unit_3.super_demo;

public class Vehicle {
    String brand = "Ford";

    Vehicle() {
        System.out.println("Vehicle is created");
    }

    public void honk() {
        System.out.println("Tuut, tuut!");
    }
    public void displayBrand() {
        System.out.println("Brand: " + brand);
    }
    
}
