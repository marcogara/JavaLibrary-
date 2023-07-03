package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
/*
public class CalculatorView {

    private JFrame calculatorFrame;
    private JTextField txt_display;
    private JPanel pnl_buttons;
    private JPanel pnl_display;
    private JPanel pnl_function_buttons;

    public CalculatorView() {
        createCalculatorFrame();
    }

    public void createCalculatorFrame() {
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
        setDynamicLocation();  // besser

        this.calculatorFrame.setResizable(false);
        this.calculatorFrame.getContentPane().setBackground(new Color(104, 139, 173));

        this.calculatorFrame.setTitle("OPEN_CALC");
        this.calculatorFrame.setLayout(new BoxLayout(calculatorFrame, BoxLayout.Y_AXIS));
        initPanels();

        this.calculatorFrame.setVisible(true);
    }

    private void initPanels() {
        // this.pnl_display.setBounds(50,100,300,120);
        this.pnl_display = new JPanel();
        this.txt_display = new JTextField();
        this.pnl_display.setBackground(Color.ORANGE);
        this.pnl_display.add(txt_display);

        this.calculatorFrame.add(this.pnl_display);


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

 */

public class CalculatorView {
    // Attribute, Instanzvariablen, Felder:
    private final Font defaultFont = new Font("Arial", Font.BOLD, 30);

    private JFrame calculatorFrame;
    private JTextField txt_display;

    private JButton[] numberButtons;
    private JButton[] operatorButtons;
    private JPanel pnl_buttons;
    private JPanel pnl_display;
    private JPanel pnl_function_buttons;

    public CalculatorView() {
        this.createDisplay();
        this.createButtonPanel();
        this.createCalculatorFrame();

    }

    private void createCalculatorFrame() {
        this.calculatorFrame = new JFrame();
        this.calculatorFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Feste Werte im Quellcode ist ein Code Smell!
        // Hier haben Pixelwerte hardcoded. Solche fest in den quellcode eingetragene Werte werden als Literale
        // bezeichnet. Oder auch einfach Magic Numbers.
        this.calculatorFrame.setSize(420, 550);

//        this.calculatorFrame.setSize(Toolkit.getDefaultToolkit().getScreenSize().width,
//                Toolkit.getDefaultToolkit().getScreenSize().height);

        this.calculatorFrame.setMinimumSize(new Dimension(400, 200));
        this.calculatorFrame.setPreferredSize(new Dimension(400, 200));

        // bad practice. Laut Oracle sollte immer ein Layout Manager verwendet werden:
        // Absolute Layout - die Komponenten werden nicht relativ ausgerichtet, sondern mit absoluten Werten:
        this.calculatorFrame.setLayout(null);

        // zentriert das Frame:
        this.calculatorFrame.setLocationRelativeTo(null);

        this.calculatorFrame.getContentPane().setBackground(new Color(104, 139, 173));
        this.calculatorFrame.setTitle("CALCUTRON 9001");
        // this.calculatorFrame.setLayout(new BoxLayout(this.calculatorFrame, BoxLayout.Y_AXIS));

        this.calculatorFrame.add(this.pnl_buttons);

        // TODO: das gefällt mir nicht, dass hier buttons hinzugefügt werden und die bounds eingestellt werden:
        this.operatorButtons[6].setBounds(50, 430, 145, 50);
        this.operatorButtons[7].setBounds(205, 430, 145, 50);
        this.calculatorFrame.add(this.operatorButtons[6]);
        this.calculatorFrame.add(this.operatorButtons[7]);
        this.calculatorFrame.add(this.txt_display);

        this.calculatorFrame.setVisible(true);
    }

    private void createDisplay() {
        this.txt_display = new JTextField();
        this.txt_display.setBounds(50, 25, 300, 50);
        this.txt_display.setFont(new Font("Arial", Font.BOLD, 30));
        this.txt_display.setHorizontalAlignment(JTextField.RIGHT);
        this.txt_display.setEditable(false);
    }

    private void createButtonPanel() {
        this.numberButtons = new JButton[10];

        for (int i = 0; i < 10; i++) {
            this.numberButtons[i] = new JButton(String.format(String.valueOf(i)));
            this.numberButtons[i].setFont(defaultFont);
            this.numberButtons[i].setFocusable(false);
        }

        Operators[] operators = Operators.values();
        this.operatorButtons = new JButton[(operators.length)];

        for (int i = 0; i < this.operatorButtons.length; i++) {
            operatorButtons[i] = new JButton();
            operatorButtons[i].setFont(this.defaultFont);
            operatorButtons[i].setFocusable(false);
            operatorButtons[i].setText(operators[i].getBtnText());
        }

        // TODO: Das refaktorisieren und am besten in der Schleife zuordnen.
        this.pnl_buttons = new JPanel();
        this.pnl_buttons.add(numberButtons[7]);
        this.pnl_buttons.add(numberButtons[8]);
        this.pnl_buttons.add(numberButtons[9]);
        this.pnl_buttons.add(operatorButtons[3]);

        this.pnl_buttons.add(numberButtons[4]);
        this.pnl_buttons.add(numberButtons[5]);
        this.pnl_buttons.add(numberButtons[6]);
        this.pnl_buttons.add(operatorButtons[2]);

        this.pnl_buttons.add(numberButtons[1]);
        this.pnl_buttons.add(numberButtons[2]);
        this.pnl_buttons.add(numberButtons[3]);
        this.pnl_buttons.add(operatorButtons[1]);

        this.pnl_buttons.add(operatorButtons[4]);
        this.pnl_buttons.add(numberButtons[0]);
        this.pnl_buttons.add(operatorButtons[5]);
        this.pnl_buttons.add(operatorButtons[0]);

        // HIer wird das Panel erstellt:
        this.pnl_buttons.setBounds(50, 100, 300, 300);
        this.pnl_buttons.setBackground(new Color(87, 118, 148));
        this.pnl_buttons.setLayout(new GridLayout(4, 4, 10, 10));


    }

    // öffentliche Methode, die Controller benutzen kann um mit der view zu interagieren.
    public void setButtonClickListener(ActionListener buttonClickListener) {
        for (int i = 0; i < this.numberButtons.length; i++) {
            this.numberButtons[i].addActionListener(buttonClickListener);
        }

        for (int i = 0; i < this.operatorButtons.length; i++) {
            this.operatorButtons[i].addActionListener(buttonClickListener);
        }
    }

    public void writeToDisplay(String content) {
        this.txt_display.setText(content);
    }

    public void clearDisplay() {
        this.txt_display.setText("");
    }
}


//        this.pnl_display = new JPanel();
//        this.pnl_display.setBackground(Color.ORANGE);

//        this.pnl_display.add(txt_display);
//        this.pnl_display.setVisible(true);





























