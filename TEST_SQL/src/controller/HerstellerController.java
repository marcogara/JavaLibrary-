package controller;
import model.Hersteller;

import java.math.BigDecimal;
import java.sql.*;

public class HerstellerController {

    public static void selectHersteller() {
        Connection connection = null;

        String name;
        try {
            // Java Driver Database Connector (JDBC)
            String connectionString = "jdbc:mysql://localhost:3306/onlineshop";
            connection = DriverManager.getConnection(connectionString, "root", "");

            // System.out.println("Got it");

            // connection.createStatement() erzeugt passend zu der Connection ein Statement-Objekt, über welches anschließend SQL Behfele an die Datenbank gesendet werden können.
            Statement statement = connection.createStatement();

            // statement.executeQuery(...) führt die angegebene Query auf der datenbank aus und gibt das Ergebnis der Abfrage als ResultSet zurück.
            ResultSet rs = statement.executeQuery("Select * from hersteller;");

            // Iterate through the result set and print each row's data
            while (rs.next()) {
                int nummer = rs.getInt("nummer");
                name = rs.getString("Name");

                var hersteller = new Hersteller(nummer, name);
                System.out.println(hersteller.getName() + ", " + hersteller.getNummer());

                // System.out.println(nummer+ ", " + name +);

                // new Hersteller(nummer, name);
            }
            connection.close();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public static void insertHersteller(String name) {
        Connection connection = null;

        try {
            // Java Driver Database Connector (JDBC)
            String connectionString = "jdbc:mysql://localhost:3306/onlineshop";
            connection = DriverManager.getConnection(connectionString, "root", "");

            // Create a Statement object to execute the query
            Statement statement = connection.createStatement();

            // Execute the INSERT query to insert data into database
            int rowsAffected = statement.executeUpdate("INSERT INTO hersteller(name) VALUES ('" + name + "')");

            if (rowsAffected > 0) {
                System.out.println("Data inserted successfully.");
            } else {
                System.out.println("Failed to insert data.");
            }

            // Close resources after use
            statement.close();
            connection.close();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public static boolean updateHersteller(int nummer, String name) {
        Connection connection = null;
        try {
            // Java Driver Database Connector (JDBC)
            String connectionString = "jdbc:mysql://localhost:3306/onlineshop";
            connection = DriverManager.getConnection(connectionString, "root", "");

            // Create a PreparedStatement object to execute the query
            String sql = "UPDATE hersteller SET name = ? WHERE nummer = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);

            // Set the values of the parameters
            preparedStatement.setString(1, name);
            preparedStatement.setInt(2, nummer);

            // Execute the UPDATE query to update data in database
            int rowsAffected = preparedStatement.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println("Data updated successfully.");
                // Close resources after use
                preparedStatement.close();
                connection.close();
                return true;
            } else {
                System.out.println("Failed to update data.");
                // Close resources after use
                preparedStatement.close();
                connection.close();
                return false;
            }

        } catch (SQLException e) {
            System.out.println(e);
            return false;
        }
    }

    public static boolean deleteHersteller(int nummer,String name) {
        Connection connection = null;
        try {
            // Java Driver Database Connector (JDBC)
            String connectionString = "jdbc:mysql://localhost:3306/onlineshop";
            connection = DriverManager.getConnection(connectionString, "root", "");

            // Create a PreparedStatement object to execute the query
            String sql = "DELETE FROM hersteller WHERE nummer = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);

            // Set the values of the parameters
            preparedStatement.setString(1, name);
            preparedStatement.setInt(2, nummer);

            // Execute the UPDATE query to update data in database
            int rowsAffected = preparedStatement.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println("Data updated successfully.");
                // Close resources after use
                preparedStatement.close();
                connection.close();
                return true;
            } else {
                System.out.println("Failed to update data.");
                // Close resources after use
                preparedStatement.close();
                connection.close();
                return false;
            }

        } catch (SQLException e) {
            System.out.println(e);
            return false;
        }
    }

}














































