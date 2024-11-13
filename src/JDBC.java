import java.sql.*;

public class JDBC {

    public static void main(String[] args) throws Exception {

        String sql = "Select first_name from users where id= 1";
        String url ="jdbc:mysql://localhost:3306/user_db3";
        String username = "root";
        String password = "Abhiram@123";

        Connection con = DriverManager.getConnection(url, username, password);
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(sql);
        rs.next();
        String email_id = rs.getString(1);
        System.out.println(email_id);
        con.close();
    }
}
