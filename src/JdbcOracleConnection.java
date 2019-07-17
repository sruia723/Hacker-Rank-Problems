import java.sql.*;
public class JdbcOracleConnection {

    public static void main(String[] args) {

        try {

            Class.forName("oracle.jdbc.driver.OracleDriver"); // gives ClassNotFoundException.
            // We need to add mysql-connector-java-8.0.11.jar file

            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","MANAGER");
            System.out.println("Connected");
            con.close();
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
