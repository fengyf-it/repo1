package IO.filefilter02;

import java.io.File;
import java.io.FileFilter;

public class MyFileFilter implements FileFilter {
    @Override
    public boolean accept(File file) {
        return file.isFile();
    }
}
