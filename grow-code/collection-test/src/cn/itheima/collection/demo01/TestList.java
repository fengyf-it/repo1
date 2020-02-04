package cn.itheima.collection.demo01;

import java.util.ArrayList;

public class TestList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i)==1){
                list.add(5);
            }
            System.out.println(list.get(i));
        }
        for (Integer integer : list) {
            if(integer==1){
                list.add(6);
            }
            System.out.println(integer);
        }
    }
}
