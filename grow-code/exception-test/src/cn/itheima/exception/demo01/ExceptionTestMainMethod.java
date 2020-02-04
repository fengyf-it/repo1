package cn.itheima.exception.demo01;

public class ExceptionTestMainMethod {
    public static void main(String[] args){
        try {
            Person person = new Person("zs",-12 );
        }catch (NoAgeException e){
            e.printStackTrace();
        }
    }
}
