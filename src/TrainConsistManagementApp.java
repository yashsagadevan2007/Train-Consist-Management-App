import java.util.HashMap;
import java.util.Map;

public class TrainConsistManagementApp {
    public static void main(String[] args) {
        // 1. Create a HashMap to store bogie-capacity information
        // Key: Bogie Name (String), Value: Capacity (Integer)
        Map<String, Integer> bogieCapacities = new HashMap<>();

        // 2. & 3. Insert capacity values using the put() method
        bogieCapacities.put("Sleeper", 72);
        bogieCapacities.put("AC Chair", 56);
        bogieCapacities.put("First Class", 24);
        bogieCapacities.put("General", 90);

        System.out.println("Bogie Capacity Mapping Created.\n");

        // 4. Iterate over the map using entrySet()
        System.out.println("--- Train Capacity Details ---");
        for (Map.Entry<String, Integer> entry : bogieCapacities.entrySet()) {
            // 5. Display each bogie along with its corresponding capacity
            System.out.println("Bogie Type: " + entry.getKey() + " | Capacity: " + entry.getValue() + " seats");
        }

        // Demonstrating Fast Lookup
        String searchBogie = "AC Chair";
        System.out.println("\nQuick Lookup: Capacity of " + searchBogie + " is " + bogieCapacities.get(searchBogie));
    }
}
