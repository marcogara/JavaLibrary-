import java.sql.*;
import java.util.ArrayList;

public class TeilnehmerDatenbank {

    public static ArrayList<Teilnehmer<Integer,String>> selectTeilnehmer() {
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/schulungsteilnehmer", "root", "");
             Statement statement = connection.createStatement()) {
            ArrayList<Teilnehmer<Integer,String>> teilnehmers = new ArrayList<>();

            ResultSet rs = statement.executeQuery("SELECT * FROM teilnehmer;");
            while (rs.next()) {
                teilnehmers.add(new Teilnehmer<>(rs.getInt("id"), rs.getString("name")));
            }
            return teilnehmers;
        } catch (SQLException sqlex) {
            sqlex.printStackTrace();
            return null;
        }
    }

    }

