public class WebShopKunde implements Beobachter {

    private final String name;

    public WebShopKunde(String name) {
        this.name = name;
    }

    @Override
    public void update(String newsletter) {
        System.out.println("Hallo " + this.name + " Sie haben folgenden Nachricht erhalten:\n " + newsletter);
    }
}
