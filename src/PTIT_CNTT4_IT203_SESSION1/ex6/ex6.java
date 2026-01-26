package PTIT_CNTT4_IT203_SESSION1.ex6;

import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Nhập số thứ tự sách
        System.out.print("Nhập số thứ tự của sách trong hệ thống: ");
        int stt = sc.nextInt();

        // Xác định kệ sách (mỗi kệ 25 cuốn)
        int shelfNumber = (stt - 1) / 25 + 1;

        // Xác định vị trí trên kệ (1 → 25)
        int position = (stt - 1) % 25 + 1;

        // Xác định khu vực bằng toán tử điều kiện
        String area = (shelfNumber <= 10) ? "Khu Cận" : "Khu Viễn";

        // In địa chỉ lưu kho
        System.out.println("\n--- Thông tin định vị ---");
        System.out.println("Sách số: "+stt);
        System.out.println("Địa chỉ: Kệ " + shelfNumber +
                " - Vị trí " + position);
        System.out.println("Phân khu: "+ area);

        sc.close();
    }
}
