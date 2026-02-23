package PTIT_CNTT4_IT203_SESSION10.ex2;

class Bicycle extends Vehicle {

    public Bicycle(String brand) {
        super(brand);
    }

    @Override
    public void move() {
        System.out.println(brand + " - Cách di chuyển: Di chuyển bằng sức người");
    }
}
