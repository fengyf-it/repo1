package cn.itheima.c3p0;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class C3P0Utils {
    private static ComboPooledDataSource dataSource = new ComboPooledDataSource("itheima");

    private static ComboPooledDataSource getDataSource(){
        return  dataSource;
    }

    public static Connection getConnection(){
        try {
            return dataSource.getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("获取连接失败");
        }
    }
}
