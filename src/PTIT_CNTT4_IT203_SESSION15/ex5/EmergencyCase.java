package PTIT_CNTT4_IT203_SESSION15.ex5;
import java.util.Stack;

public class EmergencyCase {
    private Patient patient;
    private Stack<TreatmentStep> steps;

    public EmergencyCase(Patient patient) {
        this.patient = patient;
        steps = new Stack<>();
    }

    public Patient getPatient() {
        return patient;
    }

    public void addStep(TreatmentStep step) {
        steps.push(step);
    }

    public TreatmentStep undoStep() {
        if (steps.isEmpty()) {
            return null;
        }
        return steps.pop();
    }

    public void displaySteps() {
        if (steps.isEmpty()) {
            System.out.println("Chưa có bước xử lý nào");
            return;
        }
        for (int i = steps.size() - 1; i >= 0; i--) {
            System.out.println(steps.get(i));
        }
    }
}