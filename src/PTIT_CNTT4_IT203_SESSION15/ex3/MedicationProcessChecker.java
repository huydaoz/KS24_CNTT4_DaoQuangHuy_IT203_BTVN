package PTIT_CNTT4_IT203_SESSION15.ex3;
import java.util.Stack;

public class MedicationProcessChecker {

    private Stack<String> stack;

    public MedicationProcessChecker() {
        stack = new Stack<>();
    }

    public boolean checkProcess(String[] actions) {
        for (int i = 0; i < actions.length; i++) {
            String action = actions[i];

            if (action.equalsIgnoreCase("PUSH")) {
                stack.push("MEDICATION");
            }
            else if (action.equalsIgnoreCase("POP")) {
                if (stack.isEmpty()) {
                    System.out.println(" Sai tại bước " + (i + 1)
                            + ": POP khi chưa có thuốc để hoàn tất.");
                    return false;
                }
                stack.pop();
            }
            else {
                System.out.println(" Thao tác không hợp lệ tại bước " + (i + 1));
                return false;
            }
        }

        if (!stack.isEmpty()) {
            System.out.println(" Kết thúc ca trực nhưng còn "
                    + stack.size() + " thuốc chưa hoàn tất.");
            return false;
        }

        System.out.println(" Quy trình phát thuốc HỢP LỆ.");
        return true;
    }

    public void reset() {
        stack.clear();
    }
}
