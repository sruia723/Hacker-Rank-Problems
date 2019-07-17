import java.sql.*;


public class JdbcStatementsDemo {
    public static void main(String[] args) {


        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java08","root","root");
            System.out.println("Connected");

            Statement st1 = con.createStatement(); //
            //PreparedStatement pst = con.prepareStatement("sql statement");// This can also be used.

            /*
            st1.execute("create table books (bno int(3), bname varchar(10), bprice float(5))");
            // Gives below exception if table already exists.
            //java.sql.SQLSyntaxErrorException: Table 'books' already exists
            System.out.println("Table created");
            */

            // Insert, update and delete statements should be written in executeUpdate() --> return type int.;
            /*
            st1.executeUpdate("insert into books values(111,'Java',1000)");
            st1.executeUpdate("insert into books values(222,'Html',500)");
            st1.executeUpdate("insert into books values(333,'Css',300)");
            System.out.println("Inserted");
            */

            // To update the records
            /*
            int n = st1.executeUpdate("update books set bprice=800");
            System.out.println(n + " records updated.");
            */

            //To delete the records
            /*
            int n = st1.executeUpdate("delete from books");
            System.out.println(n + " records deleted");
            */

            // Using select statement, can be used to traverse.
            ResultSet rs = st1.executeQuery("select * from books");
            while (rs.next())
            {
                System.out.print(rs.getInt("bno") + " ");
                System.out.print(rs.getString("bname")+" ");
                System.out.println(rs.getFloat(3));
            }


            st1.close();
            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }


    }
}
