import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class P3_DDL {
    /*
                 A) CREATE TABLE, DROP TABLE, ALTER TABLE gibi DDL ifadeleri icin sonuc kümesi (ResultSet)
                    dondurmeyen metotlar kullanilmalidir. Bunun icin JDBC’de 2 alternatif bulunmaktadir.
                       1) execute() metodu
                       2) excuteUpdate() metodu.

                 B) 	- execute() metodu her tur SQL ifadesiyle kullanibilen genel bir komuttur.
                      - execute(), Boolean bir deger dondurur.
                      - DDL islemlerin false dondururken, DML islemlerinde true deger dondurur.(ResultSet olusturur)
                      - Ozellikle hangi tip SQL ifadesinin kullanilmasinin gerektiginin belli olmadigi
                         durumlarda tercih edilmektedir.

                 C) 	- executeUpdate() metodu ise INSERT, Update gibi DML islemlerinde yaygin kullanilir.
                     -  bu islemlerde islemden etkilenen satir sayisini dondurur.
                      - Ayrıca, DDL islemlerinde de kullanilabilir ve bu islemlerde 0 dondurur.

                  execute() her turlu SQL kjomutuyla kullanilir .......  DDL ---> False    DML----> True
                  executeUpdate()  DDL ----> 0           DML ----->etkilenen satir sayisini verir
             */
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch60_61?serverTimezone=UTC", "root", "elif.12345");  //database baglantisi icin

        Statement st = con.createStatement();  //query calistirmak icin

        // SORU: markalar adında bir tablo oluşturunuz. marka_id int, marka_isim VARCHAR(15), calisan_sayisi int

        String createQuery = "create table markalar (marka_id int, marka_isim VARCHAR(15), calisan_sayisi int)";

        //1.yontem : execute () methodu ile

        boolean s1 = st.execute(createQuery);
        System.out.println("markalar tablosu olusturuldu -> " +s1 ); //False
    //    // execute(), Boolean bir deger dondurur.
    //    //- DDL islemlerin false dondururken(ResultSet olusturmadigi için),  DML islemlerinde true deger dondurur.(ResultSet olusturur)

    //    boolean s2 = st.execute(createQuery);
    //    System.out.println("markalar tablosu olusturuldu -> " +s2 ); //artik Database ded tablo var, hata verir
//
        //2.yontem : executeUpdate() methodu ile

    //    int s3 = st.executeUpdate(createQuery); //DDL islemleri icin 0 degerini dondurur
    //    System.out.println("markalar tablosu olusturuldu -> " +s3 ); //);
    //    //executeUpdate(),   DDL islemlerinde de kullanilabilir ve bu islemlerde 0 dondurur.



        // SORU: markalar tablosunu siliniz

    //    String dropQuery = "DROP TABLE markalar";
    //    st.execute(dropQuery);
    //    System.out.println("markalar tablosu silindi..");

        // SORU : markalar tablosuna yeni bir sutun {sube_sayisi int} ekleyiniz

    //    String alterQuery = "ALTER TABLE markalar ADD sube_sayisi int"; //default olarak sona ekler
    //    st.executeUpdate(alterQuery);


    //    // SORU : markalar tablosuna yeni bir sutun {sube_sayisi int} ekleyiniz, ancak bu sutunun yeri marka_id den sonra olsub
//
    //    String alterQuery2 = "ALTER TABLE markalar ADD sube_sayisi int AFTER marka_id";
    //    st.executeUpdate(alterQuery2);
//

        // SORU : markalar tablosunun adini  brands olarak degistiriniz

    //    String alterQuery3 = "ALTER TABLE markalar RENAME TO brands";
    //    System.out.println("tablo ismi brands olarak degistirildi.. " + st.execute(alterQuery3));
//


        // SORU : markalar tablosunda marka_isim sutununu isim olarak degistiriniz
   //    st.execute("alter table markalar rename column marka_isim to isim");
   //    System.out.println("markalar tablosundaki marka_isim sutunun ismi->  isim olarak degistirildi");




        //  SORU : markalar tablosunda marka_isim sutununun data type ini char(20) olarak degistiriniz
        st.execute("alter table markalar modify marka_isim char(20)");
        System.out.println("marka isim data type char(20) oldu");

        con.close();
        st.close();


        /*
        CHAR - Sabit uzunlukta karakter saklar. Yani CHAR(50) ifadesi MAX 50 karakter saklayabilir.
         Ancak içerisine atanan veriyi bakılmaksızın bellekte sabit olarak hep 50 karakterlik yer kaplar.
        VARCHAR-  Bellekte değişken uzunlukta yer kaplar.
         Varchar(50) ifadesi MAX 50 karakter saklayabilir ancak  30 karakterlik bir atama yapıldığında bellekte 30 karakterlik yer kaplar.

        SORU: varchar ile varchar2 arasındaki farklar nelerdir ?
        CEVAP: varchar2, varchar ’ın güncellenmiş versiyonudur.
        Varchar’a göre 2 kat daha fazla (4000) karakter saklayabilir.
         */
    }
}
