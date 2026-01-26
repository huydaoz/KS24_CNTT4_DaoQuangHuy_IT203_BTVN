package PTIT_CNTT4_IT203_SESSION2.ex5;

import java.util.Scanner;

public class ex5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int sum = 100;

        System.out.println("--- HE THONG DANH GIA DOC SACH ---");
        System.out.println("Nhap so ngay tre. Nhap 999 de ket thuc");
        while (true){
            int day;
            System.out.print("So ngay tra tre cua lan nay: ");
            day = sc.nextInt();
            if (day<=0){
                sum += 5;
            } else if (day == 999) {
                break;
            } else {
                sum = sum - day*2;
                System.out.println("-> Tra tre "+day+" ngay: -"+day*2+" diem");
            }
        }
        System.out.println("Tong diem uy tin: " + sum);
        if (sum>120){
            System.out.println("Xep loai: Doc gia than thiet");
        } else if (sum<80) {
            System.out.println("Xep loai: Doc gia can luu y");
        }else {
            System.out.println("Xep loai: Doc gia tieu chuan");
        }
    }
}
