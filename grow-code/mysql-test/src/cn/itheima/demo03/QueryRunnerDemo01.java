package cn.itheima.demo03;

import cn.itheima.JDBCUtils;
import org.apache.commons.dbutils.QueryRunner;

import java.sql.Connection;
import java.sql.SQLException;

public class QueryRunnerDemo01 {
    public static Connection con = JDBCUtils.getConnection();

    public static void main(String[] args) throws SQLException {
//        insert();
        update();
    }

    /*
        使用QueryRunner添加一行数据
     */
    public static void insert() throws SQLException {
        QueryRunner qr = new QueryRunner();
        String sql = "insert into sort(sname,sprice,sdesc) values(?,?,?)";
        Object[] params = {"体育用品", 166.99, "强身健体"};
        int update = qr.update(con, sql, params);
        System.out.println(update);
        con.close();
    }
    /*
        使用QueryRunner对数据表中的数据进行修改
     */
    public static void update() throws SQLException {
        QueryRunner qr = new QueryRunner();
        String sql = "update sort set sname=?,sprice=?,sdesc=? where sid=?";
        Object[] params = {"生鲜",169.88,"顺丰快递,一切顺风",4};
        int update = qr.update(con, sql, params);
        System.out.println(update);
        con.close();
    }
    /*
        使用QueryRunner对数据
     */
}
