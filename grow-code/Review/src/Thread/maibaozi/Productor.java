package Thread.maibaozi;

/*
    生产者类
    包子有没有是包子的事情,所以包子的对象要在主方法中去定义
 */
public class Productor implements Runnable {

    BaoZi baoZi;

    public Productor() {
    }

    public Productor(BaoZi baoZi) {
        this.baoZi = baoZi;
    }

    @Override
    public void run() {
        int count = 0;
        while (true) {
            synchronized (baoZi) {
                //flag为true则有包子不生产
                if(baoZi.isFlag()){
                    try {
                        baoZi.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                if(count%2==0){
                    baoZi.setPier("米皮");
                    baoZi.setXianer("五仁");
                }else{
                    baoZi.setXianer("豆沙");
                    baoZi.setPier("粽子");
                }
                System.out.println("生产了:"+baoZi.getPier()+baoZi.getXianer()+"的包子");

                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                baoZi.setFlag(true);
                baoZi.notify();
                count++;
            }
        }
    }
}
