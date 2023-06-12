//  * Erstellen Sie die Klasse 'Kunde' mit dem Attribut 'name',
//  welches über den Konstruktor gefüllt wird.
// * Die Klasse implementiert das Interface
// und die getInfo-Methode gibt den Namen des Kunden zurück.

public class Kunde implements Printable {

   private String KundenName;

    public Kunde(String kundenName) {KundenName = kundenName;}

    @Override
    public String getInfo() {
        return this.KundenName;
    }
}
