package cn.itheima.properties.demo01;

import java.io.*;

public class PropertiesDemo02 {
    public static void main(String[] args) throws IOException,ClassNotFoundException {
//        method01();
        method02();
    }

    /*
        序列化方法
     */
    public static void method01() throws IOException{
        FileOutputStream fos = new FileOutputStream("d:\\test\\person.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        Person person = new Person("张三",18);
        oos.writeObject(person);
        oos.close();
    }

    /*
        反序列化
     */
    public static void method02() throws IOException,ClassNotFoundException{
        FileInputStream fis = new FileInputStream("d:\\test\\person.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Object obj = ois.readObject();
        Person person = (Person) obj;

        System.out.println(person);
        ois.close();
    }

}
