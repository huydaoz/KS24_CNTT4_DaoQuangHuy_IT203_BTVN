package PTIT_CNTT4_IT203_SESSION1.ex3;

public class ex3 {
    public static void main(String[] args) {

        // Hai biến String (biến tham chiếu) nằm trên STACK
        String book1 = "Java Basic";
        String book2 = "Python Intro";

        // Biến tạm
        String temp;

        // Hoán đổi giá trị
        temp = book1;   // temp trỏ tới "Java Basic"
        book1 = book2;  // book1 trỏ tới "Python Intro"
        book2 = temp;   // book2 trỏ tới "Java Basic"
    }
}
// Khi hoán đổi String bằng biến tạm:
// - Stack: các biến (book1, book2, temp) thay đổi tham chiếu
// - Heap: KHÔNG tạo String mới vì String là immutable
// - Chỉ có hướng trỏ của biến trên Stack thay đổi
