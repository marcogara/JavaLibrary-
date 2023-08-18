package buchverleihn;

import java.sql.*;
import java.time.LocalDate;

public class Buchverleih {

    // mit Update uder Datenbank und Abvzug eine Guthabes protag ein euro
    public static void selectKunde(){
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/buchverleih ","root","");
             Statement statement= connection.createStatement();)
        {

            ResultSet rs = statement.executeQuery("SELECT * FROM kunde;");
            while(rs.next())
            {
                new Kunde(rs.getInt("nummer"),rs.getString("name"),rs.getInt("guthaben"));
            }

        }

        catch (SQLException sqlex)
        {
            sqlex.printStackTrace();
        }
    }

    public static void selectBuch(){
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/buchverleih ","root","");
             Statement statement= connection.createStatement();)
        {

            ResultSet rs = statement.executeQuery("SELECT * FROM buch;");
            while(rs.next())
            {
                new Buch(rs.getInt("id"),rs.getString("titel"));
            }

        }

        catch (SQLException sqlex)
        {
            sqlex.printStackTrace();
        }
    }

    public static void selectAusleihe(){
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/buchverleih ","root","");
             Statement statement= connection.createStatement();)
        {

            ResultSet rs = statement.executeQuery("SELECT * FROM ausleihe;");
            while(rs.next())
            {
                Buch b = Buch.bücher.get(rs.getInt("buch"));
                Kunde k = Kunde.kunden.get(rs.getInt("kunde"));
                LocalDate ld = rs.getObject("datum",LocalDate.class);
                int dauer = rs.getInt("dauer");
                new Ausleihe(b,k,ld,dauer);
            }

        }

        catch (SQLException sqlex)
        {
            sqlex.printStackTrace();
        }
    }

    public static boolean deleteAusleihe(int id)
    {
        try(Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/buchverleih ","root","");
        PreparedStatement preparedStatement = connection.prepareStatement("DELETE FROM ausleihe WHERE id = ?;"))
        {
            preparedStatement.setInt(1,id);
            if (preparedStatement.executeUpdate() != 1)
            {
                return true;
            }
            return false;
        }

        catch (SQLException sq)
        {
            sq.printStackTrace();
            return false;
        }
    }

    public static Ausleihe ausleihe(Buch buch, Kunde kunde, LocalDate date, int dauer) throws SQLException
    {
        if(Ausleihe.ausleiheHashMap.get(buch) == null && kunde.getGuthaben() - dauer >= 0)
        {
            try(Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/buchverleih ","root","");
            )
            {
                connection.setAutoCommit((false));
                try(PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO ausleihe (buch,kunde, datum, dauer) VALUES (?,?,?,?)"))
                {
                    preparedStatement.setInt(1,buch.getId());
                    preparedStatement.setInt(2,kunde.getNummer());
                    preparedStatement.setObject(3,date);
                    preparedStatement.setInt(4,dauer);
                    if(preparedStatement.executeUpdate()!=1)
                    {

                        connection.rollback();
                        return null;
                    }

                }

                catch (SQLException sqlex)
                {
                    sqlex.printStackTrace();
                    return null;
                }
                try(PreparedStatement preparedStatement = connection.prepareStatement("UPDATE kunde SET guthaben = guthaben - ? WHERE nummer = ?"))
                {
                    preparedStatement.setInt(1,dauer);
                    preparedStatement.setInt(2,kunde.getNummer());
                    if(preparedStatement.executeUpdate()!=1)
                    {
                        connection.rollback();
                        return null;
                    }
                }
                catch (SQLException sqlex)
                {
                    sqlex.printStackTrace();
                    return null;
                }
                Ausleihe ausleihe = new Ausleihe(buch, kunde, date, dauer);
                kunde.verändereGuthaben(-dauer);
                connection.commit();
                return ausleihe;

            }
            catch (SQLException sqlException)
            {
                sqlException.printStackTrace();
                return null;
            }
        }
        return null;
    }















































}
