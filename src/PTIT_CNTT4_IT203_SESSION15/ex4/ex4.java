package PTIT_CNTT4_IT203_SESSION15.ex4;
public class ex4 {
    public static void main(String[] args) {
        EmergencyQueue queue = new EmergencyQueue();

        queue.addPatient(new EmergencyPatient("BN01", "Nguyễn Văn A", 2));
        queue.addPatient(new EmergencyPatient("BN02", "Trần Thị B", 1));
        queue.addPatient(new EmergencyPatient("BN03", "Lê Văn C", 2));
        queue.addPatient(new EmergencyPatient("BN04", "Phạm Văn D", 1));

        EmergencyPatient p1 = queue.callNextPatient();
        System.out.println(p1);

        EmergencyPatient p2 = queue.callNextPatient();
        System.out.println(p2);

        queue.displayQueue();
    }
}