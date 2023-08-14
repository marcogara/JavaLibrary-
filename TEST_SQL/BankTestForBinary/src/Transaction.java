import java.sql.*;

public class Transaction {

    public static void selectKontostand(String nummer)
    {
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank", "root", "")) {
            try(PreparedStatement preparedStatement = connection.prepareStatement("SELECT kontostand FROM konto WHERE nummer = ?"))
            {
                preparedStatement.setString(1,nummer);
                ResultSet rs = preparedStatement.executeQuery();
                while(rs.next())
                {
                    System.out.println("Der Kontostand von Konto mir der Nummer " + nummer + "ist" + rs.getDouble("kontostand" ));
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    static boolean buchenVonNachBetrag(String kontoVon,String kontoNach,double betrag)
    {
        try(Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank", "root", ""))
        {
            connection.setAutoCommit(false);
            int zeilenAnzahl1 = 0;
            int zeilenAnzahl2 =0;
            try(PreparedStatement preparedStatement = connection.prepareStatement("UPDATE konto SET kontostand = kontostand - ? WHERE nummer = ?")) {
                preparedStatement.setDouble(1,betrag);
                preparedStatement.setString(2,kontoVon);

                zeilenAnzahl1 = preparedStatement.executeUpdate();

                if (zeilenAnzahl1 != 1)
                {
                    connection.rollback();
                    return false;
                }

            }
            try(PreparedStatement preparedStatement = connection.prepareStatement("UPDATE konto SET kontostand = kontostand + ? WHERE nummer = ?"))
            {
                preparedStatement.setDouble(1,betrag);
                preparedStatement.setString(2,kontoNach);
                zeilenAnzahl2 = preparedStatement.executeUpdate();
                if(zeilenAnzahl2 != 1)
                {
                    connection.rollback();
                    return false;
                }
            }
            catch (SQLException sqlException)
            {
                sqlException.printStackTrace();
                return false;
            }
            connection.commit();
            return true;
        }
        catch (SQLException sqlException)
        {
            sqlException.printStackTrace();
            return false;
        }

    }


}
