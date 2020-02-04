package cn.itheima.collection.demo03;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test01 {
    public static void main(String[] args) {
        Map<String,Integer> map =  new HashMap<>();
        map.put(null,0);
        Set<String> strings = map.keySet();
        for (String string : strings) {
            System.out.println(string+":"+map.get(string));
        }
    }

    public static int sum(int...arr) {
        int sum = 0;
        for (int i : arr) {
            sum +=i;
        }
        return sum;
    }
}
