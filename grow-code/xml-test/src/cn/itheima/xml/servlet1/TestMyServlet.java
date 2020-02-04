package cn.itheima.xml.servlet1;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.junit.Test;

import java.lang.reflect.Constructor;

public class TestMyServlet {
    public static void main(String[] args) {

    }
    @Test
    public void testMyServlet(){
        //1.获取解析器
        SAXReader saxReader = new SAXReader();
        try {
            //获取XML路经的路经
            String path = TestMyServlet.class.getClassLoader().getResource("web.xml").getPath();
//            System.out.println(path);
            //2.获得document文档对象 web.xml
            Document document = saxReader.read(path);
//            Document document = saxReader.read("E:\\IdeaProjects\\grow-code\\xml-test\\src\\cn\\itheima\\xml\\servlet1\\web.xml");
            //3.获取根元素 web-app
            Element rootElement = document.getRootElement();
            //4.根据根元素名称获取子元素节点  servlet
            Element servlet = rootElement.element("servlet");
            //5.根据子元素节点,获取servlet-class的文本节点
            String servleClass = servlet.element("servlet-class").getText();
            Class clazz = Class.forName(servleClass);
            Constructor constructor = clazz.getConstructor();
            Object obj = constructor.newInstance();
            MyServlet1 myServlet1 = (MyServlet1) obj;
            myServlet1.init();
            myServlet1.service();
            myServlet1.destory();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
