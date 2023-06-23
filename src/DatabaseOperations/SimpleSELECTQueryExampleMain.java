package DatabaseOperations;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class SimpleSELECTQueryExampleMain {
    public static void main(String[] args) {
        String driverClassName = "com.mysql.cj.jdbc.Driver";
        String URL = "jdbc:mysql://localhost:3306/navimumbai?useSSL=false";
        String Username = "tejas";
        String Password = "tejasm";
        Connection dbConnection = null;
        try {
            Class.forName(driverClassName);
            System.out.println("Driver loaded.");

            dbConnection =
                    DriverManager.getConnection(URL, Username, Password);
            System.out.println("Connected to DB");

            Statement stmt = dbConnection.createStatement();

            String sqlQuery =
                    "select rest_tid, rest_name, rest_cuisine, rest_branches from restaurant_master";
            ResultSet rs = 	stmt.executeQuery(sqlQuery);

            while(rs.next()) {
                int restId = rs.getInt(1);
                String restName = rs.getString(2);
                String restCuisine = rs.getString(3);
                int restBranches = rs.getInt(4);
                System.out.println(restId + ", " + restName + ", " + restCuisine + ", " + restBranches);
            }

        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        finally {
            try {
                dbConnection.close();
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

    }

}
