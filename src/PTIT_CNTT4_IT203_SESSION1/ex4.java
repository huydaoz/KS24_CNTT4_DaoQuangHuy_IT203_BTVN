package PTIT_CNTT4_IT203_SESSION1;
import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Nhập dữ liệu
        System.out.print("Nhap gia sach (USD): ");
        double usdPrice = sc.nextDouble();

        System.out.print("Nhap ty gia (VND/USD): ");
        float exchangeRate = sc.nextFloat();

        // Tính tổng tiền VNĐ (kiểu double)
        double vndTotal = usdPrice * exchangeRate;

        // Ép kiểu sang long để lấy số tiền chẵn
        long vndRounded = (long) vndTotal;

        // In kết quả
        System.out.println("\n===== THONG TIN GIA SACH =====");
        System.out.println("Gia sach (USD): " + usdPrice);
        System.out.println("Ty gia        : " + exchangeRate);
        System.out.println("Tong tien VND : " + vndRounded + " VND");

        sc.close();
    }
}
