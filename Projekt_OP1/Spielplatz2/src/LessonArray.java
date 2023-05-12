import java.io.IOException;
import java.util.Scanner;

public class LessonArray {

        // Variante 1 einen 1 dimensionalen Array zu deklarieren
        // Bei dieser Variante legen wir die Anzahl Element fest
        private int [] iArrZahl_1 = new int [5];
        //Variante 2 einen mit felder geleich mitinitialisiert
        // Die Anzahl Elemente in diesem Array wird von uns nicht explizit angegeben
        private int [] getiArrZahl_2 = {1,2,3,4,5,6,7,8,9,0};


        /**
         * Erstellt ein Objekt vom Typ Lesson
        * @param iSprache
        */
        public LessonArray(int iSprache)
        {
                String [][] sBegrussung = new String[3][4];
                // 1. Dimension des Arrays enthält Begrussung Morgens
                // 2. Dimension des Arrays enthält Begrussung in den Sprache Deutsch, Englisch , Schwäbisch
                sBegrussung[0][0] = "Guten Morgen";
                sBegrussung[0][1] = "good morning";
                sBegrussung[0][2] = "guada moarga";
                sBegrussung[0][3] = "god morgen";
                sBegrussung[1][0] = "Guten Abend";
                sBegrussung[1][1] = "good evening";
                sBegrussung[1][2] = "noabad";
                sBegrussung[1][3] = "god aften";


            for (String[] row : sBegrussung) { // iterate over rows
                    for (String element : row) { // iterate over columns in current row
                        System.out.print(element + " "); // print current element followed by space
                    }
                    System.out.println(); // move to next line after all elements in row have been printed
            }

        }

        /**
        * (Getter) Liefert den Wert an der Position iInedx
        * @param iIndex   int
        * @return   <br> Liefert den Wert an der Position iIndex zurück oder -1 wenn ein Falscher Index angegeben wurde
        */
        public Integer getWertAusArrayEins(int iIndex) {

        int iAktuellerWert =0;

        /*
            if (iIndex < iArrZahl_1.length)
            return iArrZahl_1[iIndex];
        else return -1;

         */
        // 2. Variante durch Verwendung von Ausnahmebehandlung

        try
        {
            iAktuellerWert = iArrZahl_1[iIndex];

        }
        catch (IndexOutOfBoundsException indEx)
        {
            iAktuellerWert = Integer.parseInt(null);
        }
        finally {
            return iAktuellerWert;
        }

    }

        /**
        * (Setter) Weist der Klassenvariable (Array) intArrZahl_1 an der Position iIndex einen Wert zu
        * @param iIndex int mit der gewünschten Position
        * @param iWert int mit dem gewünschten Wert
        */
        public void setWertAusArrayEins(int iIndex, int iWert)
        {
                if(iIndex < iArrZahl_1.length)
                {
                      iArrZahl_1[iIndex]= iWert;
                }
        }

        public static void main (String[] args)
        {
            LessonArray lessonArray = new LessonArray(1);

            // lessonArray.iArrZahl_1[3] = 255;
            // System.out.println(lessonArray.iArrZahl_1[3]);

            // lessonArray.setWertAusArrayEins(3,52);

            // System.out.println("Der Wert im Array am Index 3 lautet " + lessonArray.getWertAusArrayEins(3));


        }
}
