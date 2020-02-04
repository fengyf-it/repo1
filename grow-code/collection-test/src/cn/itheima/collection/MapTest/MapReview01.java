package cn.itheima.collection.MapTest;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapReview01 {
    public static void main(String[] args) {
        Map<Integer, Person> map = new HashMap<>();
        map.put(1, new Person("张三", 19));
        map.put(2, new Person("李四", 20));
        map.put(3, new Person("王五", 21));
        map.put(4, new Person("路西", 22));
        map.put(5, new Person("张三", 19));

//        method01(map);
//        method02(map);
//        function01(map);
        function02(map);

    }

    /*
        通过迭代器进行keySet()方法的遍历

    */
    public static void method01(Map<Integer, Person> map) {
        Set<Integer> set = map.keySet();
        Iterator<Integer> iterator = set.iterator();

        while (iterator.hasNext()) {
            Integer key = iterator.next();
            Person value = map.get(key);
            System.out.println(key + "-" + value.toString());
        }
    }

    /*
        通过迭代器来进行entrySet()方法遍历
    */
    public static void method02(Map<Integer, Person> map) {
        Set<Map.Entry<Integer, Person>> set = map.entrySet();

        Iterator<Map.Entry<Integer, Person>> iterator = set.iterator();
        while (iterator.hasNext()) {
            Map.Entry<Integer, Person> entry = iterator.next();
            Integer key = entry.getKey();
            Person value = entry.getValue();
            System.out.println(key + "-" + value);
        }
    }

    /*
        通过增强for来进行keySet()方法的遍历
     */
    public static void function01(Map<Integer, Person> map) {
        for (Integer key : map.keySet()) {
            Person value = map.get(key);
            System.out.println(key + "-" + value);
        }
    }

    /*
        通过增强for来进行entrySet()方法的遍历
     */
    public static void function02(Map<Integer,Person> map){
        for(Map.Entry<Integer,Person> entry : map.entrySet() ){
            Integer key = entry.getKey();
            Person value = entry.getValue();
            System.out.println("===========");
            System.out.println(key + "-"+value);
        }
    }
}
