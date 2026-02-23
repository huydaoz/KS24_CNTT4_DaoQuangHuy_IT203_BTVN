package PTIT_CNTT4_IT203_SESSION10.ex1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // hình tròn
        System.out.print("Nhập bán kính hình tròn: ");
        double radius = sc.nextDouble();
        Shape circle = new Circle(radius);

        // hình chữ nhật
        System.out.print("Nhập chiều rộng hình chữ nhật: ");
        double width = sc.nextDouble();
        System.out.print("Nhập chiều cao hình chữ nhật: ");
        double height = sc.nextDouble();
        Shape rectangle = new Rectangle(width, height);

        // kết quả
        System.out.println("\n--- KẾT QUẢ ---");

        System.out.println("Hình tròn:");
        System.out.println("Diện tích: " + circle.getArea());
        System.out.println("Chu vi: " + circle.getPerimeter());

        System.out.println("\nHình chữ nhật:");
        System.out.println("Diện tích: " + rectangle.getArea());
        System.out.println("Chu vi: " + rectangle.getPerimeter());

        sc.close();
    }
}