package cn.itheima.demo01;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

public class JDBCDemo02 {
    public static void main(String[] args) throws Exception{
        //通过读取配置文件来实现驱动的注册
        FileReader fileReader = new FileReader("E:\\IdeaProjects\\grow-code\\mysql-test\\src\\config.properties");
        Properties pro = new Properties();
        pro.load(fileReader);
        String className = pro.getProperty("className");
        Class.forName(className);
        //获取连接
        String url=pro.getProperty("url");
        String username = pro.getProperty("username");
        String password = pro.getProperty("password");
        Connection con = DriverManager.getConnection(url, username, password);
//        System.out.println(con);

        //通过连接对象获取对SQL语句的执行者对象
        Statement stat = con.createStatement();
        //执行sql语句
        //使用执行者对象,向数据库执行SQL语句,并获取到执行后的结果
        String sql = "select * from sort";
        ResultSet rs = stat.executeQuery(sql);
        //ResultSet 是一个返回集
        while(rs.next()){
            System.out.println(rs.getInt("sid")+rs.getString("sname")+rs.getDouble("sprice")+rs.getString("sdesc"));
        }

        rs.close();
        stat.close();
        con.close();
    }
}
