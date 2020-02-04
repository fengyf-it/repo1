package cn.itheima.FileOutputStream;

import java.io.FileOutputStream;
import java.io.IOException;

/*
    字节输出流当中的异常处理
 */
public class IOExceptionDemo {
    public static void main(String[] args) {
        FileOutputStream fos = null;
        try{
            fos = new FileOutputStream("d:\\test\\b.txt");
            fos.write("HelloWorld".getBytes());
        }catch(IOException ex){
            System.out.println(ex);
            throw new RuntimeException("写入失败");
        }finally {
            try{
                if(fos!=null)
                    fos.close();
            }catch(IOException ex){
                throw new RuntimeException("关闭资源失败");
            }
        }
    }
}
