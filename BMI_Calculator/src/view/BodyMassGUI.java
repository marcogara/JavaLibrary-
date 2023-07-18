package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class BodyMassGUI extends JFrame {
    private final int DEFAULT_WINDOW_WIDTH = 600;
    private final int DEFAULT_WINDOW_HEIGHT = 200;
    private JPanel inputPanel;
    private JTextField textField1;
    private JTextField textField2;
    private JLabel heightLabel;
    private JLabel weightLabel;
    private JPanel buttonPanel;
    private JButton calculateButton;
    private JPanel outputPanel;
    private JTextField outputField;


    public BodyMassGUI() {
        setWindow();
        setComponents();
        setPanels();

        addToPanel(inputPanel, heightLabel, textField1, weightLabel, textField2);
        addToPanel(buttonPanel, calculateButton);
        addToPanel(outputPanel, outputField);

        add(inputPanel, BorderLayout.NORTH);
        add(buttonPanel, BorderLayout.CENTER);
        add(outputPanel, BorderLayout.SOUTH);

        setDynamicLocation();
    }

    private void setPanels() {
        inputPanel = new JPanel(new FlowLayout());
        outputPanel = new JPanel(new FlowLayout());
        buttonPanel = new JPanel(new FlowLayout());
    }

    private void setComponents() {
        textField1 = new JTextField(4);
        textField2 = new JTextField(4);

        heightLabel = new JLabel("Height in m (#.##):");
        weightLabel = new JLabel("Weight in Kg (##.#):");

        calculateButton = new JButton("Calculate");
        calculateButton.setPreferredSize(new Dimension(100, 50));

        outputField = new JTextField(20);
        outputField.setPreferredSize(new Dimension(40, 60));
        outputField.setEditable(false);
    }

    private void addToPanel(JPanel panel, JComponent... components) {
        for (JComponent component : components) {
            panel.add(component);
        }
    }

    private void setWindow() {
        setTitle("BMI Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(DEFAULT_WINDOW_WIDTH, DEFAULT_WINDOW_HEIGHT);
        setLayout(new BorderLayout());
    }

    private void setDynamicLocation() {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

        int frameWidth = getWidth();
        int frameHeight = getHeight();

        int x = (screenSize.width - frameWidth) / 2;
        int y = (screenSize.height - frameHeight) / 2;

        setLocation(x, y);
    }

    public void setButtonClickListener(ActionListener actionListener) {
        this.calculateButton.addActionListener(actionListener);
    }

    public JTextField getTextField1() {
        return textField1;
    }

    public JTextField getTextField2() {
        return textField2;
    }

    public void setOutputField(String s) {
        outputField.setText(s);
        outputField.setFont(new Font("Arial", Font.BOLD, 24));
        outputField.setHorizontalAlignment(JTextField.CENTER);
        outputField.setText(s);
    }

    public JButton getCalculateButton() {
        return calculateButton;
    }
}
