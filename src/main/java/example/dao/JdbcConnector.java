package example.dao;



import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;


public class JdbcConnector {

    public static Connection getConnection() {
        Connection con = null;
        String driver = "";
        String url = "";
        String id = "";
        String pw = "";

        Properties prop = new Properties();
        try {
            String path = JdbcConnector.class.getClassLoader().getResource("jdbc.properties").getPath();
            prop.load(new FileReader(path));

            driver = prop.getProperty("driver");
            url = prop.getProperty("url");
            id = prop.getProperty("user");
            pw = prop.getProperty("password");

            System.out.println(url);
            System.out.println(id);
            System.out.println(pw);
            Class.forName(driver);

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e1) {
            e1.printStackTrace();
        }

        try {
            con = DriverManager.getConnection(url, id, pw);
            System.out.println("잘되었음");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return con; // connection 객체 반환
    }

    public static void commit(Connection con) {
        try {
            con.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void rollback(Connection con) {
        try {
            con.rollback();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
