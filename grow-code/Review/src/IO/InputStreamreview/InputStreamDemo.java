package IO.InputStreamreview;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class InputStreamDemo {
    public static void main(String[] args) throws IOException {
        File file = new File("d:\\test\\a.txt");
        method02(file);
    }

    /*
        一个字节一个字节的读取
     */
    public static void method(File file) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(file);
            int len = 0;
            while ((len = fis.read()) != -1) {
                System.out.print((char) len);
            }
        } catch (IOException ex) {
            throw new RuntimeException("读取失败");
        } finally {
            try {
                if (fis != null)
                    fis.close();
            } catch (IOException ex) {
                throw new RuntimeException("资源关闭失败");
            }
        }
    }

    /*
        通过字节数组进行读取
     */
    public static void method02(File file) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(file);
            byte[] bytes = new byte[1024];
            int len = 0;
            while((len=fis.read(bytes))!=-1){
                System.out.println(new String(bytes,0,len));
            }
        } catch (IOException ex) {
            throw new RuntimeException("复制失败");
        } finally {
            try {
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
