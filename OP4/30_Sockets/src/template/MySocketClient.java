package template;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class MySocketClient
{
    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);

        MySocketClient client = new MySocketClient();
        String nachricht;
        try {
            client.connect("localhost", 1234);
            do {
                System.out.println("Bitte Message eingeben");

                nachricht = sc.nextLine();
                String antwort = client.sendMessage(nachricht);
                System.out.println("Antwort vom Server: " + antwort);

            } while (!nachricht.isBlank());

        } catch (Exception e)
        {
            e.printStackTrace();
        }
        finally
        {
            try
            {
                client.disconnect();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
        }
    }

    private Socket clientSocket;
    private PrintWriter writer;
    private BufferedReader reader;

    public void connect(String ip, int port) throws IOException
    {
        // Erstellt einen Socket und verbindet mit der angegebenen Host-Adresse und Port:
        clientSocket = new Socket(ip, port);

        if (clientSocket.isConnected())
            System.out.println("Verbunden");

        // System.out.println(clientSocket.getLocalAddress());   not needed in code for Prüfung
        // System.out.println(clientSocket.getRemoteSocketAddress());

        writer = new PrintWriter(clientSocket.getOutputStream(), true);
        reader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
    }

    /**
     * Sendet eine Nachricht an den Server und gibt anschließend die Antwort zurück.
     * @return Die Antwort des Servers.
     */
    public String sendMessage(String message) throws IOException
    {
        writer.println(message);
        return reader.readLine();
    }

    public void disconnect() throws IOException
    {
        reader.close();
        writer.close();
        clientSocket.close();
    }
}

