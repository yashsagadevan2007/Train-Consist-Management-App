import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TrainConsistManagementApp{
    public static void main(String[] args) {
        // 1. & 3. Define and compile regex patterns
        // Train ID: TRN- followed by exactly 4 digits
        Pattern trainIdPattern = Pattern.compile("TRN-\\d{4}");

        // Cargo Code: PET- followed by exactly 2 uppercase letters
        Pattern cargoCodePattern = Pattern.compile("PET-[A-Z]{2}");

        // Test Inputs
        String[] testTrainIds = {"TRN-1234", "TRAIN12", "TRN-123", "TRN-12345"};
        String[] testCargoCodes = {"PET-AB", "PET-ab", "PET123", "PET-XYZ"};

        System.out.println("--- Train ID Validation ---");
        for (String id : testTrainIds) {
            // 4. Create Matcher objects
            Matcher matcher = trainIdPattern.matcher(id);
            // 5. Use matches() to validate
            if (matcher.matches()) {
                System.out.println("✔ " + id + " is a Valid Train ID.");
            } else {
                System.out.println("❌ " + id + " is an Invalid Train ID.");
            }
        }

        System.out.println("\n--- Cargo Code Validation ---");
        for (String code : testCargoCodes) {
            Matcher matcher = cargoCodePattern.matcher(code);
            if (matcher.matches()) {
                System.out.println("✔ " + code + " is a Valid Cargo Code.");
            } else {
                System.out.println("❌ " + code + " is an Invalid Cargo Code.");
            }
        }
    }
}
