import java.util.HashSet;

public class TrainConsistManagementApp {
    public static void main(String[] args) {
        // 1. Create a HashSet for unique bogie IDs
        HashSet<String> bogieIds = new HashSet<>();

        // 2. Add bogie IDs (including duplicates intentionally)
        bogieIds.add("BG101");
        bogieIds.add("BG102");
        bogieIds.add("BG103");
        bogieIds.add("BG101"); // Duplicate - will be ignored
        bogieIds.add("BG104");
        bogieIds.add("BG102"); // Duplicate - will be ignored

        // 3. Print the final set
        System.out.println("Unique Bogie IDs in the system:");
        System.out.println(bogieIds);

        // 4. Verify size
        System.out.println("Total unique bogies: " + bogieIds.size());
    }
}