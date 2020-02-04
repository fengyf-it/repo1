package cn.itheima.xml.servlet3;


public class HelloMyServlet01 implements IMyservlet{
    @Override
    public void init() {
        System.out.println("MyServlet01...开启");
    }

    @Override
    public void server() {
        System.out.println("MyServlet01...服务");
    }

    @Override
    public void destory() {
        System.out.println("MyServlet01...销毁");
    }
}
