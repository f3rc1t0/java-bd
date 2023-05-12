import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {

    public static void main(String [] args) throws SQLException, ClassNotFoundException {
        callEliminar();
    }

    public static void callEliminar() throws SQLException, ClassNotFoundException {

        MysqlConfig config = new MysqlConfig();

        String sqlToCallSP = "{CALL eliminar_ciudad (?)}";
        Connection connection = config.getConnection();

        CallableStatement stmt = connection.prepareCall(sqlToCallSP);
        stmt.setString(1, "Excelente gastronomía");
        //stmt.execute();

        int rows = stmt.executeUpdate();
        System.out.println("Filas afectadas: " + rows);
    }
}
