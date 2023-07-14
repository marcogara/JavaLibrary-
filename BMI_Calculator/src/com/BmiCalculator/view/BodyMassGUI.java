package com.BmiCalculator.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class BodyMassGUI extends JFrame {
    private JPanel panel;
    private JTextField textField1;
    private JTextField textField2;
    private JButton button;
    private JTextField outputField;

    public BodyMassGUI() {
        setTitle("BMI Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 200);
        setLayout(new BorderLayout());

        // Create the input panel
        panel = new JPanel();
        panel.setLayout(new FlowLayout());

        JLabel label1 = new JLabel("Size in m (#.##):");
        textField1 = new JTextField(4);

        JLabel label2 = new JLabel("Weight in Kg (##.#):");
        textField2 = new JTextField(4);

        panel.add(label1);
        panel.add(textField1);

        panel.add(label2);
        panel.add(textField2);

        add(panel, BorderLayout.NORTH);

        button = new JButton("Calculate");
        button.setPreferredSize(new Dimension(100, 50)); // Set the button size using hard-coded values

        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        buttonPanel.add(button);

        add(buttonPanel, BorderLayout.CENTER);

        outputField = new JTextField(20);
        outputField.setPreferredSize(new Dimension(40, 60));
        outputField.setEditable(false);
        JPanel outputPanel = new JPanel(new FlowLayout());
        outputPanel.add(outputField);

        add(outputPanel, BorderLayout.SOUTH);

        setDynamicLocation();
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
        this.button.addActionListener(actionListener);
    }

    public JTextField getTextField1() {
        return textField1;
    }

    public JTextField getTextField2() {
        return textField2;
    }

    public void setOutputField(String s) {
        this.outputField.setText(s);
        this.outputField.setFont(new Font("Arial", Font.BOLD, 24)); // Set the font size
        this.outputField.setHorizontalAlignment(JTextField.CENTER);
        this.outputField.setText(s);
    }

    public JButton getButton() {
        return button;
    }
}
