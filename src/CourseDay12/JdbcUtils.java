package CourseDay12;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Driver;
import java.util.Properties;
public class JdbcUtils {

    public static Connection buildConnection() throws Exception {
        String URL = "jdbc:mysql://localhost:3306/navimumbai?useSSL=false";
        String Username = "tejas";
        String Password = "tejasm";
        Connection dbConnection =
                DriverManager.getConnection(URL, Username, Password);
        return dbConnection;
    }
}
