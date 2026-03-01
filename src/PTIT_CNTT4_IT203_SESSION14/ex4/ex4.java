package PTIT_CNTT4_IT203_SESSION14.ex4;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class ex4 {
    public static void main(String[] args) {
        List<String> cases = Arrays.asList("Cúm A", "Sốt xuất huyết", "Cúm A", "Covid-19", "Cúm A", "Sốt xuất huyết");
        Map<String, Integer> statistics = new TreeMap<>();
        for (String disease : cases) {
            statistics.put(disease, statistics.getOrDefault(disease, 0) + 1);
        }
        for (Map.Entry<String, Integer> entry : statistics.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " ca");
        }
    }
}