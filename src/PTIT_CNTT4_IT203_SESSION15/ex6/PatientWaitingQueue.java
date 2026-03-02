package PTIT_CNTT4_IT203_SESSION15.ex6;
import java.util.LinkedList;
import java.util.Queue;

public class PatientWaitingQueue {
    private Queue<Patient> waitingQueue;
    private int totalPatients;

    public PatientWaitingQueue() {
        waitingQueue = new LinkedList<>();
        totalPatients = 0;
    }

    public void addPatient(Patient p) {
        waitingQueue.add(p);
        totalPatients++;
    }

    public Patient callNextPatient() {
        if (waitingQueue.isEmpty()) {
            return null;
        }
        totalPatients--;
        return waitingQueue.poll();
    }

    public int getTotalPatients() {
        return totalPatients;
    }
}