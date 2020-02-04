package cn.itheima.writerreader;

import java.io.FileReader;
import java.io.IOException;

public class ReaderDemo {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("d:\\test\\a.txt");
        int len = 0;
        while ((len = fr.read()) != -1) {
            System.out.print((char) len);
        }
        fr.close();
    }
}
