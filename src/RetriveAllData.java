import java.sql.*;

public class RetriveAllData {
    public static void main(String[] args) throws Exception {
        String url = "jdbc:postgresql://localhost:5432/Demo";
        String uname = "postgres";
        String pass = "0000";
        String query = "select * from \"Players\"";

        //Class.forName("org.postresql.Driver");
        Connection con = DriverManager.getConnection(url , uname , pass);
        System.out.println("Connection Established");
        Statement st = con.createStatement();
        ResultSet res = st.executeQuery(query);
        while(res.next()){  // rs.next checks for next row and if available it will print next row
            System.out.print(res.getInt(1) + " : " + res.getString(2) + " : " + res.getInt(3));
            System.out.println();
        }
        con.close();
        System.out.println("Connection Closed");
    }
}
