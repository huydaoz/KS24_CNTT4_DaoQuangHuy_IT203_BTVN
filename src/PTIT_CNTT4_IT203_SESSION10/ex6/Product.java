package PTIT_CNTT4_IT203_SESSION10.ex6;

class Product {

    String name;
    double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void display() {
        System.out.println(name + " - " + price);
    }
}
