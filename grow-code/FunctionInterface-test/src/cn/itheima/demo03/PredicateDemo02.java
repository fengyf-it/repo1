package cn.itheima.demo03;

import java.util.function.Predicate;

/*

 */
public class PredicateDemo02 {

    public static void method(String[] arr,Predicate<String> one,Predicate<String> two){
        for (String s : arr) {
            boolean test = !one.and(two).test(s);
            if(test){
                System.out.println("符合要求的女生有:"+s);
            }
        }
    }

    public static void main(String[] args) {
        String[] arr = {"迪丽热巴,女","古力娜扎,女","马尔扎哈,男","赵丽因,女","冯绍峰,男","卡尔萨斯,男"};

        /*method(arr, new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return "女".equals(s.split(",")[1]);
            }
        }, new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.split(",")[0].length()==4;
            }
        });*/


        //使用lambda
        method(arr,
                s-> "女".equals(s.split(",")[1]),
                s -> s.split(",")[0].length()==4
        );

    }
}
