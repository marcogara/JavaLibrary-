package view;

import javax.swing.*;
import java.awt.*;

public class CalculatorView {

    private final JFrame calculatorFrame;
    private JTextField txt_display;
    private JPanel pnl_buttons;

    public CalculatorView() {
        this.calculatorFrame = new JFrame();
        this.calculatorFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Feste Werte im Quellcode ist ein Code Smell!
        // Hier haben wir die pixel Werte Hardcodiert, Literale
        // auch einfach Magic Number.
        this.calculatorFrame.setPreferredSize(new Dimension(600, 800));
        this.calculatorFrame.setMinimumSize(new Dimension(600, 800));

        // this.calculatorFrame.setSize(Toolkit.getDefaultToolkit().getScreenSize().width / 2, Toolkit.getDefaultToolkit().getScreenSize().height / 2);


        // bad practice
        // this.calculatorFrame.setLocationRelativeTo(null);

        this.calculatorFrame.setResizable(false);
        this.calculatorFrame.getContentPane().setBackground(new Color(104, 139, 173));

        this.calculatorFrame.setTitle("OPEN_CALC");
        setDynamicLocation();
        this.calculatorFrame.setVisible(true);

    }

    private void setDynamicLocation() {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

        int frameWidth = this.calculatorFrame.getWidth();
        int frameHeight = this.calculatorFrame.getHeight();

        int x = (screenSize.width - frameWidth) / 2;
        int y = (screenSize.height - frameHeight) / 2;

        this.calculatorFrame.setLocation(x, y);
    }

}
