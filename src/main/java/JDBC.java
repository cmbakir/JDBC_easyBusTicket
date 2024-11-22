
import java.sql.*;

public class JDBC {

	/*

	NOT! : Eger JDBC testi yapmaniz isteniyorsa, yapmaniz gereken ilk is
			Database yoneticisi ile ieltisime gecerek ilgili database giris bilgilerini
			(Access Information) almaliyiz.


			DB_DATABASE=u201212290_qaeasy
			DB_USERNAME=u201212290_qaeasyuser
			DB_PASSWORD=]zR9Z&N4|fwt
			HOSTNAME: 195.35.59.63



	URL: jdbc:mysql://195.35.59.63/u201212290_qaeasy
	USERNAME: u201212290_qaeasyuser
	PASSWORD: ]zR9Z&N4|fwt

			*/

    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        // 1. ADIM : JDBC Sürücüsünü Yükleme

        Class.forName("com.mysql.cj.jdbc.Driver");

        // 2. ADIM : Veritabanı Bağlantısı Kurma

        String URL = "jdbc:mysql://195.35.59.63/u201212290_qaeasy";
        String USERNAME = "u201212290_qaeasyuser";
        String PASSWORD = "]zR9Z&N4|fwt";


        Connection connection = DriverManager.getConnection(URL,USERNAME,PASSWORD);


        // 3. ADIM : SQL Sorguları Oluşturma

        String QUERY = "SELECT * FROM users;";

        // 4. ADIM : SQL Sorguları Çalıştırma

        Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);

        ResultSet resultSet = statement.executeQuery(QUERY);

        // 5. ADIM : Sonuçları İşleme


        // Sonuclar suan da resultSet icerisinde
        // Eger Result Set icerisinde islem yapmak istiyorsaniz ITERATOR kullanmalisiniz.

        resultSet.next();
        System.out.println(resultSet.getString("firstname"));
        // Sonuc kumesinde "raName" olmali.


        resultSet.next();
        System.out.println(resultSet.getString("firstname"));
        // Sonuc kumesinde "raName","Elif" olmali.

        System.out.println(resultSet.getString("lastname"));

        System.out.println(resultSet.getInt(10));

        resultSet.absolute(15);
        System.out.println(resultSet.getString(2));
        System.out.println(resultSet.getInt(10));


        resultSet.previous();
        System.out.println(resultSet.getString("firstname"));

        resultSet.first();
        System.out.println(resultSet.getString(3));


    }

}
