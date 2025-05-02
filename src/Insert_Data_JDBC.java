import java.sql.*;
public class Insert_Data_JDBC {
    public static void main(String[] args) throws Exception{
        String url = "jdbc:postgresql://localhost:5432/Demo";
        String uname = "postgres";
        String pass = "0000";
        String query = "insert into \"Players\" values (10 , 'Siraj' , 100)";

        Connection con = DriverManager.getConnection(url , uname , pass);
        System.out.println("Connection Established");
        Statement st = con.createStatement();
        boolean status = st.execute(query);
        System.out.println(status);
        con.close();
        System.out.println("Connection Closed");
    }
}
