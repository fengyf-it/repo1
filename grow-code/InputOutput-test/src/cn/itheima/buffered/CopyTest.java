package cn.itheima.buffered;

import java.io.*;

/*
    比较字节流读写字节文件,以及加上缓冲流的速度变化
 */
public class CopyTest {
    public static void main(String[] args) throws IOException{
        long s = System.currentTimeMillis();
//        copyMethod01(new File("d:\\test\\a.exe"),new File("d:\\test\\test01\\a.exe"));
//        copyMethod02(new File("d:\\test\\a.exe"),new File("d:\\test\\test02\\a.exe"));  //105
//        copyMethod02(new File("d:\\test\\a.exe"),new File("d:\\test\\test03\\a.exe")); //136
        copyMethod04(new File("d:\\test\\a.exe"),new File("d:\\test\\test04\\a.exe"));//125
        long e = System.currentTimeMillis();
        System.out.println(e-s);
    }

    /*
        使用一个字节进行字节流的读写
     */
    public static void copyMethod01(File src,File desc) throws IOException {
        FileInputStream fis = new FileInputStream(src);
        FileOutputStream fos = new FileOutputStream(desc);
        int len =0;
        while ((len=fis.read())!=-1){
            fos.write(len);
        }
        fos.close();
        fis.close();
    }

    /*
        是用字节数组来进行字节流的读写
     */
    public static void copyMethod02(File src,File desc) throws IOException{
        FileInputStream fis = new FileInputStream(src);
        FileOutputStream fos = new FileOutputStream(desc);
        int len =0;
        byte[] bytes = new byte[1024];
        while ((len=fis.read(bytes))!=-1){
            fos.write(bytes,0,len);
        }
        fos.close();
        fis.close();
    }

    /*
        使用一个字节,加上缓冲流进行字节流的读写
     */
    public static void copyMethod03(File src,File desc) throws IOException{
        FileInputStream fis = new FileInputStream(src);
        FileOutputStream fos = new FileOutputStream(desc);
        BufferedInputStream bis = new BufferedInputStream(fis);
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        int len=0;
        while ((len=bis.read())!=-1){
            bos.write(len);
            bos.flush();
        }
        bos.close();
        bis.close();
    }

    /*
        使用字节数组,添加缓冲流进行字节流的读写
     */
    public static void copyMethod04(File src,File desc) throws IOException{
        FileInputStream fis = new FileInputStream(src);
        FileOutputStream fos = new FileOutputStream(desc);
        BufferedInputStream bis = new BufferedInputStream(fis);
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        int len=0;
        byte[] bytes = new byte[1024];
        while ((len=bis.read(bytes))!=-1){
            bos.write(bytes,0,len);
            bos.flush();
        }
        bos.close();
        bis.close();
    }
}
