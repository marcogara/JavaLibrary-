// Rechner Lesson demonstration MVC Modell


import controller.RechnerController;
import model.RechnerModel;
import view.RechnerView;

public class Main {
    public static void main(String[] args) {

        new RechnerController(new RechnerView(), new RechnerModel());


    }
}
