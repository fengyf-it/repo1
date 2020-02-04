package cn.itheima;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Test {
    public static void main(String[] args) throws IOException {
        ArrayList<String> list = new ArrayList<>();
        FileReader fr = new FileReader("C:\\Users\\38404\\Desktop\\share\\in.txt");
//        FileWriter fw = new FileWriter("C:\\Users\\38404\\Desktop\\share\\out02.txt");

        BufferedReader br = new BufferedReader(fr);
//        BufferedWriter bw = new BufferedWriter(fw);
        String line ;
        while((line = br.readLine())!=null){
            String line1 = new String(line.getBytes("gbk"),"gbk");
            list.add(line1);
        }
        br.close();
        for (String s : list) {
            System.out.println(s);
        }
        System.out.println("==============");
//        Collections.sort(list);

        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.charAt(0)-o2.charAt(0);
            }
        });
        for (String s : list) {
            System.out.println(s);
        }
    }

}
