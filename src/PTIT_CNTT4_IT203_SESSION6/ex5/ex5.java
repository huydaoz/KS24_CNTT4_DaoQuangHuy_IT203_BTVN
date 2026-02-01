package PTIT_CNTT4_IT203_SESSION6.ex5;

public class ex5 {

    private String bookId;
    private String bookTitle;
    private String author;
    private double price;

    public ex5(String bookId, String bookTitle, String author, double price) {
        this.bookId = bookId;
        this.bookTitle = bookTitle;
        this.author = author;
        this.price = price;
    }

    public void displayInfo() {
        System.out.println("Mã sách: " + bookId);
        System.out.println("Tên sách: " + bookTitle);
        System.out.println("Tác giả: " + author);
        System.out.println("Giá: " + price);
        System.out.println("--------------------");
    }

    public static void main(String[] args) {

        ex5 b1 = new ex5("B01", "Java Cơ Bản", "Nguyễn Văn A", 120000);
        ex5 b2 = new ex5("B02", "OOP Java", "Trần Thị B", 150000);

        b1.displayInfo();
        b2.displayInfo();
    }
}

