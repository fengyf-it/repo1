package cn.itheima.service;

import cn.itheima.dao.ZhangWuDao;
import cn.itheima.domain.ZhangWu;

import java.util.List;

/*
    业务层类
    接收Controller层传递的数据,并经过一系列计算
    然后传递给dao层,让其进行数据库的操作
    在成员位置上创建dao的对象
 */
public class ZhangWuService {
    private ZhangWuDao dao = new ZhangWuDao();

    public List<ZhangWu> selectAll() {
        return dao.selectAll();
    }

    public List<ZhangWu> select(String startDate, String endDate) {
        return dao.select(startDate, endDate);
    }

    public String addZhangWu(String flname,double money,String zhanghu,String createDate,String des) {
        return dao.addZhangWu(flname,money,zhanghu,createDate,des);
    }
}
