package cn.itheima.OutputStreamWriter;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class OutputStreamWriterDemo01 {
    public static void main(String[] args) throws IOException{
        writeGbk();
        writeUtf();
    }


    /*
        转换流对象OutputStreamWriter写文本
        文本采用gbk格式
     */
    public static void writeGbk() throws IOException {
        FileOutputStream fos = new FileOutputStream("d:\\test\\gbk.txt");
        OutputStreamWriter osw = new OutputStreamWriter(fos,"gbk");
        osw.write("你好");
        osw.close();
    }

    /*
        转换流对象OutputStreamWriter写文本
        文本采用utf-8格式
     */
    public static void writeUtf() throws IOException {
        FileOutputStream fos = new FileOutputStream("d:\\test\\Utf.txt");
        OutputStreamWriter osw = new OutputStreamWriter(fos,"utf-8");
        osw.write("你好");
        osw.close();
    }

}
