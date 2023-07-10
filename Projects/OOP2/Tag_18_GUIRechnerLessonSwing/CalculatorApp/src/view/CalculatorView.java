package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class CalculatorView {
    // Attribute, Instanzvariablen, Felder:
    private final Font defaultFont = new Font("Arial", Font.BOLD, 30);
    private JFrame calculatorFrame;
    private JTextField txt_display;
    private JButton[] numberButtons;
    private JButton btn_addition, btn_subtraction, btn_multiplication, btn_division, btn_equals, btn_separator, btn_delete, btn_clear;
    private JPanel pnl_buttons;
    private double firstNumber;

    public CalculatorView() {
        this.createDisplay();
        this.createButtonPanel();
        this.createCalculatorFrame();
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
            this.numberButtons[i].addActionListener(e -> writeToDisplay(e.getActionCommand()));

        }

        this.btn_addition = new JButton("+");
        this.btn_addition.setFont(this.defaultFont);
        this.btn_addition.setFocusable(false);

        this.btn_subtraction = new JButton("-");
        this.btn_subtraction.setFont(this.defaultFont);
        this.btn_subtraction.setFocusable(false);

        this.btn_multiplication = new JButton("*");
        this.btn_multiplication.setFont(this.defaultFont);
        this.btn_multiplication.setFocusable(false);

        this.btn_division = new JButton("/");
        this.btn_division.setFont(this.defaultFont);
        this.btn_division.setFocusable(false);

        this.btn_separator = new JButton(".");
        this.btn_separator.setFont(this.defaultFont);
        this.btn_separator.setFocusable(false);
        this.btn_separator.addActionListener(e -> writeToDisplay(e.getActionCommand()));

        this.btn_delete = new JButton("Del");
        this.btn_delete.setFont(this.defaultFont);
        this.btn_delete.setFocusable(false);
        this.btn_delete.addActionListener(e -> deleteLastChar());

        this.btn_equals = new JButton("=");
        this.btn_equals.setFont(this.defaultFont);
        this.btn_equals.setFocusable(false);

        this.btn_clear = new JButton("Clr");
        this.btn_clear.setFont(this.defaultFont);
        this.btn_clear.setFocusable(false);

        this.btn_clear.addActionListener(e -> clearDisplay());

        // TODO: Das refaktorisieren und am besten in der Schleife zuordnen.
        this.pnl_buttons = new JPanel();
        this.pnl_buttons.add(numberButtons[7]);
        this.pnl_buttons.add(numberButtons[8]);
        this.pnl_buttons.add(numberButtons[9]);
        this.pnl_buttons.add(this.btn_division);

        this.pnl_buttons.add(numberButtons[4]);
        this.pnl_buttons.add(numberButtons[5]);
        this.pnl_buttons.add(numberButtons[6]);
        this.pnl_buttons.add(this.btn_multiplication);

        this.pnl_buttons.add(numberButtons[1]);
        this.pnl_buttons.add(numberButtons[2]);
        this.pnl_buttons.add(numberButtons[3]);
        this.pnl_buttons.add(this.btn_subtraction);

        this.pnl_buttons.add(this.btn_separator);
        this.pnl_buttons.add(numberButtons[0]);
        this.pnl_buttons.add(this.btn_equals);
        this.pnl_buttons.add(this.btn_addition);

        // HIer wird das Panel erstellt:
        this.pnl_buttons.setBounds(50, 100, 300, 300);
        this.pnl_buttons.setBackground(new Color(87, 118, 148));
        this.pnl_buttons.setLayout(new GridLayout(4, 4, 10, 10));

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
        this.btn_delete.setBounds(50, 430, 145, 50);
        this.btn_clear.setBounds(205, 430, 145, 50);
        this.calculatorFrame.add(this.btn_delete);
        this.calculatorFrame.add(this.btn_clear);
        this.calculatorFrame.add(this.txt_display);

        this.calculatorFrame.setVisible(true);
    }

    private void writeToDisplay(String content) {

        String text = this.concatInput(content);
        this.txt_display.setText(text);

    }

    private void deleteLastChar() {
        String displayText = this.txt_display.getText();

        if (displayText != null && displayText.length() > 0) {
            txt_display.setText(displayText.substring(0, displayText.length() - 1));
        }
    }

    public void clearDisplay() {
        this.txt_display.setText("");
    }

    private String concatInput(String text) {

        String buffer = txt_display.getText();

        if (buffer != null)
            buffer += text;
        return buffer;
    }

    public String getInputFromDisplay() {
        return this.txt_display.getText();
    }

    public double getFirstNumber() {
        return this.firstNumber;
    }

    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    // öffentliche Methode, die Controller benutzen kann um mit der view zu interagieren.
    public void setArithmethicButtonClickListener(ActionListener arithmethicButtonClickListener) {

        this.btn_division.addActionListener(arithmethicButtonClickListener);
        
        this.btn_multiplication.addActionListener(arithmethicButtonClickListener);
        this.btn_subtraction.addActionListener(arithmethicButtonClickListener);
        this.btn_addition.addActionListener(arithmethicButtonClickListener);
        this.btn_equals.addActionListener(arithmethicButtonClickListener);

    }

    public void writeResultToDisplay(String result) {
        this.txt_display.setText(result);
    }

}






























