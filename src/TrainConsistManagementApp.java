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
}

public class TrainConsistManagementApp{
    public static void main(String[] args) {
        // 1. Prepare a large collection of bogies for testing
        List<Bogie> largeConsist = new ArrayList<>();
        for (int i = 0; i < 100000; i++) {
            largeConsist.add(new Bogie("Bogie-" + i, (i % 100)));
        }

        // --- Loop-Based Filtering ---
        long startLoop = System.nanoTime(); // Record start time
        List<Bogie> loopResult = new ArrayList<>();
        for (Bogie b : largeConsist) {
            if (b.capacity > 60) {
                loopResult.add(b);
            }
        }
        long endLoop = System.nanoTime(); // Record end time
        long loopDuration = endLoop - startLoop;

        // --- Stream-Based Filtering ---
        long startStream = System.nanoTime(); // Record start time
        List<Bogie> streamResult = largeConsist.stream()
                .filter(b -> b.capacity > 60)
                .collect(Collectors.toList());
        long endStream = System.nanoTime(); // Record end time
        long streamDuration = endStream - startStream;

        // Display results and timing
        System.out.println("--- Performance Benchmarking (Filtering > 60 Capacity) ---");
        System.out.println("Dataset Size: " + largeConsist.size() + " bogies");
        System.out.println("Loop-Based Time   : " + loopDuration + " ns");
        System.out.println("Stream-Based Time : " + streamDuration + " ns");

        // Verification
        System.out.println("\nResults Match: " + (loopResult.size() == streamResult.size()));
        System.out.println("Loop is " + String.format("%.2f", (double)streamDuration / loopDuration) + "x faster/slower than Stream.");
    }
}
