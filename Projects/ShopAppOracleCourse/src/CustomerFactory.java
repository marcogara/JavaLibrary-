public class CustomerFactory {

    public static Customer createCustomer() {
        Customer c1 = new Customer("Pinky", 3);
        c1.setSize("S");
        return c1;
    }

}
