package cn.itheima.xml.jsoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;

/*
    选择器查询
 */
public class JsoupDemo05 {
    public static void main(String[] args) throws IOException {

        String path = JsoupDemo05.class.getClassLoader().getResource("student.xml").getPath();
        Document document = Jsoup.parse(new File(path), "utf-8");
        System.out.println(document);
        /*
            case01;获取Student标签,并且name属性值为heima_0001的age字标签
         */
        Elements element01 = document.select("student[number=\"heima_0001\"]");
        System.out.println(element01);
        System.out.println("======================");
        Elements element02 = document.select("student[number=\"heima_0001\"]>age");
        System.out.println(element02);

    }
}
