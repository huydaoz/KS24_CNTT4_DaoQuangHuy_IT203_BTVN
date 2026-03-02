package PTIT_CNTT4_IT203_SESSION15.ex1;
public class ex1 {
    public static void main(String[] args) {
        MedicalRecordHistory history = new MedicalRecordHistory();

        history.addEdit(new EditAction("Cập nhật chẩn đoán", "08:30"));
        history.addEdit(new EditAction("Thay đổi đơn thuốc", "09:00"));
        history.addEdit(new EditAction("Bổ sung kết quả xét nghiệm", "09:45"));

        System.out.println("\n Chỉnh sửa gần nhất:");
        System.out.println(history.getLatestEdit());

        System.out.println("\n↩ Undo chỉnh sửa:");
        history.undoEdit();

        System.out.println("\n Lịch sử sau khi undo:");
        history.displayHistory();
    }
}
