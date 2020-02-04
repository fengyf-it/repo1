package cn.itheima.wechat.demo03;

public interface ShareListener {
    static final int STATE_SUCC = 0;
    static final int STATE_FAIL = 0;

    void onCallback(int state,String message);
}
