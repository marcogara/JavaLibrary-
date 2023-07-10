import java.util.ArrayList;
import java.util.List;

public class Essen extends Waren {




    private List<String> zutaten;


    // Essen besteht zudem aus einer Auflistung der Zutaten, zu Getränken speichern Sie die Füllmenge in Milliliter.
    // * Alle benötigten Daten werden über Konstruktoren erfasst.
    protected Essen(String bezeichung, double preis, ArrayList zutatenlist) {
        super(bezeichung,preis);
        this.zutaten = zutatenlist;

    }

    /**
     * @return Gibt einen String mit den Daten der Basisklasse plus zusätzlich den Zutaten zurück.
     */
    @Override
    public String toString()
    {
        // Mit dem StringBuilder können bequem Strings zusammengebaut werden:
        StringBuilder builder = new StringBuilder();
        builder.append(super.toString()).append("\n"); // Die Informationen der Basisklasse.
        builder.append("Zutaten:\n");
        for (String s : zutaten)
        {
            builder.append(s).append("\n"); // Zutaten der Zutatenliste dem String hinzufügen.
        }

        return builder.toString();
    }
}
