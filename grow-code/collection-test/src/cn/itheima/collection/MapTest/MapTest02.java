package cn.itheima.collection.MapTest;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapTest02 {
    public static void main(String[] args) {
        Map<Integer, Person> map = new HashMap<>();
        Person person01 = new Person("zs", 21);
        Person person02 = new Person("ls", 22);
        Person person03 = new Person("ww", 23);
        Person person04 = new Person("lf", 24);
        Person person05 = new Person("js", 25);
        Person person06 = new Person("nm", 26);
        map.put(1, person01);
        map.put(2, person02);
        map.put(3, person03);
        map.put(4, person04);
        map.put(5, person05);
        map.put(6, person06);

        Set<Map.Entry<Integer, Person>> set = map.entrySet();

        Iterator<Map.Entry<Integer, Person>> iterator = set.iterator();

        while (iterator.hasNext()) {
            Map.Entry<Integer, Person> entry = iterator.next();
            Integer integer = entry.getKey();
            Person person = entry.getValue();
            System.out.println(integer + "-"+ person.getName()+"-"+person.getAge());
        }

    }
}
