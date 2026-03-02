package PTIT_CNTT4_IT203_SESSION15.ex5;

import java.util.LinkedList;
import java.util.Queue;

public class EmergencyCaseQueue {
    private Queue<EmergencyCase> cases;

    public EmergencyCaseQueue() {
        cases = new LinkedList<>();
    }

    public void addCase(EmergencyCase c) {
        cases.add(c);
    }

    public EmergencyCase getNextCase() {
        if (cases.isEmpty()) {
            return null;
        }
        return cases.poll();
    }
}
