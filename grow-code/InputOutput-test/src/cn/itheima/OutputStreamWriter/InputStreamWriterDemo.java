package cn.itheima.OutputStreamWriter;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamWriterDemo {
    public static void main(String[] args) throws IOException{
        reader();
    }

    /*
        通过转换流读取文件
     */
    public static void reader() throws IOException {
        FileInputStream fis = new FileInputStream("d:\\test\\jh.txt");
        InputStreamReader isr = new InputStreamReader(fis,"gbk");
        char[] chars = new char[1024];
        int len = 0;
        while ((len=isr.read(chars))!=-1){
            System.out.print(new String(chars,0,len));
        }
        isr.close();
    }
}
