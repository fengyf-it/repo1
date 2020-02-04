package cn.itheima.demo03;

import java.util.function.Consumer;

public class ConsumerDemo {
    public static void consum(String str , Consumer<String> con){
        con.accept(str);
    }

    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "world";
        /*consum(str2, new Consumer<String>() {
            @Override
            public void accept(String str) {
                System.out.println(str1);
            }
        });*/

        consum(str2, str -> System.out.println(str));
    }
}
