package cn.itheima.collection;


import java.util.HashSet;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("a");
        set.add("b");
        set.add("d");
        set.add("z");
        set.add("c");
        for (String string : set) {
            System.out.println(string);
        }
    }


}
