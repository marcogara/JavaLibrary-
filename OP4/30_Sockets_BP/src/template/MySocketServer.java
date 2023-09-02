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

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class MySocketServer {

    private static final int PORT = 1234;
    private static final String PROTOCOL_FILE_PATH = "resources/protokoll.txt";

    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(PORT)) {
            System.out.println("Server gestartet. Wartet auf Verbindungen...");
            Socket clientSocket = serverSocket.accept();
            System.out.println("Verbindungsanfrage angenommen.");

            try (
                    PrintWriter writer = new PrintWriter(clientSocket.getOutputStream(), true);
                    BufferedReader reader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()))
            ) {
                String input;
                while ((input = reader.readLine()) != null) {
                    saveToProtocol(input);
                    if (input.equalsIgnoreCase("Hallo Server")) {
                        writer.println("Hallo Client");
                    } else {
                        writer.println("Unbekannte Anfrage");
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                saveToProtocol("Verbindung getrennt.");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void saveToProtocol(String input) throws IOException {
        try (BufferedWriter protocolWriter = new BufferedWriter(new FileWriter(PROTOCOL_FILE_PATH, true))) {
            protocolWriter.write(input + "\n");
        }
    }
}

/*

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class MySocketServer {

    private static final int PORT = 1234;
    private static final String PROTOCOL_FILE_PATH = "resources/protokoll.txt";

    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(PORT)) {
            System.out.println("Server is running...");
            while (true) {
                Socket clientSocket = serverSocket.accept();
                System.out.println("Accepted connection from: " + clientSocket.getRemoteSocketAddress());

                try (
                    PrintWriter writer = new PrintWriter(clientSocket.getOutputStream(), true);
                    BufferedReader reader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                    BufferedWriter protocolWriter = new BufferedWriter(new FileWriter(PROTOCOL_FILE_PATH, true))
                ) {
                    String input;
                    while ((input = reader.readLine()) != null) {
                        System.out.println("Received from client: " + input);
                        protocolWriter.write(input + "\n");

                        if (input.equalsIgnoreCase("Hallo Server")) {
                            writer.println("Hallo Client");
                        } else {
                            writer.println("Unbekannte Anfrage");
                        }
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }

                // Close the client socket when done with this client
                clientSocket.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

 */