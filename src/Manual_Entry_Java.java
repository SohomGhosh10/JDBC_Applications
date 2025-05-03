import java.sql.*;

public class Manual_Entry_Java {
    public static void main(String[] args) throws Exception{
        String url = "jdbc:postgresql://localhost:5432/Demo";
        String uname = "postgres";
        String pass = "0000";
        String query = "insert into \"Players\" values(?,?,?)";
        // Manual Data Entry with user input
        int pid = 10;
        String pname = "Hardik";
        int score = 250;

        Connection con = DriverManager.getConnection(url , uname , pass);
        System.out.println("Connection Established");
        PreparedStatement st = con.prepareStatement(query);
        st.setInt(1 , pid);
        st.setString(2 , pname);
        st.setInt(3 , score);
        st.execute();
        con.close();
        System.out.println("Connection Closed");
    }
}
