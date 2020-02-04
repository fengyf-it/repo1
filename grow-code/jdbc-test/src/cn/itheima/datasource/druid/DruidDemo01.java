package cn.itheima.datasource.druid;

import cn.itheima.datasource.utils.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DruidDemo01 {
    public static void main(String[] args) {
        Connection conn = JDBCUtils.getConnection();
        String sql = "insert into userss values(null,?,?)";
        PreparedStatement pst=null;
        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1,"jack");
            pst.setString(2,"456");
            int row = pst.executeUpdate();
            System.out.println(row);
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JDBCUtils.close(conn,pst);
        }

    }
}
