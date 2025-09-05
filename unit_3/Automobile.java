// package unit-3;

public class Automobile {
    private String make;       
    private String model;
    private int year;
    private String color;
    private double mileage;

    public Automobile(String make, String model, int year, String color, double mileage) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
        this.mileage = mileage;
    }

    public void displayInfo() {
        System.out.println("Automobile Information:");
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Color: " + color);
        System.out.println("Mileage: " + mileage + " miles");
    }

    public String modelType(){
        return "Model type is: "+ this.model;
    }
}


class TataCar extends Automobile {
    int numberOfAirbags;

    public TataCar(String make, String model, int year, String color, double mileage, int numberOfAirbags) {
        super(make, model, year, color, mileage);
        this.numberOfAirbags = numberOfAirbags;
    }

    @Override
    public void displayInfo() {
        System.out.println("Number of Airbags: " + numberOfAirbags);
    }

    public String carType(){
        return "Tata EV Car";
    }

   
}

// multi-level inheritance
class NexonEV extends TataCar {
    int batteryCapacity; // in kWh

    public NexonEV(String make, String model, int year, String color, double mileage, int numberOfAirbags, int batteryCapacity) {
        super(make, model, year, color, mileage, numberOfAirbags);
        this.batteryCapacity = batteryCapacity;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Battery Capacity: " + batteryCapacity + " kWh");
    }

    @Override
    public String modelType(){
        return "Model type is: Nexon EV";
    }

    @Override
    public String carType(){
        return "Nexon Electric Vehicle";
    }
}   
