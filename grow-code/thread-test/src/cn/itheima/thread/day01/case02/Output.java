package cn.itheima.thread.day01.case02;

public class Output implements Runnable {
    private Person person;

    public Output(Person person) {
        this.person = person;
    }

    @Override
    public void run() {
        while (true){
            synchronized (person) {
                if(!person.flag){
                    try {
                        person.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(person.name + "--" + person.sex);
                person.flag=false;
                person.notify();
            }
        }
    }
}
