import java.util.LinkedHashSet;
import java.util.Set;

public class TrainConsistManagementApp {
    public static void main(String[] args) {
        // 1. Create a LinkedHashSet to represent the train formation
        // This ensures uniqueness while preserving the physical insertion order
        Set<String> trainFormation = new LinkedHashSet<>();

        // 2. Attach bogies to the engine
        trainFormation.add("Engine");
        trainFormation.add("Sleeper");
        trainFormation.add("Cargo");
        trainFormation.add("Guard");

        System.out.println("Initial Formation: " + trainFormation);

        // 3. Attempt to attach a duplicate bogie intentionally
        System.out.println("\nAttempting to add duplicate 'Sleeper'...");
        boolean isAdded = trainFormation.add("Sleeper");

        if (!isAdded) {
            System.out.println("Duplicate detected! 'Sleeper' was not added again.");
        }

        // 4. Display the final formation order
        // 5. Ensure duplicates do not appear in the output
        System.out.println("\nFinal Train Formation (Unique & Ordered):");
        System.out.println(trainFormation);
    }
}
