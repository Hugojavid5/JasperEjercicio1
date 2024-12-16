package DB;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConexionBBDD {
    private static Connection connection;

    public ConexionBBDD() throws SQLException {
        Properties connConfig =loadProperties() ;
        String url=connConfig.getProperty("dburl");
        connection = DriverManager.getConnection(url, connConfig);
        connection.setAutoCommit(true);
        connection.setAutoCommit(true);
    }

    public static Connection getConnection() {
        return connection;
    }

    public Connection CloseConexion() throws SQLException{
        connection.close();
        return connection;
    }

    public static Properties loadProperties() {
        try (FileInputStream fs = new FileInputStream("configuracion.properties")) {
            Properties props = new Properties();
            props.load(fs);
            return props;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

}
