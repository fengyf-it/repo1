package cn.itheima.thread.day01.case03;

/*
    两个客户去银行存钱,一次存100,存三次

 */
public class MainMethod {
    public static void main(String[] args) {
        Person person01 = new Person("张三",100);
        Person person02 = new Person("李四",200);

        Bank bank = new Bank(person01);
        Thread thread01 = new Thread(bank);
        Thread thread02 = new Thread(bank);

        thread01.start();
        thread02.start();
    }
}
