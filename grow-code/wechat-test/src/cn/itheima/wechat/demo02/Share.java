package cn.itheima.wechat.demo02;

/*
    分享txt文本,img图片,image_txt图文,link链接
    txt文本:内容
    img图片:图片路径
    image_txt图文:图片,内容
    link链接:标题title,内容content,链接地址address

    判断文件类型,然后用一个方法把这个文件类型里面的东西存储
    并且判断存储状态,存储成功或者失败
 */
public class Share {
    /*
        定义四个常量用来表示文本得类型
     */
    public static final int TXT_TYPE = 0;
    public static final int IMAGE_TYPE = 1;
    public static final int IMAGE_TXT_TYPE = 2;
    public static final int LINK_TYPE = 3;

    public static void main(String[] args) {
        Item item = new Item();
        item.type = 0;
        share(item, new ShareListener() {
            @Override
            public void onCallListener(int type, String message) {
                System.out.println(type+"---"+message);
            }
        });
    }

    public static void share(Item item,ShareListener listener){
        if(item != null){
            //判断文件类型是否为文本类型
            if(item.type==0){
                listener.onCallListener(item.type,"分享成功");
            }else {
                listener.onCallListener(item.type,"分享失败");
            }
        }
    }

}
