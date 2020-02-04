package cn.itheima.demo01;

import com.mysql.jdbc.Driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/*
        1,注册驱动
            告知JVM使用的是哪一个数据库的驱动
        2,获得连接
            使用jdbc中的类,完成对MySQL数据库的连接
        3,获得语句执行平台
            通过连接对象获取对SQL语句的执行者对象
        4,执行sql语句
            使用执行者对象,向数据库执行SQL语句,并获取到执行后的结果
        5,处理结果
        6,释放资源
 */
public class JDBCDemo {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        /*
            1,注册驱动,使用反射技术,将驱动类加入到内容
            使用java.sql.DriverMananger类静态方法.registerDriver(new Driver());
            Driver是一个接口,参数传递,MySQL驱动程序中的实现类
            DriverMananger.registerDriver(new Driver())使用这种方式,源码当中可以看出,相当于注册了两次驱动
        */
        Class.forName("com.mysql.jdbc.Driver");
        /*
            2,获得数据库连接,DriverManager类中静态方法
            static Connection getConnection(String url,String user,String password)
            返回值为Connection接口的实现类,在mysql驱动程序
            url : 数据库地址  jdbc:mysql://连接主机的IP:端口号/数据库名字
         */
        String url = "jdbc:mysql://localhost:3306/mybase";
        String username = "root";
        String password = "admin";
        Connection connection = DriverManager.getConnection(url, username, password);
        //有打印结果则注册驱动成功
//        System.out.println(connection);
        /*
            3,获得语句执行平台,通过数据库连接对象,获取到SQL语句的执行对象
            con对象调用方法 Statement creatStatement() 获取Statement对象,将SQL语句发送到数据库
            返回值是Statement接口的实现类对象,在mysql驱动程序
         */
        Statement statement = connection.createStatement();
        /*
            4,执行sql语句
            通过执行者对象调用方法执行SQL语句,获取结果
                int executeUpdate(String sql) 执行数据库中的SQL语句,insert delete update
                返回值int,是操作成功之后数据表执行的行数
                ResultSet executeQuery(String sql) 执行数据库的查询语句 select
                返回值为一个结果集,需要遍历.使用.next方法,与迭代器的hasNext类似
         */
        int i = statement.executeUpdate("insert into sort(sname,sprice,sdesc) value('汽车用品',500000,'疯狂涨价')");
        System.out.println(i);
        statement.close();
        connection.close();
    }
}
