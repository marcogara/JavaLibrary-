package template;


/*
 * Der Begriff Socket-Programmierung bezieht sich auf das Schreiben von
 * Programmen, die auf mehreren Computern ausgeführt werden, wobei die Programme
 * alle über ein Netzwerk miteinander verbunden sind.
 *
 * Es gibt zwei Kommunikationsprotokolle, die wir für die Socket-Programmierung
 * verwenden können: User Datagram Protocol (UDP) und Transfer Control Protocol
 * (TCP) .
 *
 * Der Hauptunterschied zwischen den beiden besteht darin, dass UDP
 * verbindungslos ist, was bedeutet, dass es keine Sitzung zwischen dem Client
 * und dem Server gibt, während TCP verbindungsorientiert ist, was bedeutet,
 * dass zuerst eine exklusive Verbindung zwischen dem Client und dem Server
 * hergestellt werden muss, damit die Kommunikation stattfinden kann.
 *
 * Dies ist eine Einführung in die Socket-Programmierung über TCP/IP-Netzwerke
 * und demonstriert, wie Client/Server-Anwendungen in Java geschrieben werden.
 * Für UDP Beispiele: https://www.baeldung.com/udp-in-java
 *
 * Klassen und Schnittstellen, die sich um Kommunikationsdetails auf niedriger
 * Ebene zwischen Client und Server kümmern, befinden sich größtenteils im
 * java.net-Paket
 *
 * Der Einfachheit halber führen wir unsere Client- und Serverprogramme auf
 * demselben Computer aus. Wenn wir sie auf verschiedenen vernetzten Computern
 * ausführen würden, würde sich nur die IP-Adresse ändern. In diesem Fall
 * verwenden wir localhost auf 127.0.0.1
 *
 * Es wird eine bidirektionale Kommunikationsanwendung sein, bei der der Client
 * den Server begrüßt und der Server antwortet.
 *
 */

//Was ist ein Socket
/*
 * Im Bereich der Client-Server-Architekturen sind Sockets das
 * Standardhilfsmittel mit denen Server beliebige Services an eine große Zahl
 * von Clients verteilen.
 */


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class MySocketServer
{
    public static void main(String[] args)
    {
        MySocketServer myServer = new MySocketServer();
        try
        {
            myServer.start(1234);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        finally
        {
            try
            {
                myServer.stop();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
        }
    }

    private ServerSocket serverSocket; // Socket für den Server.
    private Socket clientSocket; // Der Client, der sich mit dem Server verbindet.

    // Oracle empfiehlt in der Doku für Java 8, PrintWriter und BufferedReader zu verwenden.
    // https://docs.oracle.com/javase/tutorial/networking/sockets/readingWriting.html
    private PrintWriter writer; // Writer, um Daten an Clients zu schicken.
    private BufferedReader reader; // Reader, um eingehende Daten zu lesen.

    public void start(int port) throws IOException
    {
        // Erzeugt einen Server-Socket, der an den angegebenen Port gebunden ist.
        serverSocket = new ServerSocket(port);

        System.out.println("Wartet auf Verbindungen...");
        // Wartet auf einen Verbindungsaufbau zu diesem Socket und nimmt die Verbindung an.
        clientSocket = serverSocket.accept();
        if (clientSocket.isConnected())
            System.out.println("Verbindungsanfrage angenommen.");

        // Verschiedene Methodenaufrufe zum Testen:
        System.out.println(serverSocket.toString());
        System.out.println(serverSocket.getInetAddress());
        System.out.println(serverSocket.getLocalSocketAddress());

        // Um mit dem Client kommunizieren zu können, fragen wir den Output- und InputStream ab.
        // Aus diesen Streams bilden wir Writer und Reader.
        // Hinweis: Damit der PrintWriter die Nachrichten sofort auf den Stream schreibt,
        // sollte autoFlush auf true gesetzt werden.
        writer = new PrintWriter(clientSocket.getOutputStream(), true);
        reader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

        // Eine Zeile Text aus dem InputStream lesen.
        String input = reader.readLine();
        System.out.println(input); // Testweise ausgeben.

        if (input.equalsIgnoreCase("Hallo Server"))
            writer.println("Hallo Client");
        else
            writer.println("Unbekannte Anfrage");

    }

    // Ganz wichtig! Alle Streams und Sockets müssen geschlossen werden, wenn wir sie nicht mehr benötigen.
    // Alternativ: Try-With-Resources verwenden!
    public void stop() throws IOException
    {
        reader.close();
        writer.close();
        clientSocket.close();
        serverSocket.close();
    }

}
