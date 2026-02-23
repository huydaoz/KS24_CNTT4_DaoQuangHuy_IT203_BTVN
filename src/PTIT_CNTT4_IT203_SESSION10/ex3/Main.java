package PTIT_CNTT4_IT203_SESSION10.ex3;

public class Main {
    public static void main(String[] args) {

        Duck duck = new Duck("Vit");
        Fish fish = new Fish("Ca");

        System.out.println("Duck:");
        duck.swim();
        duck.fly();

        System.out.println("\nFish:");
        fish.swim();
    }
}
