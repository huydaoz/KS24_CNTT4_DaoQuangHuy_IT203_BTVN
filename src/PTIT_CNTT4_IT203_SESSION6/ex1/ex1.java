package PTIT_CNTT4_IT203_SESSION6.ex1;

public class ex1 {

    private String studentId;
    private String fullName;
    private int birthYear;
    private double gpa;

    public ex1(String studentId, String fullName, int birthYear, double gpa) {
        this.studentId = studentId;
        this.fullName = fullName;
        this.birthYear = birthYear;
        this.gpa = gpa;
    }

    public void displayInfo() {
        System.out.println("Mã SV: " + studentId);
        System.out.println("Họ tên: " + fullName);
        System.out.println("Năm sinh: " + birthYear);
        System.out.println("Điểm TB: " + gpa);
    }

    public static void main(String[] args) {

        ex1 sv1 = new ex1("SV001", "Nguyễn Văn A", 2004, 8.2);
        ex1 sv2 = new ex1("SV002", "Trần Thị B", 2003, 7.8);

        sv1.displayInfo();
        sv2.displayInfo();
    }
}
