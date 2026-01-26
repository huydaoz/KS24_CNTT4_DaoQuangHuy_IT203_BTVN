package PTIT_CNTT4_IT203_SESSION2.ex6;

import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int maxBorrow = -1;
        int minBorrow = Integer.MAX_VALUE;
        int totalBorrow = 0;
        int openDays = 0;

        for (int day = 2; day <= 8; day++) {
            System.out.print("Nhập số lượt mượn ngày thứ " + day + ": ");
            int borrow = sc.nextInt();

            if (borrow == 0) {
                continue; // thư viện đóng cửa, không tính
            }

            // cập nhật max
            if (borrow > maxBorrow) {
                maxBorrow = borrow;
            }

            // cập nhật min
            if (borrow < minBorrow) {
                minBorrow = borrow;
            }

            totalBorrow += borrow;
            openDays++;
        }

        if (openDays > 0) {
            double average = (double) totalBorrow / openDays;

            System.out.println("Lượt mượn cao nhất: " + maxBorrow);
            System.out.println("Lượt mượn thấp nhất: " + minBorrow);
            System.out.println("Lượt mượn trung bình: " + average);
        } else {
            System.out.println("Không có ngày nào thư viện mở cửa.");
        }
    }
}
