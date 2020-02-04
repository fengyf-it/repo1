package cn.itheima.wechat.demo01;

/*
    业务需求:
        支持分享链接,图片,文本和图文,分享结果回调给用户
        链接:具有链接、标题和内容
        图片:具有图片路径
        文本:具有内容
        图文:具有图片路径和内容
 */
public class ShareType {
    private static final int TYPE_LINK = 0; //连接
    private static final int TYPE_IMAGE = 1;    //图片
    private static final int TYPE_TEXT = 2;     //txt
    private static final int TYPE_IMAGE_TEXT = 3;   //图文

    public static void main(String[] args) {
        share(new ShareItem(), new ShareListener() {
            @Override
            public void onCallback(int state, String msg) {
                System.out.println(state+"+"+msg);
            }
        });
    }

    public static void share(ShareItem item, ShareListener listener) {
        //
        if (item != null) {
            if (item.type == TYPE_LINK) {
                //判断标题和连接是否为空
                if (!TextUtils.isEmpty(item.link) && !TextUtils.isEmpty(item.title)) {
                    doShareText(item.link, item.title, item.content, listener);
                } else {
                    if (listener != null) {
                        listener.onCallback(ShareListener.STATE_FAIL, "分享的信息不完整");
                    }
                }
            } else if (item.type == TYPE_IMAGE) {
                //分享图片
                if (!TextUtils.isEmpty(item.imagePath)) {
                    doShareText(item.imagePath, listener);
                } else {
                    if (listener != null) {
                        listener.onCallback(ShareListener.STATE_FAIL, "分享的信息不完整");
                    }
                }
            } else if (item.type == TYPE_TEXT) {
                //分享文本
                if (!TextUtils.isEmpty(item.content)) {
                    doShareText(item.content, listener);
                } else {
                    if (listener != null) {
                        listener.onCallback(ShareListener.STATE_FAIL, "分享的信息不完整");
                    }
                }
            } else if (item.type == TYPE_IMAGE_TEXT) {
                //分享图文
                if (!TextUtils.isEmpty(item.imagePath) && !TextUtils.isEmpty(item.content)) {
                    doShareText(item.imagePath, item.content, listener);
                } else {
                    if (listener != null) {
                        listener.onCallback(ShareListener.STATE_FAIL, "分享的信息不完整");
                    }
                }
            }
        } else {
            if (listener != null) {
                listener.onCallback(ShareListener.STATE_FAIL, "不支持的分享类型");
            }
        }
    }

    private static void doShareText(String str1, ShareListener listener) {
    }

    private static void doShareText(String str1, String str2, ShareListener listener) {
    }

    private static void doShareText(String str1, String str2, String str3, ShareListener listener) {
    }

}
