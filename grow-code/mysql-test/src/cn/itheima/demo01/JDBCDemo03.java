package cn.itheima.demo01;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

public class JDBCDemo03 {
    public static void main(String[] args) throws Exception{
        //创建读取流
        FileInputStream fis = new FileInputStream("E:\\IdeaProjects\\grow-code\\mysql-test\\config.properties");
        //创建Properties,读取配置文件
        Properties pro = new Properties();
        pro.load(fis);
        //通过键获取值
        String className = pro.getProperty("className");
        //通过获取的className,使用反射进行注册驱动
        Class.forName(className);
        //注册成功后,使用DriverManager获取连接
        String url = pro.getProperty("url");
        String usernama = pro.getProperty("username");
        String password = pro.getProperty("password");
        Connection con = DriverManager.getConnection(url, usernama, password);
//        System.out.println(con);
        //连接成功获取语句执行平台
        Statement stat = con.createStatement();
        //执行SQL语句
        String sql = "select * from users where uname='a' and upassword='12' or 1=1";
        ResultSet res = stat.executeQuery(sql);
        while(res.next()){
            System.out.println(res.getInt("uid")+"   "+res.getString("uname")+"   "+res.getString("upassword"));
        }
        res.close();
        stat.close();
        con.close();
    }
}
