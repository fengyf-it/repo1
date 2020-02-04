package cn.itheima.demo03;

import java.util.function.Consumer;

public class AndThenDemo {
    public static void consumerString(Consumer<String> one,Consumer<String> two) {
        one.andThen(two).accept("hello");
    }

    public static void main(String[] args){
        /*consumerString(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s.toUpperCase());
            }
        }, new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s.toLowerCase());
            }
        });*/


        //使用lambda
        consumerString(s-> System.out.println(s.toUpperCase()), s -> System.out.println(s.toLowerCase()));
    }
}
