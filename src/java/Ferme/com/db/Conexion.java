
package Ferme.com.db;
import java.sql.*;

public class Conexion {
       public static Connection getConexion() {

        Connection connection = null;
        try {
           String driverClassName = "oracle.jdbc.driver.OracleDriver";
           String driverUrl="jdbc:oracle:thin:@localhost:1521:XE";
           Class.forName(driverClassName);
           connection = DriverManager.getConnection(driverUrl, "F","oracle");
        }catch (ClassNotFoundException | SQLException e) {
        }
        return connection;
    }
}
