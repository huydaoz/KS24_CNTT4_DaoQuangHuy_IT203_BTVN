package PTIT_CNTT4_IT203_SESSION3.ex5;
import java.util.Scanner;

public class ex5 {
    static int deleteBook(int[] arr, int n, int bookId) {
        int pos = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] == bookId) {
                pos = i;
                break;
            }
        }

        if (pos == -1) return n;

        for (int i = pos; i < n - 1; i++) {
            arr[i] = arr[i + 1];
        }

        System.out.println("Đã xóa sách mã " + bookId);
        return n - 1;
    }

    static void displayBooks(int[] arr, int n) {
        System.out.print("Kho sách hiện tại (" + n + " cuốn): [ ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] books = {101, 102, 103, 104, 105};
        int n = 5;

        while (n > 0) {
            displayBooks(books, n);
            System.out.print("Nhập mã sách cần xóa (0 để thoát): ");
            int id = sc.nextInt();

            if (id == 0) break;

            int newN = deleteBook(books, n, id);
            if (newN == n) {
                System.out.println("Không tìm thấy sách mã " + id);
            }
            n = newN;
        }
    }
}
