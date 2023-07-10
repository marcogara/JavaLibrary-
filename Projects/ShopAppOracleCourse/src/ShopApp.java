public class ShopApp {

    public static void main(String[] args) {
        System.out.println("minimum Price is: " + Clothing.CLOTHING_MIN_PRICE);
        System.out.println("Welcome to Duke Choice Shop");

        Customer c1 = CustomerFactory.createCustomer();

        Clothing[] itemsList = ClothingFactory.createItemsList();

        CustomerPrinter.displayCustomerDetails(c1, itemsList);

        CustomerPrinter.printItems(c1);
    }

}


