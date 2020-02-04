package cn.itheima.xml.servlet2;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.junit.Test;

import java.lang.reflect.Constructor;
import java.util.List;

public class TestServlet {

    @Test
    public void testServlet(){
        //获得加载器
        SAXReader saxReader = new SAXReader();
        try {
            //读取web.xml,获取文档对象
            Document document = saxReader.read("E:\\IdeaProjects\\grow-code\\xml-test\\src\\cn\\itheima\\xml\\servlet2\\web.xml");
            //通过文档对象获取根元素
            Element rootElement = document.getRootElement();
            //通过根元素获取子元素节点
            List<Element> servlets = rootElement.elements();
            //通过子元素节点获取文本节点
            for (Element servlet : servlets) {
                if("servlet".equals(servlet.getName())){
                    String servletClass = servlet.element("servlet-class").getText();
                    Class clazz = Class.forName(servletClass);
                    Constructor constructor = clazz.getConstructor();
                    Object obj = constructor.newInstance();
                    MyServlet1 myServlet1 = (MyServlet1) obj;
                    myServlet1.init();
                    myServlet1.service();
                    myServlet1.destory();
                }
                /*if("servlet".equals(servlet.getName())){
                    String servletName = servlet.element("servlet-name").getText();
                    System.out.println(servletName);
                    String servletClass = servlet.element("servlet-class").getText();
                    System.out.println(servletClass);
                }*/
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
