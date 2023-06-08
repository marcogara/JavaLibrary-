import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Customer {
    private String customerName = "";
    private String size;

    private Clothing[] items;
    private static final Map<Integer, String> SIZE_MAPPING = new HashMap<>();

        static {
            SIZE_MAPPING.put(1, "S");
            SIZE_MAPPING.put(2, "S");
            SIZE_MAPPING.put(3, "S");
            SIZE_MAPPING.put(4, "M");
            SIZE_MAPPING.put(5, "M");
            SIZE_MAPPING.put(6, "M");
            SIZE_MAPPING.put(7, "L");
            SIZE_MAPPING.put(8, "L");
            SIZE_MAPPING.put(9, "L");
        }

    public Customer(String name, int measurement) {
        this.customerName = customerName;
        setSize(measurement);
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getSize() {
        return size;
    }

    public void setSize(int measurement) {
            size = SIZE_MAPPING.getOrDefault(measurement, "XL");
    }

    public void setSize(String size) {
        this.size = size;
    }

    public Clothing[] getItems() {
        return items;
    }

    public void addItems(Clothing[] someItems) {
        items = Arrays.copyOf(someItems, someItems.length);
    }

    public double calculateTotalClothingCost() {
        double total = 0;
        for (Clothing item : items) {
            System.out.println("Description: " + item.getDescription() +
                    ", Size: " + item.getSize() + ", Price: $" + String.format("%.2f", item.getPrice()));
            total += item.getPrice();
        }
        return total;
    }
}

