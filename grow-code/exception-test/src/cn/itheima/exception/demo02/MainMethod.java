package cn.itheima.exception.demo02;

public class MainMethod {
    public static void main(String[] args) {
        System.out.println(getAvg(90,30,-60));
    }

    public static int getAvg(int...score){
        int sum =0;
        for(int i : score){
            if(i<0)
                throw new NotValueException("分数有误"+i);
            sum +=i;
        }
        return sum/score.length;
    }

}
