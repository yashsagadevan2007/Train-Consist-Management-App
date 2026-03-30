import java.util.ArrayList;
import java.util.List;

class GoodsBogie {
    String type; // e.g., "Cylindrical", "Open", "Box"
    String cargo; // e.g., "Petroleum", "Coal", "Grain"

    GoodsBogie(String type, String cargo) {
        this.type = type;
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return type + " carrying " + cargo;
    }
}

public class TrainConsistManagementApp{
    public static void main(String[] args) {
        // 1. Prepare a list of goods bogies
        List<GoodsBogie> goodsConsist = new ArrayList<>();
        goodsConsist.add(new GoodsBogie("Cylindrical", "Petroleum"));
        goodsConsist.add(new GoodsBogie("Open", "Coal"));
        goodsConsist.add(new GoodsBogie("Box", "Grain"));
        // Uncomment the line below to trigger a safety violation:
        // goodsConsist.add(new GoodsBogie("Cylindrical", "Coal"));

        System.out.println("Checking Goods Consist: " + goodsConsist);

        // 2. Convert to stream
        // 3. & 4. use allMatch() with conditional logic:
        // Rule: If type is "Cylindrical", cargo MUST be "Petroleum".
        boolean isSafe = goodsConsist.stream().allMatch(bogie -> {
            if (bogie.type.equalsIgnoreCase("Cylindrical")) {
                return bogie.cargo.equalsIgnoreCase("Petroleum");
            }
            return true; // Non-cylindrical bogies are inherently safe in this UC
        });

        // 5. Display whether the train is safety compliant
        if (isSafe) {
            System.out.println("\n✅ SAFETY CHECK PASSED: All bogies comply with cargo regulations.");
        } else {
            System.out.println("\n❌ SAFETY ALERT: Incompatible cargo detected in Cylindrical bogies!");
        }
    }
}
