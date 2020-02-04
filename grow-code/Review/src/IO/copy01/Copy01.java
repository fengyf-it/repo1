package IO.copy01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Copy01 {
    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream("d:\\test\\jihe.txt");
        FileOutputStream fos = new FileOutputStream("d:\\test\\test05\\b.txt");
        byte[] bytes = new byte[1024];
        int len = 0;
        while((len=fis.read(bytes))!=-1){
            fos.write(bytes,0,len);
        }
        fos.close();
        fis.close();
    }
}
