package cn.itheima.demo02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

/*
    将接口作为一个返回值
 */
public class Demo01 {

    public static Comparator<String> getComparator(){
        /*return new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.length()-o1.length();
            }
        };*/
        return new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length()-o2.length();
            }
        };
//        return (o1, o2) -> o2.length()-o1.length();
//        return (o1,o2)->o2.length()-o1.length();
    }

    public static void main(String[] args) {
        String[] arr = {"hello","world","earth","java","python"};

        Arrays.sort(arr,getComparator());
        for (String s : arr) {
            System.out.println(s);
        }
    }
}
