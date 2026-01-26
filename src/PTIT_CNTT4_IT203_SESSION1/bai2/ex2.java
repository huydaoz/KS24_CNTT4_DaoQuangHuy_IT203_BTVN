package PTIT_CNTT4_IT203_SESSION1.bai2;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n;
        int m;

        System.out.print("nhập số ngày chậm trễ: ");
        n = sc.nextInt();
        System.out.print("nhập số lượng sách mượn: ");
        m = sc.nextInt();

        double total = n*m*5000;
        System.out.println("Tiền phạt gốc: " + total + " VNĐ");

        if (n>7&&m>=3){
            total=total +total*20/100;
        }
        System.out.println("Tiền phạt sau điều chỉnh: " + total + " VNĐ");

        if (total>50000){
            System.out.println("Yêu cầu khóa thẻ: true");
        }else {
            System.out.println("Yêu cầu khóa thẻ: false");
        }
    }
}
