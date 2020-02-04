package cn.itheima.writerreader;

import java.io.FileWriter;
import java.io.IOException;

public class WriterDemo {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("d:\\test\\a.txt");
        fw.write("hello!!!");
        fw.close();
    }
}
