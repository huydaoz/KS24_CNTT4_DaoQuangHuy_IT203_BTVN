package PTIT_CNTT4_IT203_SESSION8.thuchanh;

import java.util.Scanner;

public class StudentManager {

    public static Student[] students = new Student[100];
    public static int count = 0;

    // ===== THÊM =====
    public static void addNewStudent() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ma SV: ");
        String id = sc.nextLine();

        for (int i = 0; i < count; i++) {
            if (students[i].getIdStudent().equalsIgnoreCase(id)) {
                System.out.println("Ma SV da ton tai!");
                return;
            }
        }

        System.out.print("Ho ten: ");
        String name = sc.nextLine();
        System.out.print("Tuoi: ");
        int age = Integer.parseInt(sc.nextLine());
        System.out.print("Gioi tinh: ");
        String sex = sc.nextLine();
        System.out.print("Toan: ");
        double m = Double.parseDouble(sc.nextLine());
        System.out.print("Ly: ");
        double l = Double.parseDouble(sc.nextLine());
        System.out.print("Hoa: ");
        double h = Double.parseDouble(sc.nextLine());

        students[count++] = new Student(id, name, age, sex, m, l, h);
        System.out.println("Them thanh cong!");
    }

    // ===== HIỂN THỊ =====
    public static void displayAllStudents() {
        if (count == 0) {
            System.out.println("Danh sach rong!");
            return;
        }

        System.out.printf("| %-10s | %-20s | %-5s | %-10s | %-7s | %-10s |\n",
                "Ma SV", "Ho ten", "Tuoi", "Gioi tinh", "DTB", "Xep loai");

        for (int i = 0; i < count; i++) {
            Student s = students[i];
            System.out.printf("| %-10s | %-20s | %-5d | %-10s | %-7.2f | %-10s |\n",
                    s.getIdStudent(), s.getFullName(), s.getAge(),
                    s.getSex(), s.getAverageScore(), s.getRank());
        }
    }

    // ===== TÌM =====
    public static void searchStudent() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma hoac ten: ");
        String key = sc.nextLine().toLowerCase();

        boolean found = false;
        for (int i = 0; i < count; i++) {
            if (students[i].getIdStudent().toLowerCase().equals(key)
                    || students[i].getFullName().toLowerCase().contains(key)) {
                students[i].display();
                found = true;
            }
        }
        if (!found) System.out.println("Khong tim thay!");
    }

    // ===== CẬP NHẬT =====
    public static void updateStudent() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma SV: ");
        String id = sc.nextLine();

        for (int i = 0; i < count; i++) {
            if (students[i].getIdStudent().equalsIgnoreCase(id)) {
                System.out.print("Ten moi: ");
                students[i].setFullName(sc.nextLine());
                System.out.print("Tuoi moi: ");
                students[i].setAge(Integer.parseInt(sc.nextLine()));
                System.out.println("Cap nhat xong!");
                return;
            }
        }
        System.out.println("Khong tim thay!");
    }

    // ===== XÓA =====
    public static void deleteStudent(Scanner sc) {
        System.out.print("Nhap ma SV can xoa: ");
        String id = sc.nextLine();

        for (int i = 0; i < count; i++) {
            if (students[i].getIdStudent().equalsIgnoreCase(id)) {
                for (int j = i; j < count - 1; j++)
                    students[j] = students[j + 1];
                students[--count] = null;
                System.out.println("Xoa thanh cong!");
                return;
            }
        }
        System.out.println("Khong tim thay!");
    }

    // ===== ĐTB & XẾP LOẠI =====
    public static void displayAverageAndRank() {
        for (int i = 0; i < count; i++) {
            students[i].display();
        }
    }

    // ===== SẮP XẾP =====
    public static void sortByAverageDesc() {
        for (int i = 0; i < count - 1; i++)
            for (int j = 0; j < count - i - 1; j++)
                if (students[j].getAverageScore() < students[j + 1].getAverageScore()) {
                    Student t = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = t;
                }
        System.out.println("Da sap xep theo DTB!");
    }

    public static void sortByNameAZ() {
        for (int i = 0; i < count - 1; i++)
            for (int j = i + 1; j < count; j++)
                if (students[i].getFullName()
                        .compareToIgnoreCase(students[j].getFullName()) > 0) {
                    Student t = students[i];
                    students[i] = students[j];
                    students[j] = t;
                }
        System.out.println("Da sap xep theo ten!");
    }

    // ===== THỐNG KÊ =====
    public static void statistic() {
        if (count == 0) return;

        Student max = students[0], min = students[0];
        for (int i = 1; i < count; i++) {
            if (students[i].getAverageScore() > max.getAverageScore()) max = students[i];
            if (students[i].getAverageScore() < min.getAverageScore()) min = students[i];
        }

        System.out.println("SV diem cao nhat:");
        max.display();
        System.out.println("SV diem thap nhat:");
        min.display();
    }
}