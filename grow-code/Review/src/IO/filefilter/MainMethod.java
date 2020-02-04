package IO.filefilter;

import java.io.File;

/*
    筛选出目的路经下的所有.txt文件
 */
public class MainMethod {
    public static void main(String[] args) {
        File file = new File("d:\\test");
        getAllDirs(file);
    }

    /*
        使用过滤器,筛选出d:\\test路径下的所有.txt文件
     */
    public static void getAllDirs(File file){
        File[] files = file.listFiles(new FilterImpl());
        for (File file1 : files) {
            if(file1.isDirectory()){
                getAllDirs(file1);
            }else{
                System.out.println(file1);
            }
        }
    }
    /*
        不通过过滤器,进行筛选
     */
    public static void getAllDirs02(File file){
        File[] files = file.listFiles();
        for (int i = 0; i < files.length; i++) {
            if(files[i].isDirectory()){
                getAllDirs(files[i]);
            }
            if(files[i].getName().endsWith(".txt")){
                System.out.println(files[i]);
            }
        }
    }


}
