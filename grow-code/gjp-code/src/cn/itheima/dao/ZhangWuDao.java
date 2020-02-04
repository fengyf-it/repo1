package cn.itheima.dao;

import cn.itheima.domain.ZhangWu;
import cn.itheima.tools.JDBCUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.List;

/*
    实现对数据表的增删改查操作
    dbutils的工具类完成,类成员创建QueryRunner对象,指定数据源
 */
public class ZhangWuDao {
    private QueryRunner qr = new QueryRunner(JDBCUtils.getDataSource());

    public List<ZhangWu> selectAll() {
        String sql = "select * from gjp_zhangwu";
        try {
            List<ZhangWu> list = qr.query(sql, new BeanListHandler<ZhangWu>(ZhangWu.class));
            return list;
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("数据库读取失败");
        }
    }

    public List<ZhangWu> select(String startDate, String endDate){
        String sql = "SELECT * FROM gjp_zhangwu WHERE createtime BETWEEN ? AND ?";
        Object[] params = {startDate,endDate};
        try {
            List<ZhangWu> list = qr.query(sql,new BeanListHandler<ZhangWu>(ZhangWu.class),params);
            return list;
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("数据库读取失败");
        }
    }

    public String addZhangWu(String flname,double money,String zhanghu,String createDate,String des) {
        String sql = "INSERT INTO gjp_zhangwu(flname,money,zhanghu,createtime,description) VALUE(?,?,?,?,?)";
        Object[] params = {flname,money,zhanghu,createDate,des};
        try {
            qr.update(sql,params);
            return "添加成功";
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("操作失败");
        }
    }
}
