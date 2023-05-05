public class HuderteTueren {

    /*
    AUFGABE 4 (schwer):
Ein Eroberer nahm bei einem Feldzug 100 Gegner in Haft, die er in 100 Einzelzellen sperren ließ.
An seinem Geburtstag will er durch Großzügigkeit glänzen und plant eine Amnestie der in Haft befindlichen Gegner.
Allerdings will er nicht alle Gegner freilassen und fragt deswegen seinen Hofberater, wie er verfahren soll.
Öffne zunächst alle Türen, schließe sodann jede zweite Türe, beim dritten Durchgang nehme jede dritte Türe
 und öffne sie, wenn sie geschlossen ist, bzw. schließe sie, wenn sie geöffnet ist. Im vierten Durchgang
  wiederum nehme jede vierte Türe und öffne sie, wenn sie geschlossen ist, bzw. umgekehrt. Verfahre nun
   weiter so bis zum 100. Durchgang.
Wie viele Türen (nach dem 100.Durchgang) stehen offen und welches sind ihre Türnummern. Beachte bitte,
 dass die Nummerierung der Türen natürlich bei 1 und bei 100 endet.


     */


    public static void spiel() {

    boolean [] tueren = new boolean[100]; // true ist offen

        // Alle Türen öffnen
        for (int i = 0 ; i < tueren.length;i ++)
            tueren[i]=true;

        // jedes zweites tür schließen
        for (int i=0; i< tueren.length; i += 2)
            tueren[i]=false;

         // jedes tritte tür schießen / öffnen
          for ( int n=3 ; n < tueren.length; n +=3) {
             if (tueren[n] == true) tueren[n] =false;
              else tueren[n] = true;
          }

          
        for (int i = 1; i <= tueren.length; i++) {

            System.out.print( " [ " + i + " / "+  tueren[i] + " ] " );

        }
    }
}
