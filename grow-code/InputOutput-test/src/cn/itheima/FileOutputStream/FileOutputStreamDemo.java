package cn.itheima.FileOutputStream;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("d:\\test\\a.txt");
        fos.write("Hello".getBytes());
        fos.write("\r\nWorld!!!".getBytes());
        fos.close();
    }
}
