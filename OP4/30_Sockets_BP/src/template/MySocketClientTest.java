package template;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

// Guide: https://junit.org/junit5/docs/current/user-guide/

class MySocketClientTest
{
    // Zum Ausführen des Tests in diesem Beispiel muss der Server manuell gestartet werden.
    @Test
    void sendMessage() throws IOException
    {
        //MySocketClient client = new MySocketClient();


        //assertDoesNotThrow(() -> client.connect("localhost", 1234));

        //String antwort = client.sendMessage("Hallo Server");

        // Wenn wir "Hallo Server" an den Server schicken, erwarten wir, dass "Hallo Client" vom Server zurückkommt.
        // Wenn wir die Antwort erhalten, die wir erwarten, ist der Test erfolgreich.
        //assertEquals("Hallo Client", antwort);

        //client.disconnect();
    }
}