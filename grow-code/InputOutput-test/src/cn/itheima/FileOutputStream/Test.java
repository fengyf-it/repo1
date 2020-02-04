package cn.itheima.FileOutputStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        /*FileOutputStream fos = new FileOutputStream("d:\\test\\jkl.txt");
        fos.write(97);
        fos.close();*/
        /*FileWriter fw = new FileWriter("d:\\test\\fw.txt");
        fw.write("abc");
        fw.close();*/
        FileInputStream fis = new FileInputStream("d:\\test\\fw.txt");
        FileOutputStream fos = new FileOutputStream("d:test\\xy.txt");
        int temp;
        while((temp=fis.read())!=-1){
            fos.write(temp);
        }
        fos.close();
        fis.close();
    }
}
