// package unit-3.Animal-Demo;

public class AnimalDriver {
    public static void main(String[] args) {
        Animal[] animals = new Animal[4];
        animals[0] = new Cat();
        animals[1] = new Lion();
        animals[2] = new Tiger();
        animals[3] = new Hippo();

        for (Animal animal : animals) {
            System.out.println(animal.makeNoise());
            System.out.println(animal.eat());
            animal.roam();
            System.out.println();
        }
    }
}
