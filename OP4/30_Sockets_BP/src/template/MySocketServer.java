package template;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class MySocketServer {
    private static final int PORT = 1234;
    private static final String PROTOCOL_FILE_PATH = "resources/protokoll.txt";

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
        while ((input = reader.readLine()) != null) {
            saveToProtocol(input);
            if (input.equalsIgnoreCase("Hallo Server")) {
                writer.println("Hallo Client");
            } else {
                writer.println("Unbekannte Anfrage");
            }
        }
    }

    private static void saveToProtocol(String input) throws IOException {
        try (BufferedWriter protocolWriter = new BufferedWriter(new FileWriter(PROTOCOL_FILE_PATH, true))) {
            protocolWriter.write(input + "\n");
        }
    }
}
