package cn.itheima.printwriter;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterDemo {
    public static void main(String[] args) throws IOException{
        method();
    }

    public static void method()throws IOException {
        FileOutputStream fos = new FileOutputStream("d:\\test\\f.txt");
        PrintWriter pw = new PrintWriter(fos,true);
        pw.println("I");
        pw.println("Love");
        pw.println("Java");

    }
}
