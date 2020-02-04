package cn.itheima.Review.demo01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
    使用IO,复制一张图片 从源到目的
 */
public class Demo01 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        FileOutputStream fos = null;

        try {
            fis = new FileInputStream("d:\\test\\a.png");
            fos = new FileOutputStream("d:\\test\\test01\\c.png");
            byte[] bytes = new byte[1024];
            int len = 0;
            while ((len =fis.read(bytes))!=-1){
                fos.write(bytes,0,len);
            }
        } catch (IOException ex) {
            throw new RuntimeException("复制失败");
        } finally {
            try {
                if(fos!=null)
                    fos.close();
            } catch (IOException e) {
                throw new RuntimeException("关闭资源失败");
            }finally {
                try{
                    if(fis!=null)
                        fis.close();
                }catch (IOException ex){
                    throw new RuntimeException("关闭资源失败");
                }
            }
        }
    }
}
