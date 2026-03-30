import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Bogie {
    String name;
    int capacity;

    Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Bogie{Name='" + name + "', Capacity=" + capacity + "}";
    }
}

public class TrainConsistManagementApp {
    public static void main(String[] args) {
        // 1. Create a list of bogies (Multiple bogies of same type for grouping)
        List<Bogie> allBogies = new ArrayList<>();
        allBogies.add(new Bogie("Sleeper", 72));
        allBogies.add(new Bogie("Sleeper", 72));
        allBogies.add(new Bogie("AC Chair", 56));
        allBogies.add(new Bogie("AC Chair", 56));
        allBogies.add(new Bogie("First Class", 24));
        allBogies.add(new Bogie("General", 90));

        System.out.println("Original Flat List of Bogies: " + allBogies.size() + " items.\n");

        // 2. Convert list into a stream
        // 3. Apply Collectors.groupingBy() classification logic
        // 4. Store the result in Map<String, List<Bogie>>
        Map<String, List<Bogie>> groupedBogies = allBogies.stream()
                .collect(Collectors.groupingBy(b -> b.name));

        // 5. Display the grouped result
        System.out.println("--- Train Consist Grouped by Bogie Type ---");
        groupedBogies.forEach((type, list) -> {
            System.out.println("Category: " + type + " | Count: " + list.size());
            list.forEach(b -> System.out.println("  -> " + b));
        });

        // Verification: Original list integrity
        System.out.println("\nVerification: Original list is still " + allBogies.size() + " items.");
    }
}
