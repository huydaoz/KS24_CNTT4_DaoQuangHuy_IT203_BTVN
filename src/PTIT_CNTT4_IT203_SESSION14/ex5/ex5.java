package PTIT_CNTT4_IT203_SESSION14.ex5;
import java.util.Set;
import java.util.TreeSet;

class Patient {
    String name;
    int severity;
    int arrivalTime;

    Patient(String name, int severity, int arrivalTime) {
        this.name = name;
        this.severity = severity;
        this.arrivalTime = arrivalTime;
    }

    @Override
    public String toString() {
        String level =
                severity == 1 ? "Nguy kịch" :
                        severity == 2 ? "Nặng" : "Nhẹ";

        return name + " (Mức " + severity + " - " + level + ", đến lúc " + arrivalTime + ")";
    }
}

public class ex5 {

    public static void main(String[] args) {

        Set<Patient> triageQueue = new TreeSet<>(
                (p1, p2) -> {
                    if (p1.severity != p2.severity) {
                        return Integer.compare(p1.severity, p2.severity);
                    }
                    return Integer.compare(p1.arrivalTime, p2.arrivalTime);
                }
        );

        triageQueue.add(new Patient("Bệnh nhân A", 3, 800));
        triageQueue.add(new Patient("Bệnh nhân B", 1, 815));
        triageQueue.add(new Patient("Bệnh nhân C", 1, 805));

        for (Patient p : triageQueue) {
            System.out.println(p);
        }
    }
}