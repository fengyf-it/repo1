package cn.itheima;

import java.io.*;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test02 {
    public static void main(String[] args) throws IOException {
        Map<String,String> map = new HashMap<>();
        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\38404\\Desktop\\share\\in.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\38404\\Desktop\\share\\out02.txt"));
        String line ;
        while((line = br.readLine())!=null){
            String[] split = line.split("\\.");
            if(split[0].startsWith("\uFEFF")) {
                split[0] = split[0].replace("\uFEFF", "");
            }
            map.put(split[0],split[1]);
        }

        Set<String> strings = map.keySet();
        for (String string : strings) {
            String str = string +"."+ map.get(string);
            bw.write(str);
//                System.out.println(string+map.get(string));
                //line = line.substring(1);
//            System.out.println(string+map.get(string));
//            System.out.println(new String(string.getBytes("utf8"),"utf8"));
        }
        bw.close();

    }
}
