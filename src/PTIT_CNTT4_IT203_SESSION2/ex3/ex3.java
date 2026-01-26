package PTIT_CNTT4_IT203_SESSION2.ex3;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int book;
        int sum =0;
        System.out.print("Nhap so luong sach tra muon: ");
        book = sc.nextInt();
        for (int i= 1;i<book+1;i++){
            int check;
            System.out.print("Nhap so ngay tre cua cuon thu "+ i +": ");
            check =sc.nextInt();
            sum = sum + check*5000;
        }
        System.out.print("Tong tien phat: " + sum);
    }
}
