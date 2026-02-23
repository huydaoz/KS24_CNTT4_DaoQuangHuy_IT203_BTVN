package PTIT_CNTT4_IT203_SESSION10.ex6;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {

        ArrayList<Product> list = new ArrayList<>();

        list.add(new Product("Laptop", 1500));
        list.add(new Product("Mouse", 20));
        list.add(new Product("Keyboard", 50));
        list.add(new Product("Monitor", 300));

        Collections.sort(list, new Comparator<Product>() {

            @Override
            public int compare(Product p1, Product p2) {
                return Double.compare(p1.price, p2.price);
            }
        });

        System.out.println("Sap xep theo gia tang dan:");

        for (Product p : list) {
            p.display();
        }

        Collections.sort(list, (p1, p2) ->
                p1.name.compareTo(p2.name)
        );

        System.out.println("\nSap xep theo ten A-Z:");

        for (Product p : list) {
            p.display();
        }
    }
}
/*
Anonymous Class cần dùng khi:

1. Interface có nhiều phương thức
   -> Lambda chỉ dùng được khi interface có 1 phương thức (Functional Interface)

2. Cần thêm biến hoặc thuộc tính riêng

Ví dụ:
new Comparator<Product>() {
    int count = 0; // Lambda không khai báo kiểu này được

    public int compare(Product a, Product b){
        count++;
        return a.price - b.price;
    }
}
*/