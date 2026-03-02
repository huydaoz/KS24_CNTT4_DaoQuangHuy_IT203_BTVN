package PTIT_CNTT4_IT203_SESSION15.ex2;

import java.util.LinkedList;
import java.util.Queue;

public class PatientQueue {
    private Queue<Patient> queue;

    public PatientQueue() {
        queue = new LinkedList<>();
    }

    public void addPatient(Patient p) {
        queue.add(p);
        System.out.println("Đã thêm bệnh nhân: " + p);
    }

    public Patient callNextPatient() {
        if (queue.isEmpty()) {
            System.out.println("Không còn bệnh nhân chờ khám!");
            return null;
        }
        Patient p = queue.poll();
        System.out.println("Đang gọi khám: " + p);
        return p;
    }

    public Patient peekNextPatient() {
        if (queue.isEmpty()) {
            System.out.println("Danh sách chờ trống!");
            return null;
        }
        return queue.peek();
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public void displayQueue() {
        if (queue.isEmpty()) {
            System.out.println("Không có bệnh nhân nào đang chờ.");
            return;
        }

        System.out.println("Danh sách bệnh nhân đang chờ:");
        for (Patient p : queue) {
            System.out.println(p);
        }
    }
}