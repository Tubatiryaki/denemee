import java.sql.*;

public class P2_ReadData_Different {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //MySql de day5 de..

        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch60_61?serverTimezone=UTC", "root", "elif.12345");  //database baglantisi icin

        Statement st = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);  //result set scroll duyarsiz, sadece okuma

        String query = "SELECT * FROM personel";
        ResultSet resultSet = st.executeQuery(query);
        System.out.println(resultSet.getRow()); //0
        // resultSet.first() bizi ilk kayida goturur, eger gecerli bir kayda gitmeden
        // data ile ilgili islem yapmaya calisirsak
        //   "The result set has no current row."      hatasi aliriz

        //ilk satirdaki ilk objeyi yazdiralim
        resultSet.first();
        Object ilkSAtirdakiObje = resultSet.getObject(1);
        System.out.println(ilkSAtirdakiObje.toString()); //123456789

        //ikinci satirdaki ilk objeyi yazdiralim

        resultSet.next();
        Object ikinciSatirdakiObje = resultSet.getObject(1);
        System.out.println(ikinciSatirdakiObje.toString()); //234567890

        // ilk sutundaki 5.degeri yazdiralim
        resultSet.next();
        resultSet.absolute(5);
        Object besinciDeger = resultSet.getObject(1);
        System.out.println(besinciDeger.toString());

        // bu satirdan sonra tum listeyi yazdirmak icin bir dongu kullanirsam
        // resultSet 5.satirda oldugu icin
        // bize 5.satirdan sonrasini yazdirir
        // Eger ilk satirdan itibaren yazdirmak istiyorsak once ilk satira gitmemiz gerekir

        System.out.println("=======================");
        resultSet.absolute(0);
        // 0.satira gitmemizin sebebi while sorgusu icerisinde bulunan resultSet.next() in bizi
        // birinci kayda goturmesi icindir. Eger 1.satira gidecek olsak while icindeki kod yuzunden yazdirmaya
        // 2.satirdan baslar, tum listeyi alamayiz

        // Tum listeyi yazdirmak istersek

        while (resultSet.next()) { // while'in icine yazdigimiz kod boolean olarak true/false dondurur
             Object idler = resultSet.getObject(1); //bu kolondaki, 1.kolondaki tum objeleri verir...
            System.out.println(idler.toString());
        }

        System.out.println("=======================");
        resultSet.absolute(0);
        while (resultSet.next()) { // while'in icine yazdigimiz kod boolean olarak true/false dondurur
            Object isimler = resultSet.getObject("isim"); //isim kolondaki tum objeleri verir...
            System.out.println(isimler.toString()); //toString olmasa da yazar..
        }


        System.out.println("=======================");
        resultSet.absolute(0);
        while (resultSet.next()) { // while'in icine yazdigimiz kod boolean olarak true/false dondurur
            Object sirketler = resultSet.getObject("sirket");
            System.out.println(sirketler);
        }


        System.out.println("=======================");
        resultSet.absolute(0);
        while (resultSet.next()) {
            Object sehirler = resultSet.getObject("sehir");
            System.out.println(sehirler);
        }

        System.out.println("=======================");
        resultSet.absolute(0);
        while (resultSet.next()) {
            Object maaslar = resultSet.getObject(4);
            System.out.println(maaslar);
        }

        System.out.printf("%-6s %-15.15s %-8s %-8s\n","idler", "isimler","sirketler","sehirler", "maaslar");

        con.close();
        st.close();


    }
}

