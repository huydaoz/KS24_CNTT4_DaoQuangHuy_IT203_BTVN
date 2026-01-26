package PTIT_CNTT4_IT203_SESSION2.ex1;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int age;
        int book;

        System.out.print("Nhap so tuoi: ");
        age = sc.nextInt();
        System.out.print("Nhap so sach dang muon: ");
        book = sc.nextInt();

        if (age>=18 && book <= 3){
            System.out.print("Ban du dieu kien muon sach quy hiem");
        } else if (age<18) {
            System.out.print("Ban chua du 18 tuoi");
        }else{
            System.out.print("Ban da muon toi da 3 quyen sach");
        }
    }
}
