package cn.itheima.xml.servlet3;


public class HelloMyServlet02 implements IMyservlet{

    @Override
    public void init() {
        System.out.println("MyServlet02...开启");
    }

    @Override
    public void server() {
        System.out.println("MyServlet02...服务");
    }

    @Override
    public void destory() {
        System.out.println("MyServlet02...销毁");
    }
}
