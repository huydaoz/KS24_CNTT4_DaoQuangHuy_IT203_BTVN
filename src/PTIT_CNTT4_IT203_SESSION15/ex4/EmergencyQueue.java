package PTIT_CNTT4_IT203_SESSION15.ex4;
import java.util.LinkedList;
import java.util.Queue;

public class EmergencyQueue {

    private Queue<EmergencyPatient> emergencyQueue;
    private Queue<EmergencyPatient> normalQueue;

    public EmergencyQueue() {
        emergencyQueue = new LinkedList<>();
        normalQueue = new LinkedList<>();
    }

    public void addPatient(EmergencyPatient p) {
        if (p.getPriority() == 1) {
            emergencyQueue.add(p);
        } else {
            normalQueue.add(p);
        }
    }

    public EmergencyPatient callNextPatient() {
        if (!emergencyQueue.isEmpty()) {
            return emergencyQueue.poll();
        }
        if (!normalQueue.isEmpty()) {
            return normalQueue.poll();
        }
        return null;
    }

    public void displayQueue() {
        for (EmergencyPatient p : emergencyQueue) {
            System.out.println(p);
        }
        for (EmergencyPatient p : normalQueue) {
            System.out.println(p);
        }
    }
}