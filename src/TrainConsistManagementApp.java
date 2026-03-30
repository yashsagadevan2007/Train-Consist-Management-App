import java.util.ArrayList;

public class TrainConsistManagementApp {
    public static void main(String[] args) {
        // 1. Create an ArrayList for passenger bogies
        ArrayList<String> passengerBogies = new ArrayList<>();

        // 2. Add bogies
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        // 3. Print the list after insertion
        System.out.println("Current Bogies: " + passengerBogies);

        // 4. Remove one bogie (AC Chair)
        passengerBogies.remove("AC Chair");
        System.out.println("After removing AC Chair: " + passengerBogies);

        // 5. Use contains() to check if Sleeper exists
        boolean hasSleeper = passengerBogies.contains("Sleeper");
        System.out.println("Does the train have a Sleeper bogie? " + hasSleeper);

        // 6. Print final list state
        System.out.println("Final Train Consist: " + passengerBogies);
    }
}