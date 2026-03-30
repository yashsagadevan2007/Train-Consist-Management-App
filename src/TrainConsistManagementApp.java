import java.util.LinkedList;

public class TrainConsistManagementApp {
    public static void main(String[] args) {
        // 1. Create a LinkedList for the consist
        LinkedList<String> consist = new LinkedList<>();

        // 2. Add bogies: Engine, Sleeper, AC, Cargo, Guard
        consist.add("Engine");
        consist.add("Sleeper");
        consist.add("AC");
        consist.add("Cargo");
        consist.add("Guard");

        System.out.println("Initial Consist: " + consist);

        // 3. Insert a Pantry Car at position 2 (index 2)
        consist.add(2, "Pantry Car");
        System.out.println("After adding Pantry Car: " + consist);

        // 4. Remove the first and last bogie
        consist.removeFirst();
        consist.removeLast();

        // 5. Display the final ordered train consist
        System.out.println("Final Ordered Consist: " + consist);
    }
}
