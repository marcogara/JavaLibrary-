public class AusnahmeBehandlung {

    private String sTitel;
    public String sVonAussenAnsprechbat;

    // Konstruktor sondewrmethode OHNE Rückgabewert
    // Gleiche Name wie die Klasse
    // Immer verfügbar

    public AusnahmeBehandlung()
    {
        try {
            sTitel = "Es wurde Überladen Standardkonstruktor aufgerufen";
            System.out.println(sTitel + "\n" + sVonAussenAnsprechbat);

        }
        catch (NullPointerException nupEx)
        {
            sVonAussenAnsprechbat = " jetzt Die Variable kann verwendet werden ";
        }
        finally
        {
            System.out.println(sTitel + "\n" +sVonAussenAnsprechbat);
        }

    }

    // Der Konstruktor kann auch durch Übergabeparameter festgelegt werden

    public AusnahmeBehandlung(int iWert, Boolean bWert)
    {
        sTitel = String.format("Es wurde die Ganzzahl übergeben %ld", iWert);
        if (bWert)
        {
            sTitel += "und WAHR";
        }
        else
        {
            sTitel += "und FALSCH";
        }
        System.out.println(sTitel);
    }




}
