package PTIT_CNTT4_IT203_SESSION9.ex4;

public class ex4 {
    public static void main(String[] args) {
        Animal animal = new Dog();

        animal.sound();

        if (animal instanceof Dog) {
            Dog dog = (Dog) animal;
            dog.run();
        }
    }
}
class Animal {
    public void sound() {
        System.out.println("Dong vat phat ra am thanh");
    }
}

class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Cho keu gau gau");
    }

    public void run() {
        System.out.println("Cho dang chay");
    }
}