package PTIT_CNTT4_IT203_SESSION13.ex3;
import java.util.ArrayList;
import java.util.List;

public class ex3 {
    public static <T> List<T> findCommonPatients(List<T> listA, List<T> listB) {
        List<T> result = new ArrayList<>();
        for (T item : listA) {
            if (listB.contains(item)) {
                result.add(item);
            }
        }
        return result;
    }
    public static void main(String[] args) {

        List<Integer> listIntA = new ArrayList<>();
        listIntA.add(101);
        listIntA.add(102);
        listIntA.add(105);

        List<Integer> listIntB = new ArrayList<>();
        listIntB.add(102);
        listIntB.add(105);
        listIntB.add(108);

        System.out.println(findCommonPatients(listIntA, listIntB));

        List<String> listStrA = new ArrayList<>();
        listStrA.add("DN01");
        listStrA.add("DN02");
        listStrA.add("DN03");

        List<String> listStrB = new ArrayList<>();
        listStrB.add("DN02");
        listStrB.add("DN04");

        System.out.println(findCommonPatients(listStrA, listStrB));
    }
}