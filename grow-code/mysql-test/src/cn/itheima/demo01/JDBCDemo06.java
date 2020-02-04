package cn.itheima.demo01;

import cn.itheima.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JDBCDemo06 {
    public static void main(String[] args) throws Exception {
        Connection connection = JDBCUtils.getConnection();

        String sql = "select * from users";
        PreparedStatement pst = connection.prepareStatement(sql);
        ResultSet res = pst.executeQuery();
        while(res.next()){
            System.out.println(res.getInt("uid")+"   "+res.getString("uname")+"   "+res.getString("upassword"));

        }
        JDBCUtils.close(connection,pst,res);

    }
}
