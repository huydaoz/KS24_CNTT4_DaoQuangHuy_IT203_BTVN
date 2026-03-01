package PTIT_CNTT4_IT203_SESSION14.ex3;
import java.util.HashSet;
import java.util.Set;

public class ex3 {
    public static void main(String[] args) {
        Set<String> drugComponents = new HashSet<>();
        drugComponents.add("Aspirin");
        drugComponents.add("Caffeine");
        drugComponents.add("Paracetamol");

        Set<String> allergySubstances = new HashSet<>();
        allergySubstances.add("Penicillin");
        allergySubstances.add("Aspirin");

        Set<String> warningAllergy = new HashSet<>(drugComponents);
        warningAllergy.retainAll(allergySubstances);

        Set<String> safeComponents = new HashSet<>(drugComponents);
        safeComponents.removeAll(allergySubstances);

        System.out.println("Cảnh báo dị ứng: " + warningAllergy);
        System.out.println("Thành phần an toàn: " + safeComponents);
    }
}