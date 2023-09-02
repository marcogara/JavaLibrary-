package template;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class MySocketClient implements AutoCloseable {
    private static final String SERVER_IP = "localhost";
    private static final int SERVER_PORT = 1234;
    private Socket clientSocket;
    private PrintWriter writer;
    private BufferedReader reader;

    public MySocketClient(String ip, int port) throws IOException {
        clientSocket = new Socket(ip, port);

        if (clientSocket.isConnected()) {
            System.out.println("Verbunden");
        }

        writer = new PrintWriter(clientSocket.getOutputStream(), true);
        reader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
    }

    public String sendMessage(String message) throws IOException {
        writer.println(message);
        return reader.readLine();
    }

    @Override
    public void close() throws Exception {
        if (reader != null) {
            reader.close();
        }
        if (writer != null) {
            writer.close();
        }
        if (clientSocket != null) {
            clientSocket.close();
        }
    }

    public static void main(String[] args) {
        try (MySocketClient client = new MySocketClient(SERVER_IP, SERVER_PORT)) {
            Scanner sc = new Scanner(System.in);
            String nachricht;

            do {
                System.out.println("Bitte Message eingeben");
                nachricht = sc.nextLine();
                String antwort = client.sendMessage(nachricht);
                System.out.println("Antwort vom Server: " + antwort);
            } while (!nachricht.isBlank());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("Verbindung getrennt.");
        }
    }
}
