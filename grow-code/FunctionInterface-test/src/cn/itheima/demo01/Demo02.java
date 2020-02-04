package cn.itheima.demo01;

public class Demo02 {
    public static void showLog(int level,String message){
        if(level==1){
            System.out.println(message);
        }
    }
    public static void main(String[] args) {

        /*
            这种写法会导致一些资源的浪费.
            msg01+msg02 在前
            level==1 判断在后,如果判断为假,不打印,并且msg01+msg02白白相加
            可以使用lambda表达式的延迟效果,让判断在前,相加在后
         */
        String msg01 = "日志一";
        String msg02 = "日志二";
        showLog(1,msg01+msg02);
    }
}
