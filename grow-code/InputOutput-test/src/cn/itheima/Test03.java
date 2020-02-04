package cn.itheima;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Test03 {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\38404\\Desktop\\share\\in.txt");
        FileInputStream fis = new FileInputStream(file);
        BufferedReader br = new BufferedReader(new InputStreamReader(fis,"utf8"));
        String line ;
        ArrayList<String> list = new ArrayList<>();
        while((line = br.readLine())!=null){
            System.out.println(line);
            list.add(line);
        }
        Collections.sort(list);
        for (String s : list) {
            System.out.println(s);
        }

        br.close();
    }
}
