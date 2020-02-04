package cn.itheima.xml.servlet1;

public class MyServlet1 implements IMyServlet {
    @Override
    public void init() {
        System.out.println("MyServlet1 启动...");
    }

    @Override
    public void service() {
        System.out.println("MyServlet1 开始服务...");
    }

    @Override
    public void destory() {
        System.out.println("MyServlet1 销毁了...");
    }
}
