package view;

import javax.swing.*;
import java.awt.event.ActionListener;

public class RechnerView extends JFrame {

    private final JTextField txt_erste_zahl = new JTextField(10);
    private final JTextField txt_zweite_zahl = new JTextField(10);
    private final JTextField txt_erg_zahl = new JTextField(10);

    private final JLabel lbl_addition = new JLabel("+");
    private final JButton btn_addition = new JButton("Berechne");

    public RechnerView() {
        JPanel pnl_berechnung = new JPanel();
        pnl_berechnung.add(txt_erste_zahl);
        pnl_berechnung.add(lbl_addition);
        pnl_berechnung.add(txt_zweite_zahl);
        pnl_berechnung.add(btn_addition);
        pnl_berechnung.add(txt_erg_zahl);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setSize(800, 600);
        this.add(pnl_berechnung);
        this.setVisible(true);
        this.setLocationRelativeTo(null);


    }

    // Die view soll unabhängig von seinem model sein.
    // Wie brauchen jetzt Methoden, die der Controller aufrufen kann.
    public int getErsteZahl() {

        return Integer.parseInt(txt_erste_zahl.getText());

    }

    public int getZweiteZahl() {

        return Integer.parseInt(txt_zweite_zahl.getText());

    }

    public int getBerechnungErgebnis() {

        return Integer.parseInt(txt_erg_zahl.getText());

    }

    public void setTxt_erg_zahl(int ergebnis) {
        this.txt_erg_zahl.setText(Integer.toString(ergebnis));
    }

    public void zeigeError(String fehlermeldung) {
        // Popup message um den User zu benachrichtigen.
        JOptionPane.showMessageDialog(this, fehlermeldung);
    }

    public void setBerechnungLister(ActionListener lister) {
        this.btn_addition.addActionListener(lister);
    }


}
