// package unit-3.Animal-Demo;

public class Animal {
   private String picture;
    private String food;
    private boolean hunger;
    private int boundaries;
    private int location;
    
    public Animal(String picture, String food, boolean hunger, int boundaries, int location) {
        this.picture = picture;
        this.food = food;
        this.hunger = hunger;
        this.boundaries = boundaries;
        this.location = location;
    }

    public void makeNoise() {
        System.out.println("Animal makes a noise");
    }

    public void eat() {
        System.out.println("Animal is eating " + this.food);
    }

    public void sleep() {
        System.out.println("Animal is sleeping");
    }

    public void roam() {
        System.out.println("Animal is roaming within boundaries: " + this.boundaries);
    }
}
