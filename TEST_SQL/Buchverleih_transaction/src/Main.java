import buchverleihn.*;

import java.sql.SQLException;
import java.sql.SQLOutput;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Buchverleih.selectKunde();

        for(Integer kundeId : Kunde.kunden.keySet())
        {
            System.out.println("Die Kundennumer ist: " + Kunde.kunden.get(kundeId).getNummer());
            System.out.println("Der kundenname ist: " + Kunde.kunden.get(kundeId).getName()) ;
            System.out.println("Das Guthaben des Kundes ist: " + Kunde.kunden.get(kundeId).getGuthaben());
            System.out.println();
        }

        Buchverleih.selectBuch();
        for(Integer buchId : Buch.bücher.keySet())
        {
            System.out.println("Die Buchnummer ist: " + Buch.bücher.get(buchId).getId());
            System.out.println("Der Titel ist: " + Buch.bücher.get(buchId).getTitel());
            System.out.println();
        }


        Buchverleih.selectAusleihe();
        for(Ausleihe ausleihe: Ausleihe.ausleiheHashMap.values())
        {
            System.out.println("Das ausgeliehene Buch heißt:  " + ausleihe.getBuch().getTitel());
            System.out.println("Der Kunde ist:  " + ausleihe.getKunde().getName());
            System.out.println("dauer : " + ausleihe.getDauer());
            System.out.println();
        }

        boolean ausleiheGeloescht =  Buchverleih.deleteAusleihe(1);

        if(ausleiheGeloescht == true)
        System.out.println("Die Ausleihe wurde gelöscht ");
        else
            System.out.println("Die Ausleihe nicht gelöscht");


        try
        {
            if(Buchverleih.ausleihe(Buch.bücher.get(1), Kunde.kunden.get(1), LocalDate.now(),5) != null)
            {
                System.out.println("Das Buch mit der ID " + Buch.bücher.get(1).getId() + " und der Kunde mit der nummer "+
                        Kunde.kunden.get(1).getNummer() + " datum: " + LocalDate.now() + " mit der Dauer 5 ausgelehen werden");
                System.out.println("Titel das Buches: " + Buch.bücher.get(1).getTitel());
                System.out.println("Der kunde is : " + Kunde.kunden.get(1).getName());
            }
        }
        catch (SQLException sq)
        {
            sq.printStackTrace();
        }

        }
    }
