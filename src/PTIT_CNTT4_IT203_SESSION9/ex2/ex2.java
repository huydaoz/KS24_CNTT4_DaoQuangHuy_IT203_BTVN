package PTIT_CNTT4_IT203_SESSION9.ex2;

public class ex2 {
    public static void main(String[] args) {
        Animal a1 = new Dog();
        Animal a2 = new Cat();

        a1.sound();
        a2.sound();
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
}

class Cat extends Animal {
    @Override
    public void sound() {
        System.out.println("Meo keu meo meo");
    }
}