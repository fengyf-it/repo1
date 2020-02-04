package cn.itheima.thread.day01.demo02;

/**
 * @Description:
 * @Author: fengyuan
 * @Date: 2019/12/27 22:12
 */
public class StringTest {

    public static void main(String[] args) {
        String test01 = "A;B;C";
        String test02 = "A";

        String[] split01 = test01.split(";");
        String[] split02 = test02.split(";");
        StringBuilder builder = new StringBuilder();
        int count= 0 ;
        for (String s : split01) {
            System.out.println("split01"+s);
            count ++;
            if (count <split01.length){
                builder.append(s+",");
            }else{
                builder.append(s);
            }

        }
        String string = new String(builder);
        System.out.println("string:"+string);
        for (String s : split02) {
            System.out.println("split02"+s);
        }
    }
}
