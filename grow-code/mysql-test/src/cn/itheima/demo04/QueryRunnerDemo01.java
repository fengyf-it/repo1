package cn.itheima.demo04;

import cn.itheima.JDBCUtils02;
import org.apache.commons.dbcp.BasicDataSource;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.ArrayListHandler;

import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.List;

/*
    通过连接池的工具类
 */
public class QueryRunnerDemo01 {
    public static void main(String[] args) throws SQLException {
//        insert();
        select();
    }

    private static QueryRunner qr = new QueryRunner(JDBCUtils02.getDataSource());

    public static void insert() throws SQLException {
        String sql = "INSERT INTO sort(sname,sprice,sdesc) VALUES(?,?,?)";
        Object[] params = {"科技产品", 3699.99, "宏基笔记本"};
        int update = qr.update(sql, params);
        System.out.println(update);

    }

    public static void select() throws SQLException {
        String sql = "select * from sort";
        List<Object[]> list = qr.query(sql, new ArrayListHandler());
        for (Object[] objects : list) {
            for (Object object : objects) {
                System.out.print(object+"   ");
            }
            System.out.println();
        }

    }
}
