package cn.itheima.collection.demo01;

import java.util.ArrayList;
import java.util.Iterator;

public class ItertorTest {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");
        list.add("eee");
        Iterator iterator = list.iterator();
        while(iterator.hasNext()){
            String s = (String)iterator.next();
            System.out.println(s.length());
            System.out.println(s);
        }
    }
}
