package cn.itheima.copy;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
    将数据源d:\\test\\c.txt
    复制到 d:\\test\\test01\\c.txt
    字节输入流绑定数据源(d:\\test\\c.txt)
    字节输出流,绑定数据目的地(d:\\test\\test01\\c.txt)
 */
public class CopyDemo01 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = null;
        FileOutputStream fos = null;
//        copyMethod01(fis, fos);
        copyMethod02(fis,fos);
    }

    /*
        定义一个方法用来读写和写入
        一个字节一个字节读写写入
     */
    /*public static void copyMethod01(FileInputStream fis, FileOutputStream fos) {
        try {
            fis = new FileInputStream("d:\\test\\c.txt");  //读取数据源的内容
            fos = new FileOutputStream("d:\\test\\test01\\c.txt");  //写入
            int len = 0;
            while ((len = fis.read()) != -1) {
                fos.write(len);
            }
        } catch (IOException ex) {
            System.out.println(ex);
            throw new RuntimeException("复制失败");
        } finally {
            try {
                if (fos != null)
                    fos.close();
            } catch (IOException ex) {
                throw new RuntimeException("关闭fos失败");
            } finally {
                try {
                    if (fis != null)
                        fis.close();
                } catch (IOException ex) {
                    throw new RuntimeException("关闭fis失败");
                }
            }
        }
    }*/

    /*
        定义一个方法用来读写和写入
        用字节数组来进行
     */
    public static void copyMethod02(FileInputStream fis, FileOutputStream fos) {
        try {
            fis = new FileInputStream("d:\\test\\a.zip");
            fos = new FileOutputStream("d:\\test\\test03\\a.zip");
            byte[] bytes = new byte[1024];
            int len = 0;
            while ((len=fis.read(bytes))!=-1){
                fos.write(bytes,0,len);
            }
        } catch (IOException ex) {
            System.out.println(ex);
            throw new RuntimeException("复制失败");
        } finally {
            try {
                if (fos != null)
                    fos.close();
            } catch (IOException ex) {
                throw new RuntimeException("关闭fos失败");
            } finally {
                try {
                    if (fis != null)
                        fis.close();
                } catch (IOException ex) {
                    throw new RuntimeException("关闭fis失败");
                }
            }
        }
    }
}
