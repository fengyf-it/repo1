package cn.itheima.xml.servlet1;

public class MyServlet2 implements IMyServlet {
    @Override
    public void init() {
        System.out.println("MyServlet2 启动...");
    }

    @Override
    public void service() {
        System.out.println("MyServlet2 开始服务...");
    }

    @Override
    public void destory() {
        System.out.println("MyServlet2 销毁了...");
    }
}
