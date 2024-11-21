
package stepDefinitions;

import io.cucumber.java.en.Given;

import java.sql.*;

public class Select_Query {

    Connection connection;
    Statement statement;
    ResultSet resultSet;
    String QUERY;

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

}
