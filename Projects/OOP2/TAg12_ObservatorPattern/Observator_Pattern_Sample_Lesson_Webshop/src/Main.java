public class Main {
    public static void main(String[] args) {

        System.out.println("Webshop - Observator Pattern");

        WebShop webShop = new WebShop();

        WebShopKunde k1 = new WebShopKunde("Samira");

        webShop.addNewsletterAbonnent(k1);

        webShop.erzeugeNewsletterInhalt("hier sit der neuer Kartalog");

    }
}
