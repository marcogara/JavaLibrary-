public class ClothingFactory {

    public static Clothing[] createItemsList() {
        Clothing item1 = new Clothing("Blue Jacket", 20.9, "M");
        Clothing item2 = new Clothing("Orange T-Shirt", 10.5, "S");
        Clothing item3 = new Clothing("Green Scarf", 5, "S");
        Clothing item4 = new Clothing("Blue T-Shirt", 10.5, "S");
        Clothing item5 = new Clothing("Test T-Shirt", 5, "S");
        return new Clothing[]{item1, item2, item3, item4, item5};
    }

}
