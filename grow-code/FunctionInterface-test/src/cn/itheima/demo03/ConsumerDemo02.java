package cn.itheima.demo03;

import java.util.function.Consumer;

public class ConsumerDemo02 {
    public static void printConsum(String[] arr, Consumer<String> one,Consumer<String> two){
        for (String s : arr) {
            one.andThen(two).accept(s);
        }
    }

    public static void main(String[] args) {
        String[] arr = {"1,语文","2,数学","3,英语","4,物理","5,化学"};

        /*printConsum(arr, new Consumer<String>() {
            @Override
            public void accept(String s) {
                    System.out.print("第" + s.split(",")[0] + "节课");
            }
        }, new Consumer<String>() {
            @Override
            public void accept(String s) {
                    System.out.println("是"+s.split(",")[1]);
            }
        });*/

        //使用lambda
        printConsum(arr,
                s->System.out.print("第" + s.split(",")[0] + "节课"),
                s->System.out.println("是"+s.split(",")[1]));
    }
}
