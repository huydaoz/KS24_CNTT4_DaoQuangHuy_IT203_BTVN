package PTIT_CNTT4_IT203_SESSION15.ex5;
public class ex5 {
    public static void main(String[] args) {

        EmergencyCaseQueue queue = new EmergencyCaseQueue();

        Patient p1 = new Patient("BN01", "Nguyễn Văn A", 45);
        Patient p2 = new Patient("BN02", "Trần Thị B", 30);

        EmergencyCase c1 = new EmergencyCase(p1);
        EmergencyCase c2 = new EmergencyCase(p2);

        queue.addCase(c1);
        queue.addCase(c2);

        EmergencyCase current = queue.getNextCase();
        System.out.println("Đang xử lý: " + current.getPatient());

        current.addStep(new TreatmentStep("Tiếp nhận", "08:00"));
        current.addStep(new TreatmentStep("Chẩn đoán", "08:10"));
        current.addStep(new TreatmentStep("Điều trị", "08:30"));

        current.displaySteps();

        current.undoStep();
        System.out.println("Sau khi undo:");
        current.displaySteps();

        EmergencyCase next = queue.getNextCase();
        System.out.println("Đang xử lý: " + next.getPatient());
    }
}