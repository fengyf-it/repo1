package cn.itheima.c3p0;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MainMethod {
    public static void main(String[] args) {
        Connection con = null;
        PreparedStatement ps = null;
        try{
            con = C3P0Utils.getConnection();
            String sql = "INSERT INTO sort(sname,sprice,sdesc) VALUES(?,?,?)";
            ps = con.prepareStatement(sql);
            ps.setObject(1,"电子产品");
            ps.setObject(2,5999.99);
            ps.setObject(3,"外星人,豪华配置你值得拥有");
            int row = ps.executeUpdate();
            System.out.println(row);
        }catch (Exception ex){
            ex.printStackTrace();
            throw new RuntimeException("");
        }finally {
            try {
                ps.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
