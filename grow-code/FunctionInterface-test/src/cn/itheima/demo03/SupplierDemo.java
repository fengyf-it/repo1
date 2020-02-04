package cn.itheima.demo03;

import java.util.function.Supplier;

public class SupplierDemo {

    public static String getString(Supplier<String> sup) {
        return sup.get();
    }

    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "world";
        System.out.println(getString(new Supplier<String>() {
            @Override
            public String get() {
                return str1+str2;
            }
        }));

        //使用lambda
        System.out.println(getString(()->str2+str1));
    }
}
