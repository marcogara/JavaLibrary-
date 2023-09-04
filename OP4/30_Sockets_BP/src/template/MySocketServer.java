package template;

import java.io.*;
import java.net.*;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class MySocketServer {
    private static final int PORT = 1234;
    private static final String PROTOCOL_FILE_PATH = "resources/protokoll.txt";
    private static final String[] FUNNY_MESSAGES = {
            "Warum hat der Server immer das letzte Wort? Weil er immer \"Ok\" sagt!",
            "Ein Server und ein Client gehen in eine Bar. Der Barkeeper sagt: \"Sorry, wir bedienen keine Socket-Verbindungen hier.\" Der Client sagt: \"Macht nichts, ich bin drahtlos!\"",
            "Warum hat der Server keine Freunde? Weil er immer nur von Clients umgeben ist und nie Zeit hat, sich zu verbinden!",
            "Ein Server und ein Client treffen sich auf einer Party. Der Server sagt: \"Kann ich dir eine Nachricht kaufen?\" Der Client antwortet: \"Ja, aber nur, wenn du sie verschlüsselst!\"",
    };

    public static void main(String[] args) {
        try {
            startServer();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void startServer() throws IOException {
        try (ServerSocket serverSocket = new ServerSocket(PORT)) {
            System.out.println("Server gestartet. Wartet auf Verbindungen...");
            Socket clientSocket = serverSocket.accept();
            System.out.println("Verbindungsanfrage angenommen.");

            try (
                    PrintWriter writer = new PrintWriter(clientSocket.getOutputStream(), true);
                    BufferedReader reader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()))
            ) {
                handleClientCommunication(reader, writer);
            } finally {
                saveToProtocol("Verbindung getrennt.");
            }
        }
    }

    private static void handleClientCommunication(BufferedReader reader, PrintWriter writer) throws IOException {
        String input;
        Random random = new Random();
        while (true) {
            try {
                input = reader.readLine();
                if (input == null) {
                    // The client closed the connection, break out of the loop
                    break;
                }
                saveToProtocol(input);
                if (input.equalsIgnoreCase("Hallo Server")) {
                    int randomIndex = random.nextInt(FUNNY_MESSAGES.length);
                    writer.println("Hallo Client. " + FUNNY_MESSAGES[randomIndex]);
                } else {
                    int randomIndex = random.nextInt(FUNNY_MESSAGES.length);
                    writer.println("Unbekannte Anfrage. " + FUNNY_MESSAGES[randomIndex]);
                }
            } catch (SocketException e) {
                // Handle the socket exception, e.g., log it
                System.out.println("Client connection closed unexpectedly.");
                break;
            }
        }
    }

    private static void saveToProtocol(String input) throws IOException {
        try (BufferedWriter protocolWriter = new BufferedWriter(new FileWriter(PROTOCOL_FILE_PATH, true))) {
            LocalDateTime dt = LocalDateTime.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

            // Format the LocalDateTime using the custom formatter
            String formattedDateTime = dt.format(formatter);
            protocolWriter.write(formattedDateTime + "      " + input + "\n");
        }
    }
}
