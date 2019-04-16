package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnector {
    // połączenie z DB ppiu
    public Connection initializeConnection() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/ppiu?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
        String user = "ppiu_user";
        String password = "123";
        return DriverManager.getConnection(url,user,password);
    }
}
