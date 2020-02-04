package cn.itheima.collection.MapTest;

import java.util.HashMap;
import java.util.Map;

/*
    第一个Map集合:
        基础班javase<学号,姓名>
    第二个Map集合:
        就业班javaee<学号,姓名>

    第三个Map集合:
        黑马horse<id,班级>
 */
public class MapMapDemo {
    public static void main(String[] args) {
        Map<Integer,String> javase = new HashMap<>();
        javase.put(1,"路飞");
        javase.put(2,"艾斯");
        javase.put(3,"萨博");
        Map<Integer,String> javaee = new HashMap<>();
        javaee.put(1,"索隆");
        javaee.put(2,"山治");
        javaee.put(3,"乔巴");
        Map<Integer,Map<Integer,String>> horse = new HashMap<>();
        horse.put(1,javase);
        horse.put(2,javaee);

    }
    /*
        通过迭代器,keySet()方法进行遍历
     */


}
