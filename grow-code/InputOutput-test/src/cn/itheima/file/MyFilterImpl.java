package cn.itheima.file;

import javax.print.DocFlavor;
import java.io.File;
import java.io.FileFilter;

public class MyFilterImpl implements FileFilter {
    @Override
    public boolean accept(File pathname) {
        if(pathname.isDirectory())
            return true;
        return pathname.getName().endsWith(".txt");
    }
}
