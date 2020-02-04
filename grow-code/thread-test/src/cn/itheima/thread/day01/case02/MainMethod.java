package cn.itheima.thread.day01.case02;

public class MainMethod {
    public static void main(String[] args) {
        Person person = new Person();

        Input in = new Input(person);
        Output out = new Output(person);
        Thread tin = new Thread(in);
        Thread tout = new Thread(out);

        tin.start();
        tout.start();
    }
}
