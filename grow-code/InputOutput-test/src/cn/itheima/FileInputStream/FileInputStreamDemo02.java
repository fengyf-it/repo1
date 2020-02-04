package cn.itheima.FileInputStream;

import java.io.FileInputStream;
import java.io.IOException;

/*
    通过字节数组来读取,提升效率
 */
public class FileInputStreamDemo02 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("d:\\test\\c.txt");
        byte[] bytes = new byte[2];
        int len = 0;
        while ((len=fis.read(bytes))!=-1){
            System.out.print(new String(bytes,0,len));
        }
    }
}
