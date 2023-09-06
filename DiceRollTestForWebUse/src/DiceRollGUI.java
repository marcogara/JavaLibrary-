import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

// face created here https://www.ionos.com/tools/favicon-generator#tool
public class DiceRollGUI extends JFrame implements ActionListener {

    private static final long serialVersionUID = 1L;

    private JButton rollButton; // Button for rolling
    private JPanel diePanel; // Panel for displaying die face
    private ImageIcon[] dieImages; // Array of die face images

    public DiceRollGUI() {
        super("Dice Roller");
        setSize(380, 380);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(new BorderLayout());

        rollButton = new JButton("Roll");
        rollButton.addActionListener(this);

        add(rollButton, BorderLayout.NORTH);

        diePanel = new JPanel();

        // Load all six images of dice faces into array
        dieImages = new ImageIcon[6];
        for (int i=0; i<6; i++) {
            dieImages[i] = new ImageIcon("images\\" + (i+1) + ".png");
        }

        JLabel initialDieLabel = new JLabel(dieImages[0]); // Set initial die face to 1
        diePanel.add(initialDieLabel);

        add(diePanel, BorderLayout.CENTER);

        setVisible(true);

        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        int w = getSize().width;
        int h = getSize().height;
        int x = (dim.width-w)/2;
        int y = (dim.height-h)/2;
        setLocation(x, y);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Generate random number between 1-6 and set the image of the die accordingly
        Random rand = new Random();
        int rollResult = rand.nextInt(6) + 1;

        JLabel currentDieLabel = (JLabel)diePanel.getComponent(0); // Get current JLabel in panel
        currentDieLabel.setIcon(dieImages[rollResult-1]); // Update with appropriate image for roll result
    }
    public static void main(String[] args) {
        DiceRollGUI test = new DiceRollGUI();
    }

}
