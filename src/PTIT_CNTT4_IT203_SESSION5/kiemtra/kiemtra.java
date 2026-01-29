package PTIT_CNTT4_IT203_SESSION5.kiemtra;

import java.util.Scanner;
import java.util.regex.Pattern;

public class kiemtra {

    static final int MAX = 100;
    static String[] mssvList = new String[MAX];
    static int count = 0;

    static Scanner sc = new Scanner(System.in);

    static final String MSSV_REGEX = "^B\\d{7}$";

    public static void main(String[] args) {
        int choice;

        do {
            showMenu();
            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    display();
                    break;
                case 2:
                    addMSSV();
                    break;
                case 3:
                    updateMSSV();
                    break;
                case 4:
                    deleteMSSV();
                    break;
                case 5:
                    searchMSSV();
                    break;
                case 6:
                    System.out.println("Thoát chương trình!");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }

        } while (choice != 6);
    }

    static void showMenu() {
        System.out.println("\n===== MENU QUẢN LÝ MSSV =====");
        System.out.println("1. Hiển thị danh sách MSSV");
        System.out.println("2. Thêm MSSV mới");
        System.out.println("3. Cập nhật MSSV theo index");
        System.out.println("4. Xóa MSSV");
        System.out.println("5. Tìm kiếm MSSV");
        System.out.println("6. Thoát");
        System.out.print("Chọn: ");
    }

    static void display() {
        if (count == 0) {
            System.out.println("Danh sách rỗng!");
            return;
        }

        System.out.println("Danh sách MSSV:");
        for (int i = 0; i < count; i++) {
            System.out.println(i+1 + ": " + mssvList[i]);
        }
    }

    static void addMSSV() {
        if (count >= MAX) {
            System.out.println("Danh sách đã đầy!");
            return;
        }

        String mssv;
        while (true) {
            System.out.print("Nhập MSSV mới: ");
            mssv = sc.nextLine();

            if (Pattern.matches(MSSV_REGEX, mssv)) {
                break;
            } else {
                System.out.println("Sai định dạng! MSSV phải bắt đầu bằng B và có 7 chữ số.");
            }
        }

        mssvList[count++] = mssv;
        System.out.println("Thêm thành công!");
    }

    static void updateMSSV() {
        System.out.print("Nhập index cần sửa: ");
        int index = Integer.parseInt(sc.nextLine());

        if (index < 0 || index >= count) {
            System.out.println("Index không hợp lệ!");
            return;
        }

        String newMSSV;
        while (true) {
            System.out.print("Nhập MSSV mới: ");
            newMSSV = sc.nextLine();

            if (Pattern.matches(MSSV_REGEX, newMSSV)) {
                break;
            } else {
                System.out.println("Sai định dạng MSSV!");
            }
        }

        mssvList[index] = newMSSV;
        System.out.println("Cập nhật thành công!");
    }

    static void deleteMSSV() {
        System.out.print("Nhập MSSV cần xóa: ");
        String target = sc.nextLine();

        int pos = -1;
        for (int i = 0; i < count; i++) {
            if (mssvList[i].equalsIgnoreCase(target)) {
                pos = i;
                break;
            }
        }

        if (pos == -1) {
            System.out.println("Không tìm thấy MSSV!");
            return;
        }

        for (int i = pos; i < count - 1; i++) {
            mssvList[i] = mssvList[i + 1];
        }

        count--;
        System.out.println("Xóa thành công!");
    }

    static void searchMSSV() {
        System.out.print("Nhập chuỗi cần tìm: ");
        String key = sc.nextLine().toLowerCase();

        boolean found = false;
        for (int i = 0; i < count; i++) {
            if (mssvList[i].toLowerCase().contains(key)) {
                System.out.println(mssvList[i]);
                found = true;
            }
        }

        if (!found) {
            System.out.println("Không có MSSV nào phù hợp!");
        }
    }
}

