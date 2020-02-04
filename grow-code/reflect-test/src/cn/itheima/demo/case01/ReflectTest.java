package cn.itheima.demo.case01;

import java.io.FileReader;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Properties;

public class ReflectTest {
    public static void main(String[] args) throws Exception{
        FileReader fr = new FileReader("config.properties");
        Properties pro = new Properties();
        pro.load(fr);
        String className = pro.getProperty("className");
        String methodName = pro.getProperty("methodName");
        
        Class clazz = Class.forName(className);
//        Constructor con = clazz.getConstructor();
        //获取指定类的对象
        Object obj = clazz.getConstructor().newInstance();
        Method method = clazz.getMethod(methodName);
        //invoke(obj) --- 对哪个对象调用方法
        method.invoke(obj);

    }
}
