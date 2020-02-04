package cn.itheima.collection.MapTest;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapDemo01 {
    public static void main(String[] args) {
        Map<Integer, Person> map = new HashMap<>();
        map.put(1, new Person("张三", 1));
        map.put(2, new Person("李四", 2));
        map.put(3, new Person("王五", 3));
        map.put(4, new Person("路西", 4));
        map.put(5, new Person("张三", 5));
        map.put(6, new Person("张三", 6));
        map.put(7, new Person("李四", 7));
        map.put(8, new Person("王五", 8));
        map.put(9, new Person("路西", 9));
        map.put(10, new Person("张三", 10));
        method04(map);
    }
    /*
        使用keySet方法遍历map集合
     */
    public static void method01(Map<Integer,Person> map){
        Set<Integer> set = map.keySet();
        for (Integer key : set) {
            Person value = map.get(key);
            System.out.println(value);
        }
    }

    /*
        使用entrySet()方法来遍历map
     */
    public static void method02(Map<Integer,Person> map){
        Set<Map.Entry<Integer, Person>> set = map.entrySet();
        for (Map.Entry<Integer, Person> entry : set) {
            Integer key = entry.getKey();
            Person value = entry.getValue();
            System.out.println(key +":"+ value);
        }
    }

    /*
        使用迭代器通过keySet方法
     */
    public static void method03(Map<Integer,Person> map){
        Set<Integer> set = map.keySet();
        Iterator<Integer> iterator = set.iterator();
        while(iterator.hasNext()){
            Integer key = iterator.next();
            Person value = map.get(key);
            System.out.println("================");
            System.out.println(key+":"+value);
        }
    }

    /*
        使用迭代器,通过entrySet()方法
     */
    public static void method04(Map<Integer,Person> map){
        Set<Map.Entry<Integer, Person>> set = map.entrySet();
        Iterator<Map.Entry<Integer, Person>> iterator = set.iterator();
        while (iterator.hasNext()){
            Map.Entry<Integer, Person> entry = iterator.next();
            Integer key = entry.getKey();
            Person value = entry.getValue();
            System.out.println(value);
        }
    }


}
