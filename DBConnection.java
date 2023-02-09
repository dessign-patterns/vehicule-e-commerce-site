import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnection {
    private String DBPath = "Data/app_data.db";
    private Connection connection = null;
    private Statement statement = null;

    public Connection getConnection(){
        return connection;
    }
    public void connect() {
        try {
            Class.forName("org.sqlite.JDBC");
            connection = DriverManager.getConnection("jdbc:sqlite:" + DBPath);
            statement = connection.createStatement();
            System.out.println("Connexion a " + DBPath + " avec succès");

            statement.executeUpdate("drop table if exists automobile");
            statement.executeUpdate("create table automobile (id integer, modele string, couleur string, puissance string, espace string, type string)");

            statement.executeUpdate("drop table if exists scooter");
            statement.executeUpdate("create table scooter (id integer, modele string, couleur string, puissance string, type string)");
            
            statement.executeUpdate("drop table if exists commande");
            statement.executeUpdate("create table commande (id integer, vehicule string, montant double, etat string)");

        } catch (ClassNotFoundException notFoundException) {
            notFoundException.printStackTrace();
            System.out.println("Erreur de connection 1");
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
            System.out.println("Erreur de connection");
        }
    }

    public void disconnect() {
        try {
            connection.close();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
