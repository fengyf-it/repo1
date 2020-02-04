package IO.filefilter02;

import java.io.File;

public class MainMethod {
    public static void main(String[] args) {
        File file = new File("d:\\test");

        File[] files = file.listFiles(new MyFileFilter());
        for (File file1 : files) {
            System.out.println(file1);
        }
    }
}
