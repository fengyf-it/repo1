package cn.itheima.file;

/*
    使用递归来计算1+...100;
 */
public class DiGuiDemo {
    public static void main(String[] args) {
        int sum = diGuiMethod(100);
        System.out.println(sum);
    }

    public static int diGuiMethod(int n){
        if(n==1)
            return 1;
        return n+diGuiMethod(n-1);
    }
}
