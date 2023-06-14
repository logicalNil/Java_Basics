import java.sql.*;
import java.util.Scanner;

// Connect a database
public class Connect {

    public static void main(String[] args) {
        try {
            // Load the JDBC driver
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver loaded");

            // Connect to a database
            Connection connection = DriverManager.getConnection
                ("jdbc:mysql://localhost:3306/userdatabase", "root", "nilay123");
            System.out.println("Database connected");

            // Create a statement
            Statement statement = connection.createStatement();

            // Execute a statement
            ResultSet resultSet = statement.executeQuery
                ("select * from student");

            // Iterate through the result and print the student names
            while (resultSet.next())
                System.out.println(resultSet.getString(1) + "\t" +
                    resultSet.getString(2) + "\t" + resultSet.getString(3));

            // Close the connection
            connection.close();
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
