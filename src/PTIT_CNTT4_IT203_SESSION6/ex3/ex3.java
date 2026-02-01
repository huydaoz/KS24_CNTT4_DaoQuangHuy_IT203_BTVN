package PTIT_CNTT4_IT203_SESSION6.ex3;

public class ex3 {

    private String productId;
    private String productName;
    private double price;

    public ex3(String productId, String productName, double price) {
        this.productId = productId;
        this.productName = productName;
        setPrice(price);
    }

    public String getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        } else {
            System.out.println("Giá không hợp lệ");
        }
    }

    public void displayInfo() {
        System.out.println("Mã SP: " + productId);
        System.out.println("Tên SP: " + productName);
        System.out.println("Giá bán: " + price);
        System.out.println("--------------------");
    }

    public static void main(String[] args) {

        ex3 p = new ex3("SP01", "Laptop", 15000000);

        p.displayInfo();

        p.setPrice(-5000);

        p.displayInfo();

        p.setPrice(12000000);

        p.displayInfo();
    }
}
