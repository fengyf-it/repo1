package cn.itheima.demo01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class StreamDemo01 {

    public static void main(String[] args) {

        List<String> list = new ArrayList<String>();
        list.add("张三丰");
        list.add("张无忌");
        list.add("赵敏");
        list.add("周芷若");
        list.add("殷天正");
        list.add("张程玲");
        list.stream()
                .filter(string->string.startsWith("张"))
                .filter(string->string.length()==3)
                .forEach(string-> System.out.println(string));

    }
}
