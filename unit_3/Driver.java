// package unit-3;
// import unit-3.Automobile;
public class Driver {
    public static void main(String[] args) {
        // Automobile myCar = new Automobile("Tata", "Nexon EV", 2023, "Blue", 15000);
        // myCar.displayInfo();
        TataCar myTataCar = new TataCar("Tata", "Nexon EV", 2023, "Blue", 15000, 6);
        myTataCar.displayInfo();
        // myTataCar.make = "Tata Motors"; // Accessing default access modifier variable
        // System.out.println("Make: " + myTataCar.make);

        // System.out.println("Car Type: " + myTataCar.carType());

        // Superclass variable holding subclass object
        Automobile anotherCar = new TataCar("Tata", "Nexon EV", 2023, "Red", 12000, 4);
        anotherCar.displayInfo(); // Calls overridden method in TataCar
        anotherCar.modelType(); // Calls method in Automobile

        System.out.println(anotherCar.modelType());
        // anotherCar.carType(); // Error: carType() is not accessible
    
            // Multi-level inheritance

        NexonEV myNexon = new NexonEV("Tata", "Nexon EV", 2023, "White", 8000, 6, 30);
        myNexon.displayInfo();
        System.out.println("Car Type: " + myNexon.carType());
        System.out.println( myNexon.modelType());

    }
}
