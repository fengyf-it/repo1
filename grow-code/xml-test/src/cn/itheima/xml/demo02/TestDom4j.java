package cn.itheima.xml.demo02;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.util.List;

public class TestDom4j {
    public static void main(String[] args) {
        //获取解析器
        SAXReader saxReader = new SAXReader();

        try {
            //2.获取document对象
            Document document = saxReader.read("E:\\IdeaProjects\\grow-code\\xml-test\\src\\cn\\itheima\\xml\\demo02\\web.xml");
            //3.获取根元素
            Element rootElement = document.getRootElement();
            //4.通过根元素获取下面的子元素,返回值是一个类型为Element的集合
            List<Element> elements = rootElement.elements();
            for (Element element : elements) {
                //获取的是servlet/servlet-mapping
                if("servlet".equals(element.getName())){
                    System.out.println(element.element("servlet-name").getText());
                }
               /* List<Element> childElements = element.elements();
                for (Element childElement : childElements) {
                    //childElement的结果是:
                    if("servlet-name".equals(childElement.getName())){

                    }
                }*/
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
