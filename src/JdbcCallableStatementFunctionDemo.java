// To call function

import java.sql.*;

public class JdbcCallableStatementFunctionDemo {

    public static void main(String[] args) {

        try {

            Class.forName("com.mysql.cj.jdbc.Driver"); // gives ClassNotFoundException.
            // We need to add mysql-connector-java-8.0.11.jar file

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java08","root","root");
            System.out.println("Connected");
            CallableStatement cst = con.prepareCall("{? = call fgetprice(?)}");
            cst.setInt(2,666);
            cst.registerOutParameter(1,Types.FLOAT);
            cst.execute();
            Float f = cst.getFloat(1);
            System.out.println("Price = " + f);

            con.close();
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
