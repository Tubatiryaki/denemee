import java.sql.*;

public class P1_ReadData {


    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        /*
    Soru :  JDBC  Nedir ?
      - Veritabanlarının automation yapmamıza yardımcı oluyor
      - Sorgularımı gonderıyorum, gelen sonuclarla, UI da ki gozuken sonucları karsılastırıyorum (UI : user interface)


    Soru :  JDBC yi nasıl kullanırsın ?
      - URL , username ve password vererek bir connection olusturur.
        Bu connection uzerinden statement olusturarak, sorgularimi calistiririm.
        Sonuclari ResultSet e atarak kullanirim.

    */  //MySql de day3 de..
        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch60_61?serverTimezone=UTC", "root", "elif.12345");  //database baglantisi icin

        Statement st = con.createStatement();  //query calistirmak icin


        //    // SORU1: Talebeler tablosundan tum kayıtları listeleyiniz.
        //    ResultSet kayitlar = st.executeQuery("select * from talebeler");
//
        //    while(kayitlar.next()) {
        //        System.out.printf("%-6d %-15.15s %-8s\n", kayitlar.getInt(1),kayitlar.getString(2),kayitlar.getString(3),kayitlar.getInt(4)) ;
        //    }                                                 id                       isim                    veli_isim         yazili_notu
//
        //    // SORU2: Talebeler tablosunda notları 90 uzeri olan kayitları listeleyiniz.
        //    ResultSet kayitlarBuyuk90 = st.executeQuery("select * from talebeler where yazili_notu>90");
//
        //    System.out.printf("%-16s %-16s \n", "id", "isim");
        //    while(kayitlarBuyuk90.next()) {
        //        System.out.printf("%-16s %-16s \n", kayitlarBuyuk90.getInt(1) ,kayitlarBuyuk90.getString(2));
        //    }


        // SORU3: Talebeler tablosunda id'si 124 olan öğrencilerin tüm bilgilerini listeleyiniz.

        //    ResultSet id124 = st.executeQuery("SELECT * FROM talebeler WHERE id = 124");
        //    System.out.printf("%-6s %-15.15s %-8s %-8s\n","id", "isim","veli_isim","yazili_notu");
        //    while(id124.next()) {
        //        System.out.printf("%-6s %-15.15s %-8s %-8s\n", id124.getObject(1),  id124.getObject(2), id124.getObject(3), id124.getObject(4));
        //        System.out.println( id124.getObject(1) +"\t\t"+ id124.getObject(2)+ "\t\t" + id124.getObject(3)+"\t\t" + id124.getObject(4));
        //    }


        // SORU4: Talebeler tablosunda notu 70 ile 90 arasindaki kisilerin isimlerini listeleyiniz.

    //    ResultSet not7090 = st.executeQuery("SELECT isim,yazili_notu FROM talebeler WHERE yazili_notu  BETWEEN '70' AND '90'");
    //    System.out.printf("%-16s %-16s \n", "isim", "not");
    //    while (not7090.next()) {
    //        System.out.printf("%-16s %-16s \n",  not7090.getObject(1) , not7090.getObject(2));
    //    }



        // SORU5: Talebeler tablosunda isminin 2. harfi e olan kisilerin veli_isimleri ile birlikte listeleyiniz.

    //   ResultSet isim2E_VeliISim = st.executeQuery("SELECT isim,veli_isim FROM talebeler  WHERE isim LIKE '_e%'");

    //   System.out.printf("%-16s %-16s \n", "isim", "veli_isim");
    //       while (isim2E_VeliISim.next()) {
    //         System.out.printf("%-16s %-16s \n",  isim2E_VeliISim.getObject(1) , isim2E_VeliISim.getObject(2));
    //      }

        con.close();
        st.close();


    }
}


