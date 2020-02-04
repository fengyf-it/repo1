package cn.itheima.demo01;

/*
    使用接口做参数,这个接口只有一个抽象方法
 */
public class Demo03 {
    public static void showLog(int level, Message msg) {
        if (level == 1) {
            System.out.println(msg.logs());
        }
    }

    public static void main(String[] args) {
        String message01 = "Hello";
        String message02 = "World";
        String message03 = "Java";
        showLog(1, new Message() {
            @Override
            public String logs() {
                return message01 + message02 + message03;
            }
        });

        // 使用lambda
        showLog(1, ()->message01 + message02 + message03);
    }
}
