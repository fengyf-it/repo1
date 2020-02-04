package cn.itheima.view;

import cn.itheima.controller.ZhangWuController;
import cn.itheima.domain.ZhangWu;

import java.util.List;
import java.util.Scanner;

/*
    视图层,用户看到和操作的界面
    数据传递给controller层去实现
 */
public class MainView {
    private ZhangWuController controller = new ZhangWuController();

    public void run(){
        while(true){
            System.out.println("----------------欢迎来到管家婆----------------");
            System.out.println("1.添加账务\t2.编辑账单\t3.删除账单\t4.查询账单\t5.退出");
            System.out.println("请选择需要执行的功能[1-5]:");
            Scanner scanner = new Scanner(System.in);
            int choose = scanner.nextInt();
            switch (choose){
                case 1:
                    //执行添加账务的方法
                    addZhangWu();
                    break;
                case 2:
                    //执行编辑账单的方法
//                    editZhangWu();
                    break;
                case 3:
                    //执行删除账单的功能
//                    deleteZhangWu();
                    break;
                case 4:
                    //执行查询账单的方法
                    selectZhangWu();
                    break;
                case 5:
                    System.exit(0);
            }
        }
    }

    /*
        添加账务的方法
        2.分类名称		3.交易金额		4.账户类型		5.交易时间		6.说明
     */
    private void addZhangWu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入分类名称:");
        String flname = scanner.nextLine();
        System.out.println("请输入交易金额:");
        double money = scanner.nextDouble();
        System.out.println("请输入账户类型:");
        String zhanghu = scanner.nextLine();
        System.out.println("请输入交易时间:");
        String createDate = scanner.nextLine();
        System.out.println("请输入说明:");
        String des = scanner.nextLine();
        String s = controller.addZhangWu(flname, money, zhanghu, createDate, des);
        System.out.println(s);
    }

    /*
        查询账单的方法
        方法分两部分:
            1.查询所有账单
            2.按照时间查询部分信息
     */
    private void selectZhangWu() {
        System.out.println("1.查询所有账单\t2.查询部分账单\t3.返回上一层");
        System.out.println("请输入所要选择的功能[1-2]");
        Scanner scanner = new Scanner(System.in);
        int selectChoose = scanner.nextInt();
        switch (selectChoose){
            case 1:
                selectAll();
                break;
            case 2:
                select();
                break;
            case 3:
                break;
        }
    }

    /*
        按照时间期限进行查询
            开始时间startDate
            结束时间endDate
     */
    private void select() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入需要查询的时间期限(格式为:xxxx-xx-xx):");
        System.out.println("开始时间:");
        String startDate = scanner.nextLine();
        System.out.println("结束时间:");
        String endDate = scanner.nextLine();
        List<ZhangWu> list = controller.select(startDate,endDate);
        method(list);
    }

    public void method(List<ZhangWu> list) {
        System.out.println("1.ID\t\t2.分类名称\t\t3.交易金额\t\t4.账户类型\t\t5.交易时间\t\t6.说明");
        for (ZhangWu zhangWu : list) {
            System.out.println(
                    zhangWu.getZwid()+"\t\t\t"+zhangWu.getFlname()+"\t\t"+ zhangWu.getMoney()
                            +"\t\t"+zhangWu.getZhanghu()+"\t\t"+zhangWu.getCreatetime()+"\t\t"+zhangWu.getDescription());
        }
    }

    /*
        查看所有账单的方法
     */
    private void selectAll() {
        List<ZhangWu> list = controller.selectAll();
        method(list);
    }
}
