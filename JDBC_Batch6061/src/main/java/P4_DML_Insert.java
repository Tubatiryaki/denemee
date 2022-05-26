import java.sql.*;

public class P4_DML_Insert {
    //MySql de day6 da..
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");

        String url = "jdbc:mysql://localhost:3306/batch60_61?serverTimezone=UTC";
        Connection con = DriverManager.getConnection(url, "root", "elif.12345");  //database baglantisi icin

        Statement st = con.createStatement();  //query calistirmak icin

        //SORU: Calisanlar tablosuna yeni bir kayit ((10005, 'Muhammet Yenice' , 15000)  ekleyelim ve eklenen kaydi teyit icin sorgulayalim.

        String insertQuery = "INSERT INTO calisanlar VALUES (10005, 'Muhammet Yenice' , 15000)";

        int s1 = st.executeUpdate(insertQuery);
        System.out.println(s1 + " satir eklendi");  //sql de  select * from calisanlar;  kodunu calistir gorunecektir

        //İntelijde de gorelim..
        ResultSet rs = st.executeQuery("SELECT * FROM calisanlar");

        while (rs.next()) {
            System.out.printf("%-6d %-15.15s %-8s\n" ,rs.getInt(1),
                    rs.getString(2),rs.getInt(3));
        }

        //SORU: Calisanlar tablosuna birden fazla yeni kayıt ekleyelim.

        // 1.YONTEM
        // Ayri ayri sorgular ile veritabanina tekrar tekrar ulasmak islemlerin yavas yapilmasina yol acar.
        // 10000 tane veri kaydi yapildigi dusunuldugunde  bu kotu bir yaklasimdir.

        String [] queries = {"INSERT INTO calisanlar VALUES (10006, 'Ahmet Yanar' , 20000)",
                            "INSERT INTO calisanlar VALUES (10007, 'Mehmet Solmaz' , 18000)"};

        int data = 0;
        for (String each : queries) {
           data+= st.executeUpdate(each);
        }
        System.out.println(data + " data eklendi..");   //sql de  select * from calisanlar;  kodunu calistir gorunecektir

        // 2.YONTEM (addBath ve excuteBatch() metotlari ile)
        // ----------------------------------------------------
        // addBatch metodu ile SQL ifadeleri gruplandirilabilir ve
        // exucuteBatch()  metodu ile veritabanina bir kere gonderilebilir.
        // ***!!!!**** excuteBatch() metodu bir int [] dizi dondurur.
        // Bu dizi her bir ifade sonucunda etkilenen satir sayisini gosterir.

        String [] queries2 = {"INSERT INTO calisanlar VALUES (10008, 'Ahmet Yanar' , 20000)",
                "INSERT INTO calisanlar VALUES (10009, 'Mehmet Solmaz' , 18000)"};
        for (String each : queries2) {
             st.addBatch(each);
        }

        int [] satir = st.executeBatch(); ////satir bir array eleman sayisi (satir sayisi): length
        System.out.println( satir.length  + " satir eklendi");

        // 3. YONTEM
        //-----------------------------------------------------
        // batch metoduyla birlikte PreparedStatement kullanmak en efektif yontemdir.
        // SQL de guvenligi icin basvurulan bir yontemdir. Unutulmamalidir...
        // bir sonraki ornekte bunu gerceklestirecegiz.

        con.close();
        st.close();
        rs.close();
    }
}