import java.sql.*;
public class DemoJdbc {
    public static void main(String[] args) throws Exception{
        /*
            Steps to connect Java with Database through JDBC
            1. import package
            2. load and register
            3. create connection
            4. create statement
            5. execute statement
            6. process the results
            7. close
         */

        String url = "jdbc:postgresql://localhost:5432/Demo"; // for mqysql it will be jdbc:mysql
        String uname = "postgres";
        String pass = "0000";
        String query = "SELECT pname FROM \"Players\" WHERE pid = 1";
        Class.forName("org.postgresql.Driver");
        Connection con = DriverManager.getConnection(url , uname , pass);
        System.out.println("Connection Established");
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(query);
        System.out.println(rs.next());

        String name = rs.getString("pname");
        System.out.println("Name of the Player is: " + name);
        con.close();
        System.out.println("Connection Closed");
    }
}
