import rechnerTestForGUI.Rechner;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class RechnerGUI extends JFrame {
    private final JButton btn_addition = new JButton("+");
    private final JButton btn_subtraktion = new JButton("-");
    private final JButton btn_multiplikation = new JButton("x");
    private final JButton btn_division = new JButton(":");
    private final JButton btn_equals = new JButton("=");
    private final JTextField txt_input = new JTextField(20);

    private final Rechner rechner;

    public RechnerGUI() {
        JPanel pnl_berechnung = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(10, 40, 0, 40);

        Dimension buttonSize = new Dimension(100, 80);
        btn_addition.setPreferredSize(buttonSize);
        btn_subtraktion.setPreferredSize(buttonSize);
        btn_multiplikation.setPreferredSize(buttonSize);
        btn_division.setPreferredSize(buttonSize);
        btn_equals.setPreferredSize(buttonSize);

        int textFieldHeight = 100;
        int textFieldWidth = 400;

        gbc.gridx = 0;
        gbc.gridy = 100;
        txt_input.setPreferredSize(new Dimension(textFieldWidth, textFieldHeight));
        pnl_berechnung.add(txt_input);

        gbc.insets = new Insets(10, 40, 0, 40);

        gbc.gridx = 1;

        gbc.gridy++;
        pnl_berechnung.add(btn_addition, gbc.clone());

        gbc.gridy++;
        pnl_berechnung.add(btn_subtraktion, gbc.clone());

        gbc.gridy++;
        pnl_berechnung.add(btn_multiplikation, gbc.clone());

        gbc.gridy++;
        pnl_berechnung.add(btn_division, gbc.clone());

        gbc.gridy++;
        pnl_berechnung.add(btn_equals, gbc.clone());

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(800, 600);
        this.getContentPane().add(pnl_berechnung, BorderLayout.EAST);
        this.setVisible(true);
        this.setLocationRelativeTo(null);

        rechner = new Rechner(this);

        btn_addition.addActionListener(new OperationListener(Rechner.Operation.ADDITION));
        btn_subtraktion.addActionListener(new OperationListener(Rechner.Operation.SUBTRACTION));
        btn_multiplikation.addActionListener(new OperationListener(Rechner.Operation.MULTIPLICATION));
        btn_division.addActionListener(new OperationListener(Rechner.Operation.DIVISION));
        btn_equals.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int input = getTxtInput();
                    rechner.setZahl2(input);
                    double result = rechner.calculate();
                    setTxtInput(String.valueOf(result));
                } catch (NumberFormatException ex) {
                    zeigeError("Fehler: Du musst eine Zahl eingeben.");
                }
            }
        });
    }

    public int getTxtInput() {
        return Integer.parseInt(txt_input.getText());
    }

    public void setTxtInput(String text) {
        txt_input.setText(text);
    }

    public void zeigeError(String fehlermeldung) {
        JOptionPane.showMessageDialog(this, fehlermeldung);
    }

    private class OperationListener implements ActionListener {
        private final Rechner.Operation operation;

        public OperationListener(Rechner.Operation operation) {
            this.operation = operation;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            rechner.setOperation(operation);
            try {
                int input = getTxtInput();
                rechner.setZahl1(input);
                setTxtInput("");
            } catch (NumberFormatException ex) {
                zeigeError("Fehler: Du musst eine Zahl eingeben.");
            }
        }
    }
}





