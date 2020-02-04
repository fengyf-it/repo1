package Thread.maibaozi;

public class MainMethod {
    public static void main(String[] args) {
        BaoZi baoZi = new BaoZi();
        baoZi.setFlag(true);

        Productor productor = new Productor(baoZi);
        Customer customer = new Customer(baoZi);
        Thread t1 = new Thread(productor);
        Thread t2 = new Thread(customer);


        t1.start();
        t2.start();
    }
}
