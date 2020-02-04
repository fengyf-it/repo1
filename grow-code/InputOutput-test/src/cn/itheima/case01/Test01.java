package cn.itheima.case01;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test01 {
    public static void main(String[] args) {
        HashMap<String,String> map = new HashMap<>();
        map.put("张三","c");
        map.put("李四","b");
        map.put("王五","d");
        map.put("汾酒","b");
        map.put("赵六","d");
        map.put("熊大","a");
        Set<String> set = map.keySet();
        for (String key : set) {
            System.out.println(key+":"+map.get(key));
        }
    }


}
