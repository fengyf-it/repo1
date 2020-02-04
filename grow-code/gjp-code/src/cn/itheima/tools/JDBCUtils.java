package cn.itheima.tools;

import org.apache.commons.dbcp.BasicDataSource;

import javax.sql.DataSource;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/*
    数据库连接池的工具类
 */
public class JDBCUtils {
    //私有化构造方法
    private JDBCUtils(){}

    private static String driverName;
    private static String url;
    private static String username;
    private static String password;

    private static BasicDataSource dataSource = new BasicDataSource();

    static{
        readProperty();
        dataSource.setDriverClassName(driverName);
        dataSource.setUrl(url);
        dataSource.setUsername(username);
        dataSource.setPassword(password);
        dataSource.setInitialSize(10);
        dataSource.setMaxActive(8);
        dataSource.setMaxIdle(5);
        dataSource.setMinIdle(1);
    }

    private static void readProperty(){
        InputStream in = JDBCUtils.class.getClassLoader().getResourceAsStream("pro.properties");
        Properties pro = new Properties();
        try {
            pro.load(in);
            driverName = pro.getProperty("driveClassName");
            url = pro.getProperty("url");
            username= pro.getProperty("username");
            password = pro.getProperty("password");
        } catch (IOException e) {
            throw new RuntimeException("读取配置文件失败");
        }
    }

    public static DataSource getDataSource(){
        return dataSource;
    }

}
