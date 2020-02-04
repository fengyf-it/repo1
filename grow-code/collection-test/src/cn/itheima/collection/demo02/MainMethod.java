package cn.itheima.collection.demo02;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class MainMethod {
    public static void main(String[] args) {
        Person person01 = new Person("张3", 10);
        Person person02 = new Person("李四", 11);
        Person person03 = new Person("王五", 12);
        Person person04 = new Person("张3", 10);
        Person person05 = new Person("Luck", 66);
        Person person06 = new Person("Luck", 66);

        HashSet<Person> list = new HashSet<>();
        list.add(person01);
        list.add(person02);
        list.add(person03);
        list.add(person04);
        list.add(person05);
        list.add(person06);

        Iterator<Person> iterator = list.iterator();
        while(iterator.hasNext()){
            Person p = iterator.next();
            System.out.println(p.getName()+"-"+p.getAge());
        }
    }
}
