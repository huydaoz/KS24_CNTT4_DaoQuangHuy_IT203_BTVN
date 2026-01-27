package PTIT_CNTT4_IT203_SESSION3.ex2;
import java.util.Scanner;

public class ex2 {
    static int searchBooks(String[] arr, String search) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equalsIgnoreCase(search)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] books = {
                "Doraemon",
                "Conan",
                "Harry Potter",
                "Sherlock Holmes",
                "Clean Code"
        };

        System.out.print("Nhập tên sách cần tìm: ");
        String search = sc.nextLine();

        int index = searchBooks(books, search);

        if (index != -1) {
            System.out.println("Tìm thấy sách '" + search + "' tại vị trí số: " + index);
        } else {
            System.out.println("Sách không tồn tại trong thư viện.");
        }
    }
}
