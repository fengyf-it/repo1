package Thread.maibaozi;

public class Customer implements Runnable{
    BaoZi baoZi;

    public Customer() {
    }

    public Customer(BaoZi baoZi) {
        this.baoZi = baoZi;
    }

    @Override
    public void run() {
        while(true){
            synchronized (baoZi){
                //如果flag为true,则有包子,那么开吃,否则等待
                if(!baoZi.isFlag()){
                    try {
                        baoZi.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("开始吃:"+baoZi.getPier()+baoZi.getXianer()+"的包子");
                System.out.println("=============");
                //吃完之后让生产者继续生产
                baoZi.setFlag(false);
                baoZi.notify();
            }
        }
    }
}
