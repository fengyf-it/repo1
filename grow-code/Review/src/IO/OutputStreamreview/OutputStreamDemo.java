package IO.OutputStreamreview;

import java.io.FileOutputStream;
import java.io.IOException;

/*
    字节输出流
 */
public class OutputStreamDemo {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("d:\\test\\h.txt");
        fos.write("易燃易爆炸".getBytes());
        fos.close();
    }
}
