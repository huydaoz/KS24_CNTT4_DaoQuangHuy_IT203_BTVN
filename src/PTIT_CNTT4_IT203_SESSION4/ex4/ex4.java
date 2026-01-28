package PTIT_CNTT4_IT203_SESSION4.ex4;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ex4 {
    public static void main(String[] args) {
    String cardID = "TV202312345";

    if (!cardID.matches("^[A-Z]{2}.*")) {
        System.out.println("Thiếu tiền tố hợp lệ (2 chữ cái viết hoa)");
        return;
    }

    if (!cardID.matches("^[A-Z]{2}\\d{4}.*")) {
        System.out.println("Năm không hợp lệ");
        return;
    }

    Pattern pattern = Pattern.compile("^[A-Z]{2}\\d{4}\\d{5}$");
    Matcher matcher = pattern.matcher(cardID);

    if (matcher.matches()) {
        System.out.println("Mã thẻ hợp lệ!");
    } else {
        System.out.println("Sai định dạng mã thẻ");
    }
}
}
