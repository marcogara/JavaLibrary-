import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BodyMassGUI extends JFrame {
    private JPanel panel;
    private JTextField textField1;
    private JTextField textField2;
    private JButton button;
    private JLabel outputLabel;

    public BodyMassGUI() {
        setTitle("Simple Panel");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 200);
        setLayout(new BorderLayout());

        // Create the input panel
        panel = new JPanel();
        panel.setLayout(new FlowLayout());

        JLabel label1 = new JLabel("Input 1:");
        textField1 = new JTextField(10);

        JLabel label2 = new JLabel("Input 2:");
        textField2 = new JTextField(10);

        panel.add(label1);
        panel.add(textField1);

        panel.add(label2);
        panel.add(textField2);

        add(panel, BorderLayout.NORTH);

        button = new JButton("Calculate");

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int num1 = Integer.parseInt(textField1.getText());
                int num2 = Integer.parseInt(textField2.getText());
                int sum = num1 + num2;

                outputLabel.setText("Sum: " + sum);
            }

        });

        add(button, BorderLayout.CENTER);

        outputLabel = new JLabel();
        add(outputLabel, BorderLayout.SOUTH);

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
}
