package cn.itheima.controller;

import cn.itheima.domain.ZhangWu;
import cn.itheima.service.ZhangWuService;

import java.util.List;

/*
    控制器层
    接受视图层的数据数据传递给Service层
    成员位置,创建service对象
 */
public class ZhangWuController {
    private ZhangWuService service = new ZhangWuService();

    public List<ZhangWu> selectAll() {
        return service.selectAll();
    }

    public List<ZhangWu> select(String startDate, String endDate) {
        return service.select(startDate,endDate);
    }

    public String addZhangWu(String flname,double money,String zhanghu,String createDate,String des) {
        return service.addZhangWu(flname,money,zhanghu,createDate,des);
    }
}
