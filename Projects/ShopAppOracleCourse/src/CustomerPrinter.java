public class CustomerPrinter {
    public static void printItems(Customer customer) {
        for (Clothing item : customer.getItems()) {
            System.out.println("Items: " + item.getDescription());
        }
    }

    public static void displayCustomerDetails(Customer customer, Clothing[] items) {
        System.out.println("Customer is: " + customer.getCustomerName() + ", " + customer.getSize() + ", " +
                customer.calculateTotalClothingCost());
    }
}
