package PTIT_CNTT4_IT203_SESSION13.ex2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ex2 {
    public static List<String> getUniqueAndSortedMedicines(List<String> medicines) {
        List<String> result = new ArrayList<>();
        for (String medicine : medicines) {
            if (!result.contains(medicine)) {
                result.add(medicine);
            }
        }
        Collections.sort(result);
        return result;
    }
    public static void main(String[] args) {
        List<String> input = new ArrayList<>();
        input.add("Paracetamol");
        input.add("Ibuprofen");
        input.add("Panadol");
        input.add("Paracetamol");
        input.add("Aspirin");
        input.add("Ibuprofen");

        List<String> output = getUniqueAndSortedMedicines(input);
        System.out.println(output);
    }
}