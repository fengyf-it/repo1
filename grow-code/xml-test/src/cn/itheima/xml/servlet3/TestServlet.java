package cn.itheima.xml.servlet3;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.junit.Test;

import java.io.File;
import java.lang.reflect.Constructor;
import java.util.List;

public class TestServlet {

    @Test
    public void test(){
        //获取解析器
        SAXReader saxReader = new SAXReader();
        try {
            //通过解析器获取到文档对象,web-app
            Document document = saxReader.read("cn/itheima/xml/servlet3/web.xml");
            //通过文档对象,获取根元素节点,这个根元素就是web-app
            Element rootElement = document.getRootElement();
//            System.out.println(rootElement.getName());
            //通过根元素获取子元素节点,返回值将是一个类型为Element的集合
            //通过根元素获取名称为servlet的节点
            Element servlet = rootElement.element("servlet");
            //通过servlet节点找到他的下一级节点以及节点的内容
            String servletClass = servlet.element("servlet-class").getText();
            //通过获取到servletClass的内容,使用反射进行读取字节码文件
            Class clazz = Class.forName(servletClass);
            Constructor constructor = clazz.getConstructor();
            Object obj = constructor.newInstance();
            HelloMyServlet01 servlet01 = (HelloMyServlet01) obj;
            servlet01.init();
            servlet01.server();
            servlet01.destory();
            //遍历
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
