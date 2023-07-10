public class Clothing {

    private String description;
    private double price;
    private String size = "M";

    public static final double CLOTHING_MIN_PRICE = 10;
    public static final double TAX_RATE = 0.2;

    public Clothing(String description, double price,String size) {
        this.description = description;
        setPrice(price);
        setSize(size);
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        price = price * (1+ TAX_RATE);
        return price;
    }

    public void setPrice(double price) {
        this.price = Math.max(price, CLOTHING_MIN_PRICE);
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
