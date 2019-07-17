import java.sql.*;

public class JdbcMysqlConnection {

    public static void main(String[] args) {

        try {

            Class.forName("com.mysql.cj.jdbc.Driver"); // gives ClassNotFoundException.
            // We need to add mysql-connector-java-8.0.11.jar file

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java08","root","root");
            System.out.println("Connected");
            con.close();
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
