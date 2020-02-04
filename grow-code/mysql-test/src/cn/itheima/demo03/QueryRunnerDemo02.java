package cn.itheima.demo03;

/*
    处理结果集的八种方式
 */
import cn.itheima.JDBCUtils;
import cn.itheima.demo02.Sort;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.*;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class QueryRunnerDemo02 {
    private static Connection con = JDBCUtils.getConnection();

    public static void main(String[] args) throws Exception {
//        arrayHandler();
//        arrayListHandler();
//        beanHandler();
//        beanListHandler();
//        columnListHandler();
//        scalarHandler();
//        mapHandler();
        mapListHandler();
    }


    /*
        处理结果集的第一种方式:ArrayHandler
        将结果集的第一行数据封装到ArrayHandler中
     */
    public static void arrayHandler() throws SQLException {
        QueryRunner qr = new QueryRunner();
        String sql = "select * from sort";
        Object[] query = qr.query(con, sql, new ArrayHandler());
        for (Object o : query) {
            System.out.println(o);
        }
        con.close();
    }

    /*
       处理结果集的第二种方式:ArrayListHandler
       将结果集的每一行数据封装到ArrayListHandler中
    */
    public static void arrayListHandler() throws Exception {
        QueryRunner qr = new QueryRunner();
        String sql = "select * from sort";
        List<Object[]> query = qr.query(con, sql, new ArrayListHandler());
        for (Object[] objects : query) {
            for (Object object : objects) {
                System.out.print(object + "  ");
            }
            System.out.println();
        }
    }

    /*
        结果集处理的第三种方式:BeanHandler
        将结果集的第一行数据封装成JavaBean对象
        注意:将封装数据到JavaBean对象,Sort类必须有空参构造
     */
    public static void beanHandler() throws SQLException {
        QueryRunner qr = new QueryRunner();
        String sql = "select * from sort";
        Sort query = qr.query(con, sql, new BeanHandler<Sort>(Sort.class));
        System.out.println(query);
        con.close();
    }

    /*
        结果集处理方式的第四种方式:BeanListHandler
        将数据结果集的每一行数据,封装成JavaBean对象
        多个JavaBean对象封装到list集合中
     */
    public static void beanListHandler() throws SQLException {
        QueryRunner qr = new QueryRunner();
        String sql = "select * from sort";
        List<Sort> query = qr.query(con, sql, new BeanListHandler<Sort>(Sort.class));
        for (Sort sort : query) {
            System.out.println(sort);
        }

    }

    /*
        结果集处理的第五种方式:ColumnListHandler
        结果集指定列的数据,存储到List集合中
        List<Object> 每列的数据类型不相同,所以要用Object
     */
    public static void columnListHandler() throws SQLException {
        QueryRunner qr = new QueryRunner();
        String sql = "select * from sort";
        List<Object> sname = qr.query(con, sql, new ColumnListHandler("sname"));
        for (Object o : sname) {
            System.out.println(o);
        }
        con.close();
    }

    /*
        结果集处理的第六种方式
        适用于查询后,只有一个结果得情况,适用于聚合函数
     */
    public static void scalarHandler() throws SQLException {
        QueryRunner qr = new QueryRunner();
        String sql = "select count(*) from sort";
        Object count = qr.query(con, sql, new ScalarHandler());
        System.out.println(count);
        con.close();
    }

    /*
        结果集处理的第七种方式:MapHandler
        将结果集的第一行数据封装到Map集合中
        Map<键,值> 键:列名 值:这列的数据
     */
    public static void mapHandler() throws SQLException {
        QueryRunner qr = new QueryRunner();
        String sql = "select * from sort";
        Map<String, Object> map = qr.query(con, sql, new MapHandler());
        /*Set<Map.Entry<String, Object>> entries = map.entrySet();
        Iterator<Map.Entry<String, Object>> iterator = entries.iterator();
        while(iterator.hasNext()){
            Map.Entry<String, Object> entry = iterator.next();
            String key = entry.getKey();
            Object value = entry.getValue();
            System.out.println(key+"  "+value);
        }*/
        for (String key : map.keySet()) {
            System.out.println(key + "  " + map.get(key));
        }
        con.close();
    }

    /*
        结果集处理的第八种方式:MapHandler
        将结果集的每一行数据封装到Map集合中
        Map<键,值> 键:列名 值:这列的数据
        注意:Map集合内容中的数据过多,会存储到list集合中
     */
    public static void mapListHandler() throws SQLException {
        QueryRunner qr = new QueryRunner();
        String sql = "select * from sort";
        List<Map<String, Object>> list = qr.query(con, sql, new MapListHandler());
        Iterator<Map<String, Object>> iterator = list.iterator();
        for (Map<String, Object> map : list) {
            for (String key : map.keySet()) {
                Object value = map.get(key);
                System.out.print(key + "  " + value);
            }
            System.out.println();
        }
        con.close();
    }

}
