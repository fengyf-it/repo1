package cn.itheima.xml.servlet2;

public class MyServlet1 implements IMyServlet {
    @Override
    public void init() {
        System.out.println("MyService1 开启...");
    }

    @Override
    public void service() {
        System.out.println("MyService1 服务...");
    }

    @Override
    public void destory() {
        System.out.println("MyService1 销毁...");
    }
}
