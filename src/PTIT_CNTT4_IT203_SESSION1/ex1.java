package PTIT_CNTT4_IT203_SESSION1;
import java.util.Scanner;

public class ex1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String bookID;
        String bookName;
        int publishYear;
        double price;
        boolean isAvailable;

        System.out.print("Nhập mã sách: ");
        bookID = sc.nextLine();
        System.out.print("Nhập tên sách: ");
        bookName = sc.nextLine();
        System.out.print("Nhập năm xuất bản: ");
        publishYear = sc.nextInt();
        System.out.print("Nhập giá: ");
        price = sc.nextDouble();
        System.out.print("Tình trạng sách (true = còn sách, false = đã mượn): ");
        isAvailable = sc.nextBoolean();

        int bookAge = 2026-publishYear;
        String bookNameUpper = bookName.toUpperCase();
        String status = isAvailable ? "Còn sách" : "Đã mượn";

        System.out.println("\n--- PHIẾU THÔNG TIN SÁCH ---");
        System.out.println("Mã sách: " + bookID);
        System.out.println("Tên sách: "+bookNameUpper);
        System.out.println("Năm xuất bản: " + publishYear);
        System.out.println("Giá tiền: %.2f\n" + price);
        System.out.println("Tuổi thọ sách: " + bookAge + "năm");
        System.out.println("Tình trang: " + status);

        sc.close();
    }
}
