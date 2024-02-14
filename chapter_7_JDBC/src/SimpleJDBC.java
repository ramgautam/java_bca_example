
//STEP -1 - Import required packages
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SimpleJDBC {
    public static void main(String[] args) {
        // Database credentials
        String url = "jdbc:mysql://localhost:3306/College";
        String user = "root";
        String password = "mysql";

        // SQL query
        String query = "SELECT * FROM teacher";

        try {
            // STEP -2 Register JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // STEP -3 Open a connection
            Connection conn = DriverManager.getConnection(url, user, password);

            // STEP -4 Create a statement object
            Statement statement = conn.createStatement();

            // STEP -5 Execute a SQL statement with the Statement object and returning a jdbc resultset
            ResultSet resultSet = statement.executeQuery(query);

            // Process the result set
            while (resultSet.next()) {
                // Retrieve data from each row
                int id = resultSet.getInt("teacher_id");
                int name = resultSet.getInt("teacher_name");
                String address = resultSet.getString("teacher_address");
                String phone = resultSet.getString("teacher_phone");

                // Do something with the data (e.g., print it)
                System.out.println("ID: " + id + ", Name: " + name + ", Address: " + address + ", Phone: " + phone);
            }

            // STEP -6 Clean-up
            resultSet.close();
            statement.close();
            conn.close();
        }  catch (Exception e) {
            e.printStackTrace();
        }
    }
}

