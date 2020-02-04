package cn.itheima.wechat.demo01;

/*
    定义一个分享接口
    返回状态,成功为0,失败为1
 */
public interface ShareListener {
    int STATE_SUCC =0;
    int STATE_FAIL =1;

    void onCallback(int state,String msg);
}
