import java.util.ArrayList;
import java.util.List;

public class WebShop {

    // Veröffentlicher, Publisher, Subjekt:


    // Instanzvariablen oder Attribute:
    private final List<Beobachter> newsletterAbonnenten = new ArrayList<>();

    // Notify Observers:
    // Diese Methode informiert alle Observer über den geänderten Zustand dieses Objektes.


    // Diese Methode ändert den Zustand des Objektes. Hier geschieht etwas Wichtiges,
    // worüber die Abonnenten benachrichtigt werden müssen.
    // Publisher

    public void addNewsletterAbonnent(Beobachter beobachter) {
        this.newsletterAbonnenten.add(beobachter);
    }

    public void removeNewsletterAbonnent(Beobachter beobachter) {
        this.newsletterAbonnenten.remove(beobachter);
    }

    // Diese Methode ändert den Zustand des Objektes. Hier geschieht etwas Wichtiges,
    // worüber die Abonnenten benachrichtigt werden müssen.
    public void erzeugeNewsletterInhalt(String newsLetterInhalt) {
        this.versendeNewsletter(newsLetterInhalt);
    }

    private void versendeNewsletter(String newsletter) {
        for (Beobachter beobachter : this.newsletterAbonnenten) {
            beobachter.update(newsletter);
        }
    }

}


