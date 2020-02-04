package cn.itheima.demo02;

import cn.itheima.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/*
    将数据表中的sort内容添加到Sort类中,并用集合封装ArrayList<Sort>
 */
public class JDBCDemo01 {
    public static void main(String[] args) throws Exception{
        ArrayList<Sort> list = new ArrayList<>();
        Connection con = JDBCUtils.getConnection();
        String sql = "select * from sort";
        PreparedStatement pst = con.prepareStatement(sql);
        ResultSet rst = pst.executeQuery();
        while(rst.next()){
            int sid = rst.getInt("sid");
            String sname = rst.getString("sname");
            double sprice = rst.getDouble("sprice");
            String sdesc = rst.getString("sdesc");
            Sort sort = new Sort(sid,sname,sprice,sdesc);
            list.add(sort);
        }
        for (Sort sort : list) {
            System.out.println(sort);
        }
        JDBCUtils.close(con,pst,rst);
    }
}
