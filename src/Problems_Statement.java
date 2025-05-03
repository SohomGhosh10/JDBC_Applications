import java.sql.*;

public class Problems_Statement {
    public static void main(String[] args) throws Exception{
        String url = "jdbc:postgresql://localhost:5432/Demo";
        String uname = "postgres";
        String pass = "0000";

        int pid = 6;
        String pname = "Siraj";
        int score = 100;
        String query = "insert into \"Players\" values(" + pid + ", '" + pname + "'," + score + ")";
        Connection con = DriverManager.getConnection(url , uname , pass);
        System.out.println("Connection Established");
        Statement st = con.createStatement();
        st.execute(query);
        con.close();
        System.out.println("Connection Closed");
    }
}
