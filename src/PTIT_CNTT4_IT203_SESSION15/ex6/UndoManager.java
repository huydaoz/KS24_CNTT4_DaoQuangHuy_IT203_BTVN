package PTIT_CNTT4_IT203_SESSION15.ex6;
import java.util.Stack;

public class UndoManager {
    private Stack<InputAction> undoStack;
    private int maxUndoSteps;

    public UndoManager(int maxUndoSteps) {
        this.maxUndoSteps = maxUndoSteps;
        undoStack = new Stack<>();
    }

    public void addAction(InputAction action) {
        if (undoStack.size() >= maxUndoSteps) {
            undoStack.remove(0);
        }
        undoStack.push(action);
    }

    public InputAction undo() {
        if (undoStack.isEmpty()) {
            return null;
        }
        return undoStack.pop();
    }
}