package cn.itheima.demo03;

import java.util.function.Supplier;

public class SupplierDemo02 {
    public static int getInteger(Supplier<Integer> sup) {
        return sup.get();
    }

    public static void main(String[] args) {
        int[] arr = {3, 6, 1, 8, 4, 9, 54, 23, 99};
        /*int max = getInteger(new Supplier<Integer>() {
            @Override
            public Integer get() {
                int max = arr[0];
                for (int i = 1; i < arr.length; i++) {
                    if (arr[i] > max) {
                        max = arr[i];
                    }
                }
                return max;
            }
        });*/

        //使用lambda
        int max = getInteger(()->{
            int max01 = arr[0];
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] > max01) {
                    max01 = arr[i];
                }
            }
            return max01;
        });

        System.out.println(max);

    }
}
