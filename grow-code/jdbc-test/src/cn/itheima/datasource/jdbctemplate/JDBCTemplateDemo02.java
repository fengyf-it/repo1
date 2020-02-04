package cn.itheima.datasource.jdbctemplate;

import cn.itheima.datasource.utils.JDBCUtils;
import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.junit.Test;
import org.springframework.jdbc.core.JdbcTemplate;

/*
    company03库的emp表进行操作
    * 需求：
        1. 修改1号数据的 salary 为 10000
        2. 添加一条记录
        3. 删除刚才添加的记录
        4. 查询id为1的记录，将其封装为Map集合
        5. 查询所有记录，将其封装为List
        6. 查询所有记录，将其封装为Emp对象的List集合
        7. 查询总记录数
 */
public class JDBCTemplateDemo02 {
    /*public static void main(String[] args) {
        JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDataSource());
        //修改1号数据的 salary 为 10000
        String sql01 = "update emp set salary = ? where id = ?";
        //添加一条记录
        String sql02 = "insert into emp values(null,?,?,?,?,?,?,?)";
        int row = template.update(sql01, 10000, 1001);
        System.out.println(row);
    }*/

    @Test
    public void test01(){
        JdbcTemplate template = new JdbcTemplate(new ComboPooledDataSource());
        //修改1号数据的 salary 为 10000
        String sql01 = "update emp set salary = ? where id = ?";
        int row = template.update(sql01, 8000, 1001);
        System.out.println(row);
    }
}
