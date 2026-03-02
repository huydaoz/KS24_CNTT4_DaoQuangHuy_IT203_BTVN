package PTIT_CNTT4_IT203_SESSION15.ex3;
public class ex3 {
    public static void main(String[] args) {
        MedicationProcessChecker checker = new MedicationProcessChecker();

        // Test 1: Hợp lệ
        String[] actions1 = {"PUSH", "PUSH", "POP", "POP"};
        System.out.println("Test 1:");
        checker.checkProcess(actions1);

        checker.reset();

        // Test 2: POP khi stack rỗng
        String[] actions2 = {"POP", "PUSH"};
        System.out.println("\nTest 2:");
        checker.checkProcess(actions2);

        checker.reset();

        // Test 3: Kết thúc nhưng chưa POP hết
        String[] actions3 = {"PUSH", "PUSH", "POP"};
        System.out.println("\nTest 3:");
        checker.checkProcess(actions3);
    }
}