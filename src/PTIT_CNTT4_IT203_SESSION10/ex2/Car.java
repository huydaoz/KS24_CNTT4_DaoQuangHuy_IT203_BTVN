package PTIT_CNTT4_IT203_SESSION10.ex2;

class Car extends Vehicle {

    public Car(String brand) {
        super(brand);
    }

    @Override
    public void move() {
        System.out.println(brand + " - Cách di chuyển: Di chuyển bằng động cơ");
    }
}