import java.sql.*;
public class Delete_Data {
    public static void main(String[] args) throws Exception{
        String url = "jdbc:postgresql://localhost:5432/Demo";
        String uname = "postgres";
        String pass = "0000";
        String query = "delete from \"Players\" where pid = 6";

        Connection con = DriverManager.getConnection(url , uname , pass);
        System.out.println("Connection Established");
        Statement st = con.createStatement();
        boolean br = st.execute(query);
        System.out.println(br);
        con.close();
        System.out.println("Connection Closed");
    }
}
