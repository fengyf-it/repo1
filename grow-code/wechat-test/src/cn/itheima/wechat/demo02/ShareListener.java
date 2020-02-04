package cn.itheima.wechat.demo02;

public interface ShareListener {
    public static final int SHARE_SUCC = 0;
    public static final int SHARE_FAIL = 1;

    void onCallListener(int type,String message);
}
