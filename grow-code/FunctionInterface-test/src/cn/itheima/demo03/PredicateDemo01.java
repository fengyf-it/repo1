package cn.itheima.demo03;

import java.util.function.Predicate;

public class PredicateDemo01 {
    public static void predicateTest(String str,Predicate<String> pre){
        boolean veryLong = pre.test(str);
        System.out.println("这个字符串长吗:"+veryLong);
    }

    public static void main(String[] args) {
        String string = "helloworld";
        String str = "abc";
        predicateTest(string, new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return string.length()>5;
            }
        });

        predicateTest(str, s->str.length()>5);
    }
}
