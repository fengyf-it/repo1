package cn.itheima.FileInputStream;

import java.io.FileInputStream;
import java.io.IOException;

/*
    字节流读取文件
 */
public class FileInputStreamDemo01 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("d:\\test\\b.txt");
        int len = 0 ;//用来接收read()的返回值
        while((len=fis.read())!=-1){
            System.out.print((char)len);
        }
        fis.close();
    }
}
