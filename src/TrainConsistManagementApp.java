// 1. Create a custom exception class
class InvalidCapacityException extends Exception {
    public InvalidCapacityException(String message) {
        super(message);
    }
}

class PassengerBogie {
    String type;
    int capacity;

    // 2. Validate capacity inside the constructor
    // 4. Declare the constructor with throws
    public PassengerBogie(String type, int capacity) throws InvalidCapacityException {
        if (capacity <= 0) {
            // 3. Throw the exception when capacity is less than or equal to zero
            throw new InvalidCapacityException("Invalid Capacity: " + capacity + ". Capacity must be greater than zero for " + type);
        }
        this.type = type;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return type + " (" + capacity + " seats)";
    }
}

public class TrainConsistManagementApp {
    public static void main(String[] args) {
        String[] types = {"Sleeper", "AC Chair", "First Class", "Broken Bogie"};
        int[] capacities = {72, 56, 24, -10}; // Includes a negative value

        System.out.println("--- Registering Passenger Bogies ---");

        for (int i = 0; i < types.length; i++) {
            try {
                // Attempt to create a bogie
                PassengerBogie bogie = new PassengerBogie(types[i], capacities[i]);
                System.out.println("✅ Success: Created " + bogie);
            } catch (InvalidCapacityException e) {
                // 5. Ensure invalid bogies are caught and not added
                System.out.println("❌ Error: " + e.getMessage());
            }
        }
        System.out.println("\nSystem continues execution safely after handling exceptions.");
    }
}
