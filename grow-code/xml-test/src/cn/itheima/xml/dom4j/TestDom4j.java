package cn.itheima.xml.dom4j;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.junit.Test;

import java.util.List;


public class TestDom4j {

    @Test
    public void dom4j() {
        //1.获取解析器
        SAXReader saxReader = new SAXReader();
        try {
            //2.获取document文档对象
            Document document = saxReader.read("E:\\IdeaProjects\\grow-code\\xml-test\\src\\cn\\itheima\\xml\\schema\\web.xml");
            //3.获取根元素
            Element rootElement = document.getRootElement();
            /*
            //获取根元素的名称
            String name = rootElement.getName();
            System.out.println(name);
            //获取根元素的属性
            String version = rootElement.attributeValue("version");
            System.out.println(version);
            */
            //4.获取根元素下的子元素
            List<Element> childElements = rootElement.elements();
            //5.遍历子元素
            for (Element element : childElements) {
                if("servlet".equals(element.getName())){
                    Element servletName = element.element("servlet-name");
                    System.out.println(servletName.getText());
                    Element servletClass = element.element("servlet-class");
                    System.out.println(servletClass.getText());
                }
            }
        } catch (DocumentException e) {
            e.printStackTrace();
        }
    }
}
