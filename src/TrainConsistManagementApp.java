import java.util.ArrayList;
import java.util.List;
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
        return name + " (" + capacity + " seats)";
    }
}

public class TrainConsistManagementApp {
    public static void main(String[] args) {
        // 1. Create a list of bogies (Reusing logic from UC7)
        List<Bogie> allBogies = new ArrayList<>();
        allBogies.add(new Bogie("Sleeper", 72));
        allBogies.add(new Bogie("AC Chair", 56));
        allBogies.add(new Bogie("First Class", 24));
        allBogies.add(new Bogie("General", 90));

        System.out.println("All Available Bogies: " + allBogies);

        // 2. Convert list into a stream
        // 3. Apply filter() for capacity > 60
        // 4. Collect matching bogies into a new list
        int threshold = 60;
        List<String> highCapacityBogies = allBogies.stream()
                .filter(b -> b.capacity > threshold)
                .map(Bogie::toString) // Transforming for display
                .collect(Collectors.toList());

        // 5. Display the filtered bogies
        System.out.println("\n--- High Capacity Bogies (Capacity > " + threshold + ") ---");
        if (highCapacityBogies.isEmpty()) {
            System.out.println("No bogies match the criteria.");
        } else {
            highCapacityBogies.forEach(System.out::println);
        }

        // Verify Original Collection Integrity
        System.out.println("\nVerification: Original list remains unchanged. Size: " + allBogies.size());
    }
}
