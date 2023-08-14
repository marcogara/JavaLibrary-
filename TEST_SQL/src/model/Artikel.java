package model;

import java.math.BigDecimal;
import java.util.*;

public class Artikel {
        private final int nummer;
        private String bezeichung;
        private BigDecimal preis;
        private final Hersteller hersteller;

    public Artikel(int nummer, String bezeichung, BigDecimal preis, Hersteller hersteller) {
        this.nummer = nummer;
        this.bezeichung = bezeichung;
        this.preis = preis;
        this.hersteller = hersteller;

    }

    public int getNummer()
    {
        return nummer;
    }

    public String getBezeichung() {
        return bezeichung;
    }

    public BigDecimal getPreis() {
        return preis;
    }

    public Hersteller getHersteller()
    {
        return hersteller;
    }
    // Keinen Setter zu Nummer, da Nummer ein Primärschlüssel ist und sich nicht ändern darf.

    public void setBezeichung(String bezeichung)
    {
        this.bezeichung = bezeichung;
    }

    public void setPreis(BigDecimal preis)
    {
        this.preis = preis;
    }

    public String toString()
    {
        return "Artikel{" + "nummer= " + nummer + ", bezeichung= " + bezeichung + ", preis= " + preis +", hersteller= " + hersteller + "}";
    }






















}
