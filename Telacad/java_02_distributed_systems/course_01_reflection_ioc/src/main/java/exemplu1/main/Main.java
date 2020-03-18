package exemplu1.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost/java_2";
        String user = "root";
        String password = "robert406661";
        try {
            Connection con = DriverManager.getConnection(url, user, password);

            String sql = "INSERT INTO angajat VALUES (null, ?, ?)";

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, "gigel");
            ps.setInt(2, 25);
            ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
