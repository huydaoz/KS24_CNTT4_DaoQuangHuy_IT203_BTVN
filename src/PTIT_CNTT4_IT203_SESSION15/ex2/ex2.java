package PTIT_CNTT4_IT203_SESSION15.ex2;

public class ex2 {
    public static void main(String[] args) {
        PatientQueue patientQueue = new PatientQueue();

        patientQueue.addPatient(new Patient("BN01", "Nguyễn Văn A", 30));
        patientQueue.addPatient(new Patient("BN02", "Trần Thị B", 25));
        patientQueue.addPatient(new Patient("BN03", "Lê Văn C", 40));

        System.out.println("\n Bệnh nhân tiếp theo:");
        System.out.println(patientQueue.peekNextPatient());

        System.out.println("\n Gọi bệnh nhân khám:");
        patientQueue.callNextPatient();

        System.out.println("\n Danh sách còn chờ:");
        patientQueue.displayQueue();
    }
}