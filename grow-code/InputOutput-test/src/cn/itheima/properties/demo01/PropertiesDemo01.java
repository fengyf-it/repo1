package cn.itheima.properties.demo01;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo01 {
    public static void main(String[] args) throws IOException {
        Properties pro = new Properties();
        pro.setProperty("CLASSNAME","com.mysql.jdbc.Driver");
        pro.setProperty("USERNAME","zhangsan");
        pro.setProperty("PASSWORD","1234");
        FileWriter fw = new FileWriter("d:\\test\\pro.properties");
        pro.store(fw,"Mysql");
        fw.close();
    }
}
