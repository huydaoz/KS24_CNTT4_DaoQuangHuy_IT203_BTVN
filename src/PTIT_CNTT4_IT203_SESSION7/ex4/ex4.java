package PTIT_CNTT4_IT203_SESSION7.ex4;

public class ex4 {

    static class ClassRoom {
        private String studentName;
        private static double classFund = 0;

        public ClassRoom(String studentName) {
            this.studentName = studentName;
        }

        public void payFund(double amount) {
            classFund += amount;
            System.out.println(studentName + " đóng " + amount + " vào quỹ lớp");
        }

        public static void showClassFund() {
            System.out.println("Tổng quỹ lớp: " + classFund);
        }
    }

    public static void main(String[] args) {

        ClassRoom s1 = new ClassRoom("An");
        ClassRoom s2 = new ClassRoom("Binh");
        ClassRoom s3 = new ClassRoom("Chi");

        s1.payFund(100_000);
        s2.payFund(150_000);
        s3.payFund(200_000);

        System.out.println();
        ClassRoom.showClassFund();
    }
}
