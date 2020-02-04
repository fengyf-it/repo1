package cn.itheima.collection.demo02;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int hashCode() {
        return name.hashCode() + age;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj ==null){
            return false;
        }
        if(this == obj){
            return true;
        }
        if(obj instanceof Person){
            Person person = (Person) obj;
            return name.equals(person.name)&&age == person.age;
        }
        return false;
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
