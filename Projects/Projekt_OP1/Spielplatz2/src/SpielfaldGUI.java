import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SpielfaldGUI extends JFrame implements ActionListener
{
    private JButton[] knoepfe = new JButton[9];     //Der Array wurde angelegt ABER es ist noch KEIN Objekt verfügbar
    private boolean[]   bKnopfAuswahl = new boolean[knoepfe.length];
    private Color knopfHintergrund = Color.LIGHT_GRAY;
    public SpielfaldGUI()
    {
        for(int i=0;i<knoepfe.length;i++)
        {
            knoepfe[i] = new JButton(String.format("<html><h1>%d</h1></html>",i+1));
            bKnopfAuswahl[i] = false;
        }
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle("Unser erstes GUI-Projekt soll uns nicht beeindrucken sondern nur Zeit erschlagen");
        initDialog();
        this.setSize(800,600);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }

    /**
     * Dient der Generierung des Hauptfensters mit Spielflaeche
     */
    private void initDialog()
    {
        //LineBorder umrahmung = new LineBorder(Color.BLACK,10);
        BorderLayout borderLayout = new BorderLayout(10,10);
        this.setLayout(borderLayout);
        this.add(initAnzeige(),BorderLayout.CENTER);
    }

    /**
     * Wir erstellen hier das kleine Spielfeld mit 9 Knöpfen die ausgewählt werden können.
     * Wir werden ein geeignetes Layout festlegen  und dann die Knöpfe hinzufügen
     * @return JPanel vollständig dargestellt :)
     */
    private JPanel initAnzeige()
    {
        JPanel panFeld = new JPanel();
        //Lange Schreibweise:
        //GridLayout gridLayout = new GridLayout(3,3);
        //panFeld.setLayout(gridLayout);
        //kurze Schreibweise
        panFeld.setLayout(new GridLayout(3,3));
        //Einzelne Schreibweise für das Hinzufügen von Knöpfen
        //panFeld.add(knoepfe[0],0);
        //panFeld.add(knoepfe[1],1);
        //panFeld.add(knoepfe[2],2);
        //panFeld.add(knoepfe[3],3);
        //...
        //es geht aber auch mit einer Schleife:
        for(int i=0;i<knoepfe.length;i++)
        {
            panFeld.add(knoepfe[i],i);
            knoepfe[i].addActionListener(this);
            //2.Variante um ein ListenerInterface einem Knopf anzufügen
            /*
            knoepfe[i].addActionListener(new ActionListener()
            {
                @Override
                public void actionPerformed(ActionEvent actionEvent)
                {

                }
            });
            */
        }
        return panFeld;
    }

    public static void main(String[] args)
    {
        SpielfaldGUI spielfeld = new SpielfaldGUI();
    }

    private void pruefeReihe()
    {
        boolean bGewinn = false;
        /* Gewinnerreihen wären:
            true muss sein: 0 1 2 oder 3 4 5 oder 6 7 8
                            0 3 6 oder 1 4 7 oder 2 5 8
                            0 4 8 oder 5 4 7
         */
        if(bKnopfAuswahl[0] && bKnopfAuswahl[1] && bKnopfAuswahl[2])
        {
            bGewinn = true;
        }
        else if(bKnopfAuswahl[3] && bKnopfAuswahl[4] && bKnopfAuswahl[5])
        {
            bGewinn = true;
        }
        else if(bKnopfAuswahl[6] && bKnopfAuswahl[7] && bKnopfAuswahl[8])
        {
            bGewinn = true;
        }
        else if(bKnopfAuswahl[0] && bKnopfAuswahl[3] && bKnopfAuswahl[6])
        {
            bGewinn = true;
        }
        else if(bKnopfAuswahl[1] && bKnopfAuswahl[4] && bKnopfAuswahl[7])
        {
            bGewinn = true;
        }
        else if(bKnopfAuswahl[2] && bKnopfAuswahl[5] && bKnopfAuswahl[8])
        {
            bGewinn = true;
        }
        else if(bKnopfAuswahl[0] && bKnopfAuswahl[4] && bKnopfAuswahl[8])
        {
            bGewinn = true;
        }
        else if(bKnopfAuswahl[5] && bKnopfAuswahl[4] && bKnopfAuswahl[7])
        {
            bGewinn = true;
        }
        if(bGewinn==true)
        {//Es wurde eine Gewinnreihe gefunden
            JOptionPane.showMessageDialog(null,"Es wurde eine Gewinnreihe gewählt.","Gewonnen", JOptionPane.PLAIN_MESSAGE);
        }
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent)
    {
        Integer iIdKnopf = -1;
        JButton butTemp;
        String sTemp = actionEvent.getActionCommand();
        // wir erhalten unter Nutzung von getActionCommand folgende Knopfbeschriftung als Auslöser
        // zurückgeliefert: <html><h1>2</h1></html>
        sTemp = sTemp.replace("<html><h1>","");
        sTemp = sTemp.replace("</h1></html>","");
        //ActionEvent enthält auch den Auslöser des Events und muss nur noch  in einen JButton gecastet werden
        //um z.B. die Farbe zu ändern
        iIdKnopf = Integer.parseInt(sTemp)-1;
        //butTemp = (JButton)actionEvent.getSource();
        if(iIdKnopf > -1 && iIdKnopf < knoepfe.length)
        {
            if(bKnopfAuswahl[iIdKnopf]) // entspricht if(bKnopfAuswhl[iIdKnopf] == true)
            { // Hier wird der Knopf disable und die Hintergrund muss geändert werden
                knoepfe[iIdKnopf].setBackground(knopfHintergrund);
                bKnopfAuswahl[iIdKnopf] = false;
            }
            else
            { // hier wird der Knopf enable
                knoepfe[iIdKnopf].setBackground(Color.ORANGE);
                bKnopfAuswahl[iIdKnopf] = true;
            }
            pruefeReihe();
        }
    }
}
