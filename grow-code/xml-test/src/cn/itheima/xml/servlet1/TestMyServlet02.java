package cn.itheima.xml.servlet1;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.junit.Test;

import java.lang.reflect.Constructor;
import java.util.List;

public class TestMyServlet02 {

    @Test
    public void testMyServlet(){
        //1.获取解析器
        SAXReader saxReader = new SAXReader();
        try {
            //2.获得document文档对象 web.xml
            Document document = saxReader.read("E:\\IdeaProjects\\grow-code\\xml-test\\src\\cn\\itheima\\xml\\servlet1\\web.xml");
            //3.获取根元素 web-app
            Element rootElement = document.getRootElement();
            //4.根据根元素,获取所有子元素节点,存储到list集合容器中
            List<Element> childElements = rootElement.elements();
            //子元素存储在集合容器中,进行遍历
            for (Element childElement : childElements) {
                if("servlet".equals(childElement.getName())){
                    Element servletName = childElement.element("servlet-name");
                    System.out.println(servletName.getText());
                    Element servletClass = childElement.element("servlet-class");
                    System.out.println(servletClass.getText());
                }
            }

            //5.根据子元素节点,获取servlt-class的文本节点

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
