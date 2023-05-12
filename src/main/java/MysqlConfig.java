import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MysqlConfig {

    String host = "localhost:3306";
    String user = "root";
    String password = "MIMble666TOnia";
    String bd = "develop";

    public Connection getConnection() throws ClassNotFoundException, SQLException {

        Class.forName("com.mysql.cj.jdbc.Driver");

        String url = "jdbc:mysql://localhost:3306/develop?user=root&password=MIMble666TOnia";

        Connection con = DriverManager.getConnection(url);

        return con;
    }

}
