package unit-3.Animal-Demo;

public class Tiger extends Feline {
    @Override
    public void makeNoise() {
        System.out.println("Tiger growls");
    }

    @Override
    public void eat() {
        System.out.println("Tiger is eating meat");
    }
    
}
