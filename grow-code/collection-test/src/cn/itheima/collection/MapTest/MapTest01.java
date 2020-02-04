package cn.itheima.collection.MapTest;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapTest01 {
    public static void main(String[] args) {
        Map<Integer,Person> map = new HashMap<Integer, Person>();
        Person person = new Person();
        map.put(1,new Person("张三",19));
        map.put(2,new Person("李四",20));
        map.put(3,new Person("王五",21));
        map.put(4,new Person("路西",22));
        map.put(5,new Person("张三",19));

        Set<Integer> set = map.keySet();

        /*
            使用迭代器进行遍历Set集合
            通过遍历获取key值
            然后get(key)得到value
         */
        Iterator<Integer> iterator = set.iterator();
        while(iterator.hasNext()){
            Integer key = iterator.next();
            Person value = map.get(key);
            System.out.println(key + "-"+value.getName()+"-"+value.getAge());
        }
        System.out.println("============================");
        /*
            使用增强for,代码会更加简化
         */
        for (Integer integer : set) {
            Person value = map.get(integer);
            System.out.println(integer + "-"+value.getName()+"-"+value.getAge());
        }

    }
}
