package cn.itheima.exception.demo01;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        if(age<0||age>200){
            throw new NoAgeException(age + " 年龄赋值出现异常请检查");
        }
        this.name = name;
        this.age = age;
    }

    public Person() {

    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
