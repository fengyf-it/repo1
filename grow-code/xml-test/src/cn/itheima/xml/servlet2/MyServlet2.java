package cn.itheima.xml.servlet2;

public class MyServlet2 implements IMyServlet {
    @Override
    public void init() {
        System.out.println("MyServlet2 开启...");
    }

    @Override
    public void service() {
        System.out.println("MyServlet2 服务...");
    }

    @Override
    public void destory() {
        System.out.println("MyServlet2 销毁...");
    }
}
