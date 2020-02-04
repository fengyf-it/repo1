package test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class MainMethod {
    public static void main(String[] args) throws Exception{
        Class clazz = Class.forName("test.Person");
        System.out.println(clazz);
        
        Constructor con = clazz.getConstructor(String.class,int.class);
        System.out.println(con);
        
        Object obj = con.newInstance("张三", 18);
        System.out.println(obj);
        /*
        Person person = (Person) obj;
        person.name="李四";
        person.age=19;
        System.out.println(person);*/
        Field field = clazz.getField("age");
        System.out.println(field);
        field.set(obj,22);
        System.out.println(obj);
    }
}
