package cn.itheima.demo.arraylist;

import java.lang.reflect.Method;
import java.util.ArrayList;

/*
    通过反射的特性,泛型的擦除,让一个Integer反省的集合添加进String数据
 */
public class RefletArrayList {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> array = new ArrayList<>();
        array.add(0);

        //通过反射获取class文件
        Class clazz = array.getClass();
        Method method = clazz.getMethod("add", Object.class);
        method.invoke(array,"哈哈,没想到吧");
        method.invoke(array,"有奸细哦");
        method.invoke(array,"嘻嘻");
        System.out.println(array);
    }
}
