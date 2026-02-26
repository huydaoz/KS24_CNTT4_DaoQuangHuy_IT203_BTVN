package PTIT_CNTT4_IT203_SESSION13.ex4;
import java.util.LinkedList;

public class EmergencyRoom {
    private LinkedList<String> queue = new LinkedList<>();
    public void patientCheckIn(String name) {
        queue.addLast(name);
    }
    public void emergencyCheckIn(String name) {
        queue.addFirst(name);
    }
    public void treatPatient() {
        if (queue.isEmpty()) {
            return;
        }
        String patient = queue.removeFirst();
        if (patient.equals("C")) {
            System.out.println("Đang cấp cứu: " + patient);
        } else {
            System.out.println("Đang khám: " + patient);
        }
    }
}