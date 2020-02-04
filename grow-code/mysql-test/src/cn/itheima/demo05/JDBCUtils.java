package cn.itheima.demo05;

import org.apache.commons.dbcp.BasicDataSource;

import javax.sql.DataSource;
import java.util.ResourceBundle;

public class JDBCUtils {
    private static String driverName;
    private static String url;
    private static String username;
    private static String password;

    private static void readConfig() {
        ResourceBundle bundle = ResourceBundle.getBundle("db");
        driverName = bundle.getString("className");
        url = bundle.getString("url");
        username = bundle.getString("username");
        password = bundle.getString("password");
    }

    private static BasicDataSource dataSource = new BasicDataSource();

    public static DataSource getDataSource() {
        return dataSource;
    }

    static {
        readConfig();
        dataSource.setDriverClassName(driverName);
        dataSource.setUrl(url);
        dataSource.setUsername(username);
        dataSource.setPassword(password);
    }
}
