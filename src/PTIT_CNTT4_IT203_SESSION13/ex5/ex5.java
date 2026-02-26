package PTIT_CNTT4_IT203_SESSION13.ex5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class ex5 {

    private static ArrayList<Patient> patients = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int choice;

        do {
            showMenu();
            choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    addPatient();
                    break;
                case 2:
                    updateDiagnosis();
                    break;
                case 3:
                    dischargePatient();
                    break;
                case 4:
                    sortPatients();
                    break;
                case 5:
                    displayPatients();
                    break;
            }

        } while (choice != 6);
    }

    private static void showMenu() {
        System.out.println("1. Tiếp nhận bệnh nhân");
        System.out.println("2. Cập nhật chẩn đoán");
        System.out.println("3. Xuất viện");
        System.out.println("4. Sắp xếp danh sách");
        System.out.println("5. Hiển thị danh sách");
        System.out.println("6. Thoát");
        System.out.print("Chọn chức năng: ");
    }

    private static void addPatient() {
        System.out.print("Nhập ID: ");
        String id = scanner.nextLine();

        if (findById(id) != null) {
            System.out.println("ID đã tồn tại.");
            return;
        }

        System.out.print("Nhập tên: ");
        String name = scanner.nextLine();

        System.out.print("Nhập tuổi: ");
        int age = Integer.parseInt(scanner.nextLine());

        System.out.print("Nhập chẩn đoán: ");
        String diagnosis = scanner.nextLine();

        patients.add(new Patient(id, name, age, diagnosis));
    }

    private static void updateDiagnosis() {
        System.out.print("Nhập ID: ");
        String id = scanner.nextLine();

        Patient p = findById(id);
        if (p == null) {
            System.out.println("Không tìm thấy bệnh nhân.");
            return;
        }

        System.out.print("Nhập chẩn đoán mới: ");
        p.setDiagnosis(scanner.nextLine());
    }

    private static void dischargePatient() {
        System.out.print("Nhập ID: ");
        String id = scanner.nextLine();

        Patient p = findById(id);
        if (p == null) {
            System.out.println("Không tìm thấy bệnh nhân.");
            return;
        }

        patients.remove(p);
    }

    private static void sortPatients() {
        Collections.sort(patients, new Comparator<Patient>() {
            public int compare(Patient p1, Patient p2) {
                if (p1.getAge() != p2.getAge()) {
                    return p2.getAge() - p1.getAge();
                }
                return p1.getFullName().compareToIgnoreCase(p2.getFullName());
            }
        });
    }

    private static void displayPatients() {
        for (Patient p : patients) {
            p.display();
        }
    }

    private static Patient findById(String id) {
        for (Patient p : patients) {
            if (p.getId().equals(id)) {
                return p;
            }
        }
        return null;
    }
}