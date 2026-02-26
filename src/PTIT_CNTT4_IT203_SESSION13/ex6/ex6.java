package PTIT_CNTT4_IT203_SESSION13.ex6;
import java.util.ArrayList;
import java.util.Scanner;

public class ex6 {

    private static ArrayList<Medicine> medicines = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int choice;

        do {
            showMenu();
            choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    addMedicine();
                    break;
                case 2:
                    updateQuantity();
                    break;
                case 3:
                    removeMedicine();
                    break;
                case 4:
                    printInvoice();
                    break;
                case 5:
                    findCheapMedicine();
                    break;
                case 6:
                    System.out.println("Thoát chương trình.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ.");
            }

        } while (choice != 6);
    }

    private static void showMenu() {
        System.out.println("||========================MENU========================||");
        System.out.println("|| 1. Thêm thuốc vào đơn                             ||");
        System.out.println("|| 2. Điều chỉnh số lượng                            ||");
        System.out.println("|| 3. Xóa thuốc                                      ||");
        System.out.println("|| 4. In hóa đơn                                     ||");
        System.out.println("|| 5. Tìm thuốc giá rẻ                               ||");
        System.out.println("|| 6. Thoát                                          ||");
        System.out.println("||====================================================||");
        System.out.print("Chọn lựa chọn: ");
    }

    private static void addMedicine() {
        System.out.print("Nhập mã thuốc: ");
        String id = scanner.nextLine();

        Medicine m = findById(id);
        if (m != null) {
            System.out.print("Nhập số lượng thêm: ");
            int qty = Integer.parseInt(scanner.nextLine());
            m.addQuantity(qty);
            System.out.println("Cập nhật số lượng thành công !");
            return;
        }

        System.out.print("Nhập tên thuốc: ");
        String name = scanner.nextLine();

        System.out.print("Nhập giá thuốc: ");
        double price = Double.parseDouble(scanner.nextLine());

        System.out.print("Nhập số lượng: ");
        int qty = Integer.parseInt(scanner.nextLine());

        medicines.add(new Medicine(id, name, price, qty));
        System.out.println("Thêm thuốc thành công !");
    }

    private static void updateQuantity() {
        while (true) {
            System.out.print("Nhập mã thuốc: ");
            String id = scanner.nextLine();

            Medicine m = findById(id);
            if (m == null) {
                System.out.println("Thuốc không tồn tại trong đơn.");
                continue;
            }

            System.out.print("Nhập số lượng mới: ");
            int qty = Integer.parseInt(scanner.nextLine());

            if (qty == 0) {
                medicines.remove(m);
            } else {
                m.setQuantity(qty);
            }

            System.out.println("Cập nhật thuốc thành công !");
            break;
        }
    }

    private static void removeMedicine() {
        System.out.print("Nhập mã thuốc cần xóa: ");
        String id = scanner.nextLine();

        Medicine m = findById(id);
        if (m == null) {
            System.out.println("Id thuốc không tồn tại !");
            return;
        }

        medicines.remove(m);
        System.out.println("Xóa thuốc thành công !");
    }

    private static void printInvoice() {
        if (medicines.isEmpty()) {
            System.out.println("Đơn thuốc trống.");
            return;
        }

        double total = 0;

        System.out.println("Mã Thuốc\tTên Thuốc\t\tĐơn Giá\t\tSố Lượng");
        for (Medicine m : medicines) {
            System.out.printf("%s\t\t%s\t\t%.2f\t\t%d\n",
                    m.getDrugId(),
                    m.getDrugName(),
                    m.getUnitPrice(),
                    m.getQuantity()
            );
            total += m.getTotalPrice();
        }

        System.out.println("Tổng tiền: " + total + " VNĐ");
    }

    private static void findCheapMedicine() {
        System.out.println("Mã Thuốc\tTên Thuốc\t\tĐơn Giá");
        for (Medicine m : medicines) {
            if (m.getUnitPrice() < 50000) {
                System.out.printf("%s\t\t%s\t\t%.2f\n",
                        m.getDrugId(),
                        m.getDrugName(),
                        m.getUnitPrice()
                );
            }
        }
    }

    private static Medicine findById(String id) {
        for (Medicine m : medicines) {
            if (m.getDrugId().equals(id)) {
                return m;
            }
        }
        return null;
    }
}