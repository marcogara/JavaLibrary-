import model.Hersteller;

import java.math.BigDecimal;
import java.sql.*;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBbeispiel {

    public static void main(String[] args)
    {
        // Erstelle einer Connection
        Connection connection = null;

        try
        {
            // Java Driver Database Connector (JDBC)
            String connectionString = "jdbc:mysql://localhost:3306/mydatabase";
            connection = DriverManager.getConnection(connectionString,"root","");

            System.out.println("Got it");

            // connection.createStatement() erzeugt passend zu der Connection ein Statement-Objekt, über welches anschließend SQL Behfele an die Datenbank gesendet werden können.
            Statement statement = connection.createStatement();

            // statement.executeQuery(...) führt die angegebene Query auf der datenbank aus und gibt das Ergebnis der Abfrage als ResultSet zurück.
            ResultSet rs = statement.executeQuery("Select * from mytable;");

            // Iterate through the result set and print each row's data
            while (rs.next()) {
                int nummer = rs.getInt("nummer");
                String name = rs.getString("Name");

                var hersteller = new Hersteller(nummer, name);
                hersteller.toString();


                // System.out.println(id + ", " + name + ", " + besachreibung + ", " + wert );

            }
            connection.close();
        }
        catch (SQLException e)
        {
            System.out.println(e);
        }
    }
}
