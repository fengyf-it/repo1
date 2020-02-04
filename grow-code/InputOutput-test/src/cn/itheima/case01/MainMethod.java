package cn.itheima.case01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
    对文本进行排序
 */
public class MainMethod {
    public static void main(String[] args) throws Exception{
        Map<String,String> map = new HashMap<>();
        FileReader fr = new FileReader("C:\\Users\\38404\\Desktop\\share\\in.txt");
        FileWriter fw = new FileWriter("C:\\Users\\38404\\Desktop\\share\\out.txt");
        BufferedReader br = new BufferedReader(fr);
        BufferedWriter bw = new BufferedWriter(fw);
        String line;
        while((line = br.readLine())!=null){
            String[] split = line.split("\\.");
            map.put(split[0],split[1]);
        }
        Set<String> keys = map.keySet();
        for (String key : keys) {
            line = key + "."+map.get(key);
//            System.out.println(line);
            bw.write(line);
            bw.newLine();
        }


        bw.close();
        br.close();
    }
}
