import controller.HerstellerController;
import model.Artikel;
import model.Hersteller;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        HerstellerController.selectHersteller();

        // HerstellerController.insertHersteller("Test");

       // HerstellerController.selectHersteller();

        // HerstellerController.updateHersteller(4,"erflog");

        // HerstellerController.selectHersteller();

        var hersteller = new Hersteller(4,"test");

        var art = new Artikel(2,"magic tool", BigDecimal.valueOf(9.99),hersteller );

        System.out.println(art.toString());


        // System.out.println("hi");
    }
}