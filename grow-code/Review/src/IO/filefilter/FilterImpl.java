package IO.filefilter;


import java.io.File;
import java.io.FileFilter;

/*
    实现过滤器接口,重写当中的方法
 */
public class FilterImpl implements FileFilter {

    @Override
    public boolean accept(File pathname) {
        if(pathname.isDirectory()){
            return true;
        }
        return pathname.getName().endsWith(".txt");
    }
}
