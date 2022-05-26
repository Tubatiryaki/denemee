import java.sql.*;

public class Query01 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        //1. Driver yukle
        Class.forName("com.mysql.cj.jdbc.Driver");
        //forName methodu exception verir,hangi sql ile calisacaksak onun adresini tanimlariz,
        // adresler jdbc driver olarak google da arayip, bulabliriz..

        //Baglanti olustur
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/okul?serverTimezone=UTC", "root", "sifreniz");

        // localHost : bilgisayardaki local Postumuza 3306 postumuza baglanacaktir
        // (local deki ddatabase e baglanma url i))dir
        // okul yazan yer localdeki baglanti kuracagimiz database in adidir..


        //3) SQL komutlari icin bir Statement nesnesi olustur.
        Statement st =con.createStatement();   //mySQL ifadeleri olusturur

        //4) ResultSet -> executeQuery :Sorgu ifadesini calistirir, ResultSet de donen cevaplari atadigimiz yer, containerdir..
        //(Personel tablosundaki personel_id’si 7369 olan personelin adini sorgulayiniz)
        ResultSet veri = st.executeQuery("select * from ogrenciler");

        //5)Sonuclari isle
        System.out.printf("%-6s %-15.15s %-8s %-8s\n","Okul No", "Ogrenci Isim","Sinif","Cinsiyet");
        while(veri.next()) {
            System.out.println(veri.getInt(1)+"  "+veri.getString(2)+" " +veri.getString(3) + " " + veri.getInt(4));

            System.out.printf("%-6d %-15.15s %-8s %-8s\n", veri.getInt(1), veri.getString(2), veri.getString(3), veri.getString(4));
            // hata alinirsa mySql de commit; ekleyebiliriz.. boylelikle database i guncel tutariz..


        }

        //6) Olusturulan nesneleri bellekten kaldir.
        st.close();
        con.close();
        veri.close();

    }
}
