package cn.itheima.file;

import java.io.File;

/*
    通过过滤器筛选出后缀名为.txt文件
    需要实现FileFilter接口,重写当中的accept()方法
 */
public class MainMethod {
    public static void main(String[] args) {
        File file = new File("d:\\test");
        method01(file);
        /*System.out.println("=========");
        getAllTxt(file);
        System.out.println("=========");
        getAllTxt02(file);*/
    }

    /*
        定义一个方法,用来遍历路径下.txt的文件
     */
    public static void method01(File file){
        File[] files = file.listFiles(new MyFilterImpl());
        for (File txtFiles : files) {
            System.out.println(txtFiles);
        }
    }

    /*
        定义一个方法用来遍历全目录下所有.txt的文件,包括路径下文件夹下面的.txt
     */
    public static void getAllTxt(File file){
        File[] files = file.listFiles();
        for (File f : files) {
            if(f.isDirectory()){
                getAllTxt(f);
            }else{
                String string = f.getName();
                if(string.endsWith(".txt")){
                    System.out.println(f);
                }
            }
        }
    }

    /*
        使用FileFilter接口来实现遍历全目录下的所有.txt文件
     */
    public static void getAllTxt02(File file){
        File[] files = file.listFiles(new MyFilterImpl());
        for (File f : files) {
            if(f.isDirectory()){
                getAllTxt02(f);
            }else{
                System.out.println(f);
            }
        }
    }

}
