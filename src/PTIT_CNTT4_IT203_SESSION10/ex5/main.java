package PTIT_CNTT4_IT203_SESSION10.ex5;

public class main {
    public static void main(String[] args) {

        Employee e1 = new OfficeStaff("Nam", 8000);
        Employee e2 = new Manager("Huy", 15000, 3000);

        System.out.println("===== BANG LUONG =====");

        System.out.println("Nhan vien: " + e1.name);
        System.out.println("Luong: " + e1.calculateSalary());

        System.out.println();

        System.out.println("Nhan vien: " + e2.name);
        System.out.println("Luong: " + e2.calculateSalary());
    }
}
