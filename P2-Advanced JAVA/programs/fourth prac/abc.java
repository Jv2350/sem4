import java.sql.*;

public class abc {
    public abc() throws SQLException {
        Connection c = DriverManager.getConnection("jdbc:derby://localhost:1527/jayesh", "jayesh", "jayesh");
        System.err.println("Connection is established");
    }

    public static void main(String[] args) throws SQLException {
        new abc();
    }

}