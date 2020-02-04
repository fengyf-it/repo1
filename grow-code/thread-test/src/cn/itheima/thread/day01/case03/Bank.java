package cn.itheima.thread.day01.case03;

public class Bank implements Runnable{
    private int moneyAll;
    private int sumMoney;
    private Person person;

    public Bank( Person person) {
        this.person = person;
    }

    @Override
    public void run() {
        for(int i=0;i<10;i++){
            sumMoney += person.getMoney();

            System.out.println(person.getName()+":"+sumMoney);
        }
        moneyAll += sumMoney;
        System.out.println(person.getName() + "总共存了:"+sumMoney);
        System.out.println(moneyAll);
    }
}
