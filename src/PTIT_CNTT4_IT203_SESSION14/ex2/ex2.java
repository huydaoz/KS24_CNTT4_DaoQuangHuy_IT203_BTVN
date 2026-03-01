package PTIT_CNTT4_IT203_SESSION14.ex2;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Map<String, String> drugCatalog = new HashMap<>();

        drugCatalog.put("T01", "Paracetamol");
        drugCatalog.put("T02", "Ibuprofen");
        drugCatalog.put("T03", "Amoxicillin");
        drugCatalog.put("T04", "Vitamin C");
        drugCatalog.put("T05", "Aspirin");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập mã thuốc:");
        String code = scanner.nextLine();

        if (drugCatalog.containsKey(code)) {
            System.out.println("Tên thuốc: " + drugCatalog.get(code));
        } else {
            System.out.println("Thuốc không tồn tại");
        }
    }
}