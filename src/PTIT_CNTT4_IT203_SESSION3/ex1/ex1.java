package PTIT_CNTT4_IT203_SESSION3.ex1;

import java.util.Scanner;

public class ex1 {
    static Scanner sc = new Scanner(System.in);

    static int[] addBookToLibraries(int n) {
        int[] arr = new int[n];
        System.out.println("Nhập mã số cho " + n + " cuốn sách:");
        for (int i = 0; i < n; i++) {
            System.out.print("Sách thứ " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    static void displayLibraries(int[] arr) {
        System.out.println("\n--- KẾT QUẢ ---");
        System.out.print("Danh sách mã sách: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) System.out.print(", ");
        }
    }

    public static void main(String[] args) {
        System.out.print("Nhập số lượng sách cần quản lý: ");
        int n = sc.nextInt();
        int[] books = addBookToLibraries(n);
        displayLibraries(books);
    }
}