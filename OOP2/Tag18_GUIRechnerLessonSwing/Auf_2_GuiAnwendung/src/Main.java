/*
Erstelle eine Gui, welche ein Menü besitzt und über ein Menüitem Button erstellen kann.
Es sollen immer 3 Buttons in Reihe sein, zudem soll der Abstand zwischen
den Buttons immer der gleiche sein
beachte folgendes
	Gui
			=> soll einen Titel haben
			=> die größe soll 500 x 500 sein
			=> beim Schließen soll das Programm enden
			=> größe darf nicht veränderbar sein
			=> ändere die Background-Farbe

	Menü
            => 2 Menü Items
            => eines zum schließen des Programms
            => eines zum Hinzufügen von einem Button
            => Tooltip des Items
            => Buttons
            => beim Klicken soll das Programm schließen
            => flüssiges aktualisieren der Gui
            => mit Border
            => alle Buttons sollen durchnummeriert sein

 */

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new GUI());
    }

    static class GUI {

        private final JFrame calculatorFrame;
        private JTextField txt_display;
        private JPanel pnl_buttons;

        public GUI() {
            this.calculatorFrame = new JFrame();
            //			=> beim Schließen soll das Programm enden
            this.calculatorFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            // Feste Werte im Quellcode ist ein Code Smell!
            // Hier haben wir die pixel Werte Hardcodiert, Literale
            // auch einfach Magic Number.
            // 			=> die größe soll 500 x 500 sein
            this.calculatorFrame.setPreferredSize(new Dimension(500, 500));
            this.calculatorFrame.setMinimumSize(new Dimension(500, 500));

            //          => größe darf nicht veränderbar sein
            this.calculatorFrame.setResizable(false);
            // 			=> ändere die Background-Farbe
            this.calculatorFrame.getContentPane().setBackground(new Color(50, 168, 82));

            // 			=> soll einen Titel haben
            this.calculatorFrame.setTitle("HIER IST DER TITEL");

            this.calculatorFrame.setVisible(true);
            setDynamicLocation();
            addMenu();

        }

        private void addMenu() {
            //             => 2 Menü Items
            JMenu menu;
            JMenuItem i1, i2;

            JMenuBar mb = new JMenuBar();
            // Erstellen und Hinzufügen eines Borders zum Menu
            Border border = BorderFactory.createLineBorder(Color.BLACK); // Erstellen des Borders mit schwarzer Linie
            menu = new JMenu("Menu");
            menu.setBorder(border); // Hinzufügen des Borders zum Menu

            i1 = new JMenuItem("Item 1");
            i2 = new JMenuItem("Item 2");

            // Add ActionListener to Item 1        => eines zum schließen des Programms
            i1.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    System.exit(0); // Close program when Item 1 is clicked
                }
            });

            // Set tooltip for EXIT menu items  => eines zum schließen des Programms
            i1.setToolTipText("Schließen des Programms");
            //             => eines zum Hinzufügen von einem Button
            i2.setToolTipText("Hinzufügen Button");

            menu.add(i1);
            menu.add(i2);

            mb.add(menu);
            this.calculatorFrame.setJMenuBar(mb);
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


}

