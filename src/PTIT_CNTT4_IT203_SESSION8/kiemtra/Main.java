package PTIT_CNTT4_IT203_SESSION8.kiemtra;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static Student[] students = new Student[100];
    static int count = 0;

    public static void main(String[] args) {
        int choice;
        do {
            showMenu();
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    inputStudents();
                    break;
                case 2:
                    displayStudents();
                    break;
                case 3:
                    searchByRank();
                    break;
                case 4:
                    sortByRankDesc();
                    break;
                case 5:
                    System.out.println("Thoát chương trình.");
                    break;
                default:
                    System.out.println("Chức năng không hợp lệ!");
            }
        } while (choice != 5);
    }

    static void showMenu() {
        System.out.println("--- QUẢN LÝ ĐIỂM SINH VIÊN ---");
        System.out.println("1. Nhập danh sách sinh viên");
        System.out.println("2. Hiển thị danh sách sinh viên");
        System.out.println("3. Tìm kiếm sinh viên theo Học lực");
        System.out.println("4. Sắp xếp theo học lực giảm dần");
        System.out.println("5. Thoát");
        System.out.println("-----------------------------------");
        System.out.print("Chọn chức năng: ");
    }

    static void inputStudents() {
        System.out.print("Nhập số lượng sinh viên: ");
        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {
            System.out.println("Sinh viên thứ " + (i + 1));

            String id;
            while (true) {
                System.out.print("Nhập mã SV (SVxxx): ");
                id = sc.nextLine();
                if (isValidId(id)) {
                    break;
                }
                System.out.println("Mã không hợp lệ!");
            }

            System.out.print("Nhập họ tên: ");
            String name = sc.nextLine();

            System.out.print("Nhập điểm trung bình: ");
            double score = Double.parseDouble(sc.nextLine());

            students[count++] = new Student(id, name, score);
        }
    }

    static boolean isValidId(String id) {
        if (!id.startsWith("SV") || id.length() != 5) {
            return false;
        }
        try {
            Integer.parseInt(id.substring(2));
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    static void displayStudents() {
        if (count == 0) {
            System.out.println("Danh sách rỗng!");
            return;
        }

        for (int i = 0; i < count; i++) {
            System.out.println(students[i]);
        }
    }

    static void searchByRank() {
        System.out.print("Nhập học lực cần tìm (Gioi/Kha/Trung Binh): ");
        String rank = sc.nextLine();

        boolean found = false;
        for (int i = 0; i < count; i++) {
            if (students[i].getRank().equalsIgnoreCase(rank)) {
                System.out.println(students[i]);
                found = true;
            }
        }

        if (!found) {
            System.out.println("Không tìm thấy sinh viên phù hợp!");
        }
    }

    static void sortByRankDesc() {
        for (int i = 0; i < count - 1; i++) {
            for (int j = i + 1; j < count; j++) {
                if (students[i].getScore() < students[j].getScore()) {
                    Student temp = students[i];
                    students[i] = students[j];
                    students[j] = temp;
                }
            }
        }
        System.out.println("Đã sắp xếp theo học lực giảm dần!");
    }
}

