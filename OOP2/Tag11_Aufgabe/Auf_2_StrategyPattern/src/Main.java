/* Sie entwickeln eine Software zur Buchung von Reisen. Die Reisenden können ihre gebuchte Reise vor Reiseantritt stornieren. Dazu sollen zwei Algorithmen implementiert werden - ein kulanter Algorithmus und ein strenger Algorithmus. Beim Buchen der Reise wird einer der Algorithmen für die Stornogebühren ausgesucht, der Algorithmus könnte sich aber auch nachträglich noch ändern. Damit der Algorithmus leicht austauschbar ist, verwenden Sie das Strategy-Muster.
 *
 * Jede Reise hat einen Grundpreis und einen Reisebeginn.
 * Es können für alle Reise-Arten die Anzahl der Tage bis zur Abreise bestimmt werden.
 * Jede Reise-Art berechnet den Preis auf unterschiedliche Weise.
 * Die Reise wird in zwei Arten unterteilt. Die günstige Bronze-Reise und die teure Gold-Reise.
 * Die Bronze-Reise kostet Grundpreis * 1.25, die Gold-Reise kostet Grundpreis * 1.75
 *
 * Jede Reise hat einen bestimmten Storno-Algorithmus.
 * Da der Algorithmus beliebig getauscht werden können soll, ist er von der Reise entkoppelt.
 * Es gibt den strengen Storno Algorithmus und den kulanten Storno Algorithmus.
 * Eine Stornierung der Reise mit dem strengen Algorithmus kostet 25% der Reisekosten, wenn die Tage bis zur Abreise > 10 sind, sonst 75%.
 * Die Stornierung mit dem kulanten Algorithmus kostet 25% der Reisekosten, wenn es noch mehr als ein Tag bis zur Reise sind, sonst 50%.
 * Eine Bronze-Reise verwendet standardmäßig den strengen Algorithmus, eine Gold-Reise verwendet standardmäßig den kulanten Algorithmus.
 *
 * Erstellen Sie ein Klassendiagramm und testen Sie das Programm mit Java-Code. Es handelt sich um das GoF Strategiemuster.
 *
 * Hinweis: Zur Bestimmung der Tage können Sie Duration.between und LocalDateTime.now() verwenden.
 * Alternativ zu Duration geht auch ChronoUnit.DAYS.between
 */

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {

        System.out.print("Hello and welcome!");

        // Erstellen einer Bronze-Reise mit dem strengen Stornierungs-Algorithmus
        StrengerStornoAlgorithmus streng = new StrengerStornoAlgorithmus();
        BronzeReise bronze = new BronzeReise(1000, LocalDateTime.now().plusDays(20), streng);

        // Ausgabe des Preises vor Stornierung
        System.out.println("Preis vor Stornierung: " + bronze.berechnenPreis());

        // Ausgabe des Betrags bei einer frühen Stornierung (5 Tage vor Abreisedatum)
        LocalDateTime stornierungsDatum = LocalDateTime.now().plusDays(15);
        double stornierungsBetrag = bronze.getStornoAlgorithmus().berechneStornierung(bronze, stornierungsDatum);
        System.out.println("Stornierungsgebühr: " + stornierungsBetrag);

        // Erstellen einer Gold-Reise mit dem kulanten Stornierungs-Algorithmus
        KulanterStornoAlgorithmus kulant = new KulanterStornoAlgorithmus();
        GoldReise gold = new GoldReise(2000, LocalDateTime.now().plusDays(30), kulant);

        // Ausgabe des Preises vor Stornierung
        System.out.println("Preis vor Stornierung: " + gold.berechnenPreis());

        // Ausgabe des Betrags bei einer späten Stornierung (1 Tag vor Abreisedatum)
        stornierungsDatum = LocalDateTime.now().plusDays(29);
        stornierungsBetrag = gold.getStornoAlgorithmus().berechneStornierung(gold, stornierungsDatum);
        System.out.println("Stornierungsgebühr: " + stornierungsBetrag);

    }
}