import java.sql.*;
import java.util.Scanner;

public class JdbcCallableStatementProcedureDemo {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\\n");

        System.out.println("Enter the 3 digit book number.");

        while (!sc.hasNextInt())
        {
            sc.next();
            System.out.println("Please enter the 3 digit book number.");
        }
        int bno = sc.nextInt();
        while (bno%111 != 0)
        {
            System.out.println("Please enter correct 3 digit book number");
            bno = sc.nextInt();
        }

        try {

            Class.forName("com.mysql.cj.jdbc.Driver"); // gives ClassNotFoundException.
            // We need to add mysql-connector-java-8.0.11.jar file

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java08","root","root");
            System.out.println("Connected");
            CallableStatement cst = con.prepareCall("{call getpricename(?,?,?)}");
            cst.setInt(1,bno);
            cst.registerOutParameter(2, Types.FLOAT);
            cst.registerOutParameter(3,Types.VARCHAR);
            cst.execute();
            Float f = cst.getFloat(2);
            String s = cst.getString(3);
            System.out.println("Name of the book = " + s + "\n" + "Price = " + f);

            con.close();
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
