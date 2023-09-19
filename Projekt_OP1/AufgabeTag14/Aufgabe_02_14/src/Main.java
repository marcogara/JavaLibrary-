/*
    Führen Sie bitte zunächst eine abstrakte Klasse 'GeräuscheMacher' ein.
    Diese besitzt nur eine abstrakte Methode 'macheGeräusch' (keine Über-, oder Rückgabewerte).
    Implementieren Sie bitte zusätzlich die Klassen Auto, Hund und Mensch, die von GeräuscheMacher erben.
        Keine dieser Klassen enthält weitere Member.
        Konsolenausgabe von macheGeräusch in Auto:   "Brummmmmm ..."
        Konsolenausgabe von macheGeräusch in Hund:   "Wau Wau Kläff Grrrrr ..."
        Konsolenausgabe von macheGeräusch in Mensch: "Java lernen ist toll!"

    Führen Sie eine Liste vom Typ GeräuscheMacher der main()-Methode hinzu.
    Erstellen Sie von allen drei Subklassen ein Objekt und fügen diese der Liste hinzu.
    Rufen Sie bitte mittels einer foreach-Schleife, für alle Elemente der Liste, die Methode macheGeräusch auf.
*/

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<GeraeuscherMacher> list = new ArrayList<>();

        Auto auto = new Auto();
        Hund hund = new Hund();
        Mensch mensch = new Mensch();

        list.add(auto);
        list.add(hund);
        list.add(mensch);

        for (GeraeuscherMacher namen : list ) {
            namen.macheGeraeuche();
        }
    }
}