package IO.demo01;

import java.io.File;

public class Demo01 {
    public static void main(String[] args) {
        File file = new File("d:\\test\\zz");
        boolean b1 = file.mkdir();
        System.out.println(b1);
    }
}
