package PTIT_CNTT4_IT203_SESSION15.ex1;
import java.util.Stack;

public class MedicalRecordHistory {
    private Stack<EditAction> history;

    public MedicalRecordHistory() {
        history = new Stack<>();
    }

    public void addEdit(EditAction action) {
        history.push(action);
        System.out.println("Đã thêm chỉnh sửa: " + action);
    }

    public EditAction undoEdit() {
        if (history.isEmpty()) {
            System.out.println("Không có chỉnh sửa nào để undo!");
            return null;
        }
        EditAction removed = history.pop();
        System.out.println("Đã undo chỉnh sửa: " + removed);
        return removed;
    }

    public EditAction getLatestEdit() {
        if (history.isEmpty()) {
            System.out.println("Lịch sử chỉnh sửa trống!");
            return null;
        }
        return history.peek();
    }

    public boolean isEmpty() {
        return history.isEmpty();
    }

    public void displayHistory() {
        if (history.isEmpty()) {
            System.out.println("Không có chỉnh sửa nào trong lịch sử.");
            return;
        }

        System.out.println(" Lịch sử chỉnh sửa bệnh án:");
        for (int i = history.size() - 1; i >= 0; i--) {
            System.out.println(history.get(i));
        }
    }
}
