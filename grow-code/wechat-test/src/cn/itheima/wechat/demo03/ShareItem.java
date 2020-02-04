package cn.itheima.wechat.demo03;

public class ShareItem {
    int type;  // 类型
    String title;  //标题
    String content;  //内容
    String imagePath;  //图片
    String link;  //

    public ShareItem() {
    }

    @Override
    public String toString() {
        return "ShareItem{" +
                "type=" + type +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", imagePath='" + imagePath + '\'' +
                ", link='" + link + '\'' +
                '}';
    }

    public ShareItem(int type, String title, String content, String imagePath, String link) {
        this.type = type;
        this.title = title;
        this.content = content;
        this.imagePath = imagePath;
        this.link = link;
    }
}
