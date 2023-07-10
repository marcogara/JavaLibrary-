package controller;

import model.RechnerModel;
import view.RechnerView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RechnerController {

    // Der Controller in Unserem MVC Muster der kennt sowohl dei View, als auch das Model.
    // Der Controller hält also Referenzen aud die view und das Model.

    private final RechnerView rechnerView;
    private final RechnerModel rechnerModel;

    public RechnerController(RechnerView rechnerView, RechnerModel rechnerModel) {
        this.rechnerView = rechnerView;
        this.rechnerModel = rechnerModel;

        this.rechnerView.setBerechnungLister(new ButtonClickListener());
    }

    class ButtonClickListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                int ersteZahl, zweiteZahl = 0;

                ersteZahl = rechnerView.getErsteZahl();
                zweiteZahl = rechnerView.getZweiteZahl();

                rechnerModel.addiereZweiZahlen(ersteZahl, zweiteZahl);
                int erg = rechnerModel.getBerechnungsErgebnise();

                rechnerView.setTxt_erg_zahl(erg);

            } catch (NumberFormatException ex) {
                rechnerView.zeigeError("Fehler: DU muss 2 Zahlen eingeben.");
            }

        }
    }

}
