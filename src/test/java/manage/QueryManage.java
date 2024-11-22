package manage;

public class QueryManage {

    private String QUERY2 = "SELECT firstname, lastname, email FROM users WHERE country_code = 'TR';";
    private String QUERY03 = "SELECT firstname, lastname FROM users WHERE email = 'muratdonmezdemir.user@easybus.com';";

    private String InsertQuery = "INSERT INTO users (id, firstname, lastname,username,email, password)VALUES (?,?,?,?,?,?);";
    private String InsertDogrulama= "SELECT firstname FROM users WHERE id = ?;";
    private String UpdateQuery = "UPDATE users SET email = ? WHERE id = ?;";
    private String UpdateDogrulama = "SELECT email FROM users WHERE id = ?;";
    private String DeleteQuery = "DELETE FROM users WHERE email = ?;";
    private String DeleteDogrulama = "SELECT * FROM users WHERE email = ?;";




    // GETTER's


    public String getQUERY2() {
        return QUERY2;
    }

    public String getQUERY03() {
        return QUERY03;
    }

    public String getInsertQuery() {
        return InsertQuery;
    }

    public String getInsertDogrulama() {
        return InsertDogrulama;
    }

    public String getUpdateQuery() {
        return UpdateQuery;
    }

    public String getUpdateDogrulama() {
        return UpdateDogrulama;
    }

    public String getDeleteQuery() {
        return DeleteQuery;
    }

    public String getDeleteDogrulama() {
        return DeleteDogrulama;
    }
}