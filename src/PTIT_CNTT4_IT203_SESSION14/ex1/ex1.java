package PTIT_CNTT4_IT203_SESSION14.ex1;
import java.util.LinkedHashSet;
import java.util.Set;

public class ex1 {
    public static void main(String[] args) {
        Set<String> waitingPatients = new LinkedHashSet<>();

        waitingPatients.add("Nguyễn Văn A – Yên Bái");
        waitingPatients.add("Trần Thị B – Thái Bình");
        waitingPatients.add("Nguyễn Văn A – Yên Bái"); // trùng
        waitingPatients.add("Lê Văn C – Hưng Yên");

        System.out.println("Danh sách gọi khám:");
        for (String patient : waitingPatients) {
            System.out.println(patient);
        }
    }
}