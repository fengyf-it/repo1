package cn.itheima.wechat.demo03;

import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.util.Properties;

/*
    文本:有标题和文本
    音乐:有内容
    视频:标题,图片和链接
    图片:图片,标题
    String title;  //标题
    String content;  //内容
    String imagePath;  //图片
    String link;  //
 */
public class Client {
    private static final int TYPE_TXT = 0;         //文本
    private static final int TYPE_MP3 = 1;        //音乐
    private static final int TYPE_VIDEO = 2;          //视频
    private static final int TYPE_IMAGE = 3;        //图片

    public static void main(String[] args) throws Exception {
        //连接服务器端的IP地址和端口号
//        Socket socket = new Socket("127.0.0.1",8888);
        ShareItem item = new ShareItem();
        item.type = 0;
        item.content=null;
        item.imagePath=null;
        item.link=null;
        item.title=null;
        System.out.println(item);
        System.out.println("==============");
//        System.out.println(item);
        share(item, new ShareListener() {
            @Override
            public void onCallback(int state, String message) {
                System.out.println(state + ":" + message);
            }
        });

    }

    /*
        定义一个方法,用来读取配置文件
     */
    public static ShareItem readConfig() throws IOException {
        InputStream in = Client.class.getClassLoader().getResourceAsStream("config.properties");
        Properties pro = new Properties();
        pro.load(in);
//        String type = pro.getProperty("FileType");
        String filePath = pro.getProperty("FilePath");
        int type = 5;
        if (filePath.endsWith(".txt")) {
            type = 0;
        } else if (filePath.endsWith(".mp3")) {
            type = 1;
        }else if(filePath.endsWith(".avi")){
            type = 2;
        }else if(filePath.endsWith(".png")){
            type = 3;
        }
        String content = pro.getProperty("Content");
        String title = pro.getProperty("Title");
        String image_Path = pro.getProperty("ImagePath");
        String link = pro.getProperty("Link");
//        System.out.println(filePath+","+link+","+title+",");
        in.close();
        ShareItem item = new ShareItem(type, title, content, image_Path, link);
        return item;
    }

    /*
        分享的方法
     */
    public static void share(ShareItem item, ShareListener listener) {
        //
        if (item != null) {
            if (item.type == TYPE_TXT) {
                //分享链接
                if (!TextUtils.isEmpty(item.link) && !TextUtils.isEmpty(item.title)) {
                    doShareText(listener, item.link, item.title, item.content);
                } else {
                    if (listener != null) {
                        listener.onCallback(ShareListener.STATE_FAIL, "分享的信息不完整");
                    }
                }
            } else if (item.type == TYPE_MP3) {
                //分享图片
                if (!TextUtils.isEmpty(item.imagePath)) {
                    doShareText(listener, item.imagePath);
                } else {
                    if (listener != null) {
                        listener.onCallback(ShareListener.STATE_FAIL, "分享的信息不完整");
                    }
                }
            } else if (item.type == TYPE_VIDEO) {
                //分享文本
                if (!TextUtils.isEmpty(item.content)) {
                    doShareText(listener, item.content);
                } else {
                    if (listener != null) {
                        listener.onCallback(ShareListener.STATE_FAIL, "分享的信息不完整");
                    }
                }
            } else if (item.type == TYPE_IMAGE) {
                //分享视频
                if (!TextUtils.isEmpty(item.imagePath) && !TextUtils.isEmpty(item.content)) {
                    doShareText(listener, item.imagePath, item.content);
                } else {
                    if (listener != null) {
                        listener.onCallback(ShareListener.STATE_FAIL, "分享的信息不完整");
                    }
                }
            }else{
                System.out.println("不支持类型");
            }
        } else {
            if (listener != null) {
                listener.onCallback(ShareListener.STATE_FAIL, "不支持的分享类型");
            }
        }
    }

    private static void doShareText(ShareListener listener, String... strings) {
        for (String string : strings) {
            System.out.println(string);
        }
        System.out.println(listener.STATE_SUCC);
    }


}
