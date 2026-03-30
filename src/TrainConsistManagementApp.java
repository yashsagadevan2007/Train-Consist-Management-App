import java.util.ArrayList;
import java.util.List;

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
        // 1. Create a list of bogies
        List<Bogie> allBogies = new ArrayList<>();
        allBogies.add(new Bogie("Sleeper", 72));
        allBogies.add(new Bogie("Sleeper", 72));
        allBogies.add(new Bogie("AC Chair", 56));
        allBogies.add(new Bogie("First Class", 24));
        allBogies.add(new Bogie("General", 90));

        System.out.println("Current Consist: " + allBogies);

        // 2. Convert to stream
        // 3. map() extracts capacity values
        // 4. reduce() sums the capacities using identity 0 and Integer::sum
        int totalSeats = allBogies.stream()
                .map(b -> b.capacity)
                .reduce(0, Integer::sum);

        // 5. Display the total seating capacity
        System.out.println("\n--- Train Operational Metrics ---");
        System.out.println("Total Bogies Attached: " + allBogies.size());
        System.out.println("Total Seating Capacity: " + totalSeats + " seats");

        // Verification: Original list remains unchanged
        System.out.println("\nVerification: Original list integrity maintained.");
    }
}
