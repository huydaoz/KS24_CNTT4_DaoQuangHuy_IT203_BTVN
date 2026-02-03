package PTIT_CNTT4_IT203_SESSION8.thuchanh;
import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("-------Quan ly sinh vien--------");
            System.out.println("1.Them sinh vien moi");
            System.out.println("2.Hien thi tat ca sinh vien");
            System.out.println("3.Tim kiem sinh vien");
            System.out.println("4.Cap nhat thong tin sinh vien");
            System.out.println("5.Xoa sinh vien");
            System.out.println("6.Tinh diem trung binh va xep loai");
            System.out.println("7.Sap xep sinh vien");
            System.out.println("8.Thong ke");
            System.out.println("9.Thoat");
            System.out.print("Lua chon cua ban: ");

            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    StudentManager.addNewStudent();
                    break;
                case 2:
                    StudentManager.displayAllStudents();
                    break;
                case 3:
                    StudentManager.searchStudent();
                    break;
                case 4:
                    StudentManager.updateStudent();
                    break;
                case 5:
                    StudentManager.deleteStudent(sc);
                    break;
                case 6:
                    StudentManager.displayAverageAndRank();
                    break;
                case 7:
                    System.out.println("1. Sap xep theo DTB giam dan");
                    System.out.println("2. Sap xep theo ten A-Z");
                    int c = Integer.parseInt(sc.nextLine());
                    if (c == 1) StudentManager.sortByAverageDesc();
                    else if (c == 2) StudentManager.sortByNameAZ();
                    else System.out.println("Lua chon sai!");
                    break;
                case 8:
                    StudentManager.statistic();
                    break;
                case 9:
                    System.out.println("Da thoat!");
                    break;
                default:
                    System.out.println("Lua chon khong hop le!");
            }
        } while (choice != 9);
    }
}
