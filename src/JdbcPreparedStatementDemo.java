import java.sql.*;
import java.util.*;

public class JdbcPreparedStatementDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\\n");

        System.out.println("Enter the book number");
        int bno = sc.nextInt();
        System.out.println("Enter book name");
        String bname = sc.next();
        System.out.println("Enter book price");
        float price = sc.nextFloat();

        try {

            Class.forName("com.mysql.cj.jdbc.Driver"); // gives ClassNotFoundException.
            // We need to add mysql-connector-java-8.0.11.jar file

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java08","root","root");
            System.out.println("Connected");

            //Used to accept the values during runtime
            /*
            PreparedStatement pst = con.prepareStatement("insert into books values(?,?,?)");
            pst.setInt(1,bno);
            pst.setString(2,bname);
            pst.setFloat(3,price);
            pst.executeUpdate();
            System.out.println("Inserted");
            */

            PreparedStatement pst = con.prepareStatement("insert into books values("+bno+",'"+bname+"',"+price+")");
            pst.executeUpdate();
            System.out.println("Inserted");
            pst.close();
            con.close();
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
