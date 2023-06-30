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

        private JFrame guiFrame;

        public GUI() {

            setupFrame();
            setupMenu();

        }

        private void setupFrame() {
            this.guiFrame = new JFrame();
            
            //			=> beim Schließen soll das Programm enden
            this.guiFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            // 			=> die größe soll 500 x 500 sein
            this.guiFrame.setPreferredSize(new Dimension(500, 500));
            this.guiFrame.setMinimumSize(new Dimension(500, 500));

            //          => größe darf nicht veränderbar sein
            this.guiFrame.setResizable(false);
            // 			=> ändere die Background-Farbe
            this.guiFrame.getContentPane().setBackground(new Color(50, 168, 82));

            // 			=> soll einen Titel haben
            this.guiFrame.setTitle("HIER IST DER TITEL");
            this.guiFrame.setVisible(true);
            setDynamicLocation();
        }

        private void setDynamicLocation() {
            Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

            int frameWidth = this.guiFrame.getWidth();
            int frameHeight = this.guiFrame.getHeight();

            int x = (screenSize.width - frameWidth) / 2;
            int y = (screenSize.height - frameHeight) / 2;

            this.guiFrame.setLocation(x, y);
        }

        private void setupMenu() {
            ActionListener exitListener = createExitListener();

            JMenu menu = createMenuWithBorder("Menu");

            JMenuItem item1 = createMenuItem("Item 1", new ActionListener[]{exitListener});
            JMenuItem item2 = new JMenuItem("Item 2");

            setTooltip(item1, "Schließen des Programms");
            setTooltip(item2, "Hinzufügen Button");

            menu.add(item1);
            menu.add(item2);

            JMenuBar menuBar = createMenuBar(menu);
            this.guiFrame.setJMenuBar(menuBar);
        }

        private ActionListener createExitListener() {
            return new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    System.exit(0); // Close program when Item 1 is clicked
                }
            };
        }

        private JMenu createMenuWithBorder(String label) {
            JMenu menu = new JMenu(label);

            Border border = BorderFactory.createLineBorder(Color.BLACK);
            menu.setBorder(border);

            return menu;
        }

        private JMenuItem createMenuItem(String label, ActionListener[] actionListeners) {
            JMenuItem menuItem = new JMenuItem(label);

            for (ActionListener listener : actionListeners) {
                menuItem.addActionListener(listener);
            }

            return menuItem;
        }

        private void setTooltip(JComponent component, String tooltipText) {
            component.setToolTipText(tooltipText);
        }

        private JMenuBar createMenuBar(JComponent... components) {
            JMenuBar mb = new JMenuBar();

            for (JComponent component : components) {
                mb.add(component);
            }

            return mb;
        }

    }

}

