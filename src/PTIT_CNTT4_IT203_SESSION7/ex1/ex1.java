package PTIT_CNTT4_IT203_SESSION7.ex1;

public class ex1 {

    static class Student {
        private String studentId;
        private String studentName;
        private static int totalStudent = 0;

        public Student(String studentId, String studentName) {
            this.studentId = studentId;
            this.studentName = studentName;
            totalStudent++;
        }

        public void displayInfo() {
            System.out.println("ID: " + studentId);
            System.out.println("Name: " + studentName);
        }

        public static void displayTotalStudent() {
            System.out.println("Total students: " + totalStudent);
        }
    }

    public static void main(String[] args) {

        Student s1 = new Student("SV001", "Nguyen Van A");
        Student s2 = new Student("SV002", "Tran Thi B");
        Student s3 = new Student("SV003", "Le Van C");

        s1.displayInfo();
        System.out.println();

        s2.displayInfo();
        System.out.println();

        s3.displayInfo();
        System.out.println();

        Student.displayTotalStudent();
    }
}
