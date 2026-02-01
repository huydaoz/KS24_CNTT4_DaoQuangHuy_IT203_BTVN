package PTIT_CNTT4_IT203_SESSION6.ex4;

public class ex4 {

    private String employeeId;
    private String employeeName;
    private double salary;

    public ex4() {
        this.employeeId = "N/A";
        this.employeeName = "N/A";
        this.salary = 0;
    }

    public ex4(String employeeId, String employeeName) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.salary = 0;
    }

    public ex4(String employeeId, String employeeName, double salary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.salary = salary;
    }

    public void displayInfo() {
        System.out.println("Mã NV: " + employeeId);
        System.out.println("Tên NV: " + employeeName);
        System.out.println("Lương: " + salary);
        System.out.println("--------------------");
    }

    public static void main(String[] args) {

        ex4 e1 = new ex4();
        ex4 e2 = new ex4("NV01", "Nguyễn Văn A");
        ex4 e3 = new ex4("NV02", "Trần Thị B", 15000000);

        e1.displayInfo();
        e2.displayInfo();
        e3.displayInfo();
    }
}
