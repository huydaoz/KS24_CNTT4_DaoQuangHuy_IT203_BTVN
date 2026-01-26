package PTIT_CNTT4_IT203_SESSION2.ex2;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String choice;

        System.out.print("Nhap ma khu vuc (A, B, C, D): ");
        choice = sc.nextLine();
        switch (choice){
            case "A":
                System.out.print("Tầng 1: Sách Văn học");
                break;
            case "B":
                System.out.print("Tầng 2: Sách Khoa học");
                break;
            case "C":
                System.out.print("Tầng 3: Sách Ngoại ngữ");
                break;
            case "D":
                System.out.print("Tầng 4: Sách Tin học");
                break;
            default:
                System.out.print("Ma khu vuc khong hop le!");
                break;
        }
    }
}
