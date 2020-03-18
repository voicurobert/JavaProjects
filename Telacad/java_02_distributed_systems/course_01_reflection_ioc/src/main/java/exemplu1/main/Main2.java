package exemplu1.main;

import java.sql.*;

public class Main2 {
    public static void main(String[] args) throws Exception{
        String url = "jdbc:mysql://localhost/java_2";
        String user = "root";
        String password = "robert406661";

        var con = DriverManager.getConnection(url, user, password);

        String sql = "SELECT * FROM angajat";

        var ps = con.prepareStatement(sql);

        var rs = ps.executeQuery();

        try (con; ps; rs) {
            while (rs.next()) {
                System.out.println(rs.getString("nume"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
