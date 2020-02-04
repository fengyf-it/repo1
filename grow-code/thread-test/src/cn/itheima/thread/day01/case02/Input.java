package cn.itheima.thread.day01.case02;

public class Input implements Runnable{
    private Person person ;

    public Input(Person person) {
        this.person = person;
    }

    @Override
    public void run() {
        int i = 0 ;
        while (true){
            synchronized (person){
                if(person.flag){
                    try {
                        person.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                if(i%2==0){
                    person.name = "张三";
                    person.sex = "女";
                }else{
                    person.name = "lisi";
                    person.sex = "nan";
                }
                person.flag = true;
                person.notify();
            }
            i++;
        }
    }
}
