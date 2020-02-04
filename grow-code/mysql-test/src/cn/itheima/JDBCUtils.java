package cn.itheima;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.sql.*;
import java.util.Properties;

import static java.lang.System.in;

public class JDBCUtils {
    private JDBCUtils() {
    }

    /*public static Connection getConnectio() throws Exception{
        //创建读取流
//        FileInputStream fis = new FileInputStream("E:\\IdeaProjects\\grow-code\\mysql-test\\src\\config.properties");
        //创建Properties,读取配置文件
        InputStream in= JDBCUtils.class.getClassLoader().getResourceAsStream("config.properties");
        Properties pro = new Properties();
        pro.load(in);
        //通过键获取值
        String className = pro.getProperty("className");
        //通过获取的className,使用反射进行注册驱动
        Class.forName(className);
        //注册成功后,使用DriverManager获取连接
        String url = pro.getProperty("url");
        String usernama = pro.getProperty("username");
        String password = pro.getProperty("password");
        Connection con = DriverManager.getConnection(url, usernama, password);
        return con;
    }*/

    private static Connection con;
    private static String className;
    private static String url;
    private static String username;
    private static String password;

    static {
        try {
            readConfig();
            Class.forName(className);
            con = DriverManager.getConnection(url, username, password);
        } catch (Exception ex) {
            throw new RuntimeException(ex + "运行失败");
        }
    }

    private static void readConfig() throws Exception {
//        InputStream in = JDBCUtils.class.getClassLoader().getResourceAsStream("config.properties");
        ClassLoader classLoader = JDBCUtils.class.getClassLoader();
        URL resource = classLoader.getResource("config.properties");
        String path = resource.getPath();

        Properties pro = new Properties();
        pro.load(new FileReader(path));
//        pro.load(in);
        className = pro.getProperty("className");
        url = pro.getProperty("url");
        username = pro.getProperty("username");
        password = pro.getProperty("password");
    }

    public static Connection getConnection() {
        return con;
    }

    public static void close(Connection connection, PreparedStatement preparedStatement, ResultSet resultSet) throws SQLException {
        resultSet.close();
        preparedStatement.close();
        connection.close();
    }
}
