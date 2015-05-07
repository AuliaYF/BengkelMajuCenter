/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package auliayf.core;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author windows 7
 */
public class Database {

    private static Connection instance;
    private static final String USER = "root";
    private static final String PASS = "";
    private static final String DB = "BengkelMajuCenter";
    private static final String URL = "jdbc:mysql://localhost:3306/" + DB;

    public static Connection getInstance() throws ClassNotFoundException, SQLException {
        if (instance == null) {
            Class.forName("com.mysql.jdbc.Driver");
            instance = DriverManager.getConnection(URL, USER, PASS);
        }
        return instance;
    }

    public static void clearInstance() throws SQLException {
        if (instance != null) {
            instance.close();
            instance = null;
        }
    }

    public static interface Controller<T> {

        public List<T> getAllObjects();

        public T getObject(String query);

        public int insert(T object);
    }
}
