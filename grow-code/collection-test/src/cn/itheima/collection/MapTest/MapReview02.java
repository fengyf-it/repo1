package cn.itheima.collection.MapTest;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapReview02 {
    public static void main(String[] args) {
        Map<Integer, Person> map = new HashMap<>();
        map.put(1, new Person("张三", 19));
        map.put(2, new Person("李四", 20));
        map.put(3, new Person("王五", 21));
        map.put(4, new Person("路西", 22));
        map.put(5, new Person("张三", 19));

        method01(map);
        method02(map);
    }

    /*
        迭代器,使用keySet()方法
     */
    public static void method01(Map<Integer,Person> map){
        Set<Integer> set = map.keySet();
        Iterator<Integer> iterator = set.iterator();
        System.out.println("method01");
        while(iterator.hasNext()){
            Integer key = iterator.next();
            Person value = map.get(key);
            System.out.println(key+"-"+value);
        }
    }
    /*
        使用迭代器,entrySet()方法
     */
    public static void method02(Map<Integer,Person> map) {
        Set<Map.Entry<Integer, Person>> set = map.entrySet();
        Iterator<Map.Entry<Integer,Person>> iterator = set.iterator();
        System.out.println("method02");
        while(iterator.hasNext()){
            Map.Entry<Integer, Person> entry = iterator.next();
            Integer key = entry.getKey();
            Person value = entry.getValue();
            System.out.println(key +"-"+ value);
        }
    }
}
