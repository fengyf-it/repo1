package cn.itheima.datasource.jdbctemplate;


import cn.itheima.datasource.domain.User;
import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class JDBCTemplateDemo01 {
    public static void main(String[] args) {
        JdbcTemplate template = new JdbcTemplate(new ComboPooledDataSource());

        //使用Template完成增操作
        String sql = "insert into userss values(null,?,?)";
        int row = template.update(sql, "lucky", "345");
        System.out.println(row);

        //封装成一个类
        String sql01 = "select * from userss where uid=?";
        User user = template.queryForObject(sql01, new BeanPropertyRowMapper<>(User.class), 1);
        System.out.println(user);
        //封装成类,存入list集合
        String sql02 = "select * from userss";
        List<User> list = template.query(sql02, new BeanPropertyRowMapper<User>(User.class));
        for (User user1 : list) {
            System.out.println(user1);
        }
    }
}
