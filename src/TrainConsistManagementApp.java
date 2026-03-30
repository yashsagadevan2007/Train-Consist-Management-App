import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

// 1. Create a Bogie class with fields: name and capacity
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

public class TrainConsistManager {
    public static void main(String[] args) {
        // 2. Create a List<Bogie> to store passenger bogies
        List<Bogie> passengerBogies = new ArrayList<>();

        // 3. Add bogies with different capacities
        passengerBogies.add(new Bogie("Sleeper", 72));
        passengerBogies.add(new Bogie("AC Chair", 56));
        passengerBogies.add(new Bogie("First Class", 24));
        passengerBogies.add(new Bogie("General", 90));

        System.out.println("Before Sorting: " + passengerBogies);

        // 4. Use Comparator.comparingInt() to define sorting based on capacity
        // This sorts in ascending order (lowest capacity to highest)
        passengerBogies.sort(Comparator.comparingInt(b -> b.capacity));

        // 5. Display the sorted bogies
        System.out.println("\nSorted by Capacity (Ascending):");
        for (Bogie b : passengerBogies) {
            System.out.println(b);
        }

        // Bonus: Sorting in Descending order for high-capacity planning
        passengerBogies.sort((b1, b2) -> b2.capacity - b1.capacity);
        System.out.println("\nSorted by Capacity (Descending/High-Usage):");
        passengerBogies.forEach(System.out::println);
    }
}
