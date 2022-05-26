import java.sql.*;

public class deneme {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sys?serverTimezone=UTC", "root", "elif.12345");

        Statement st = con.createStatement();
        ResultSet veri = st.executeQuery("select * from ogrenciler where sinav_notu>80");

        while(veri.next()) {
            System.out.printf("%-6d %-15.15s %-8s\n", veri.getInt(1), veri.getString(2),veri.getInt(1)) ;
        }
    }
}
