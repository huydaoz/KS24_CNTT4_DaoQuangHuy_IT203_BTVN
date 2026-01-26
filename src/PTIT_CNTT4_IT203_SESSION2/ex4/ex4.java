package PTIT_CNTT4_IT203_SESSION2.ex4;

import java.util.Scanner;

public class ex4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int id;

        do {
            System.out.print("Nhap ma ID sach moi (Phai > 0):");
            id = sc.nextInt();
            if (id<=0){
                System.out.println("ID phai la so duong. Moi nhap lai!");
            }
        }while (id<=0);
        System.out.print("Xac nhan: Ma sach "+id+" da duoc ghi nhan");
    }
}
