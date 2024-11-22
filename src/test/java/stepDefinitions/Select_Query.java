package stepDefinitions;

import io.cucumber.java.en.Given;
import manage.QueryManage;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import static org.testng.Assert.assertEquals;

public class Select_Query {

    Connection connection;
    Statement statement;
    ResultSet resultSet;
    String QUERY;

    QueryManage queryManage = new QueryManage();

    @Given("Database baglantisi kurulur.")
    public void database_baglantisi_kurulur() throws SQLException {

        String URL = "jdbc:mysql://195.35.59.63/u201212290_qaeasy";
        String USERNAME = "u201212290_qaeasyuser";
        String PASSWORD = "]zR9Z&N4|fwt";

        connection = DriverManager.getConnection(URL,USERNAME,PASSWORD);

    }
    @Given("SQL sorgusu hazirlanir ve calistirilir.")
    public void sql_sorgusu_hazirlanir_ve_calistirilir() throws SQLException {

        QUERY = "SELECT firstname, email FROM users;";

        statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
        resultSet = statement.executeQuery(QUERY);



    }
    @Given("Sonuclar listelenir.")
    public void sonuclar_listelenir() throws SQLException {
        int count = 0;
        while(resultSet.next()){
            count++;

            System.out.println(count +". firstname : "+ resultSet.getString(1)+ "  */*   " + count + ".  email : " + resultSet.getString(2) );

        }


    }
    @Given("Database baglantisi kapatilir.")
    public void database_baglantisi_kapatilir() throws SQLException {
        resultSet.close();
        statement.close();
        connection.close();
    }

    // *************************************************************

    @Given("Kayitli kullanicilari listeleme sorgusu hazirlanir ve calistirilir.")
    public void kayitli_kullanicilari_listeleme_sorgusu_hazirlanir_ve_calistirilir() throws SQLException {

        // Türkiye’den (country_code = 'TR') kayıtlı olan kullanıcıları listelemek istiyorum.

        QUERY = queryManage.getQUERY2();
        statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);

        resultSet = statement.executeQuery(QUERY);


    }
    @Given("Kayitli kullanicilar listelenir.")
    public void kayitli_kullanicilar_listelenir() throws SQLException {


        int count = 0;
        while(resultSet.next()){
            count++;
            System.out.println(count + ". firstname:  " +resultSet.getString(1));
            System.out.println(count + ".lastname:  " +resultSet.getString(2));
            System.out.println(count + ".email:  " +resultSet.getString(3));
        }



    }

    // *************************************************************

    @Given("Email ile kullanici goruntuleme sorgusu hazirlanir ve calistirilir.")
    public void email_ile_kullanici_goruntuleme_sorgusu_hazirlanir_ve_calistirilir() throws SQLException {

        QUERY = queryManage.getQUERY03();
        statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
        resultSet = statement.executeQuery(QUERY);

    }
    @Given("Email ve kulalnici dogrulanir.")
    public void email_ve_kulalnici_dogrulanir() throws SQLException {


        String expFirstName= "murat";
        String expLastName= "donmezdemir";

        resultSet.next();
        assertEquals(expFirstName, resultSet.getString(1));
        assertEquals(expLastName, resultSet.getString(2));
	/*
		List<String> expectedResultList = new ArrayList<>();
			expectedResultList.add("murat");

			String actualData = resultSet.getString(1);

			assertEquals(expectedResultList.get(1),actualData);

	*/





    }



}