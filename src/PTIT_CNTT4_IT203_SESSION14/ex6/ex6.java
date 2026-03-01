package PTIT_CNTT4_IT203_SESSION14.ex6;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Patient {
    String name;
    int age;
    String department;

    Patient(String name, int age, String department) {
        this.name = name;
        this.age = age;
        this.department = department;
    }

    @Override
    public String toString() {
        return name;
    }
}

public class ex6 {
    public static void main(String[] args) {
        List<Patient> patients = new ArrayList<>();
        patients.add(new Patient("Lan", 30, "Tim mạch"));
        patients.add(new Patient("Hùng", 45, "Nội tiết"));
        patients.add(new Patient("Mai", 25, "Tim mạch"));

        Map<String, List<Patient>> departmentMap = new HashMap<>();
        for (Patient p : patients) {
            departmentMap
                    .computeIfAbsent(p.department, k -> new ArrayList<>())
                    .add(p);
        }
        for (Map.Entry<String, List<Patient>> entry : departmentMap.entrySet()) {
            System.out.println("Khoa " + entry.getKey() + " -> " + entry.getValue());
        }
        String busiestDepartment = null;
        int maxPatients = 0;

        for (Map.Entry<String, List<Patient>> entry : departmentMap.entrySet()) {
            if (entry.getValue().size() > maxPatients) {
                maxPatients = entry.getValue().size();
                busiestDepartment = entry.getKey();
            }
        }
        System.out.println("Khoa " + busiestDepartment + " đang đông nhất (" + maxPatients + " bệnh nhân)");
    }
}