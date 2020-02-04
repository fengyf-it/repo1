package IO;

public class DiGui {
    public static void main(String[] args) {

        System.out.println(sum(100));
    }

    public static int sum(int a){
        if(a==0){
            return a;
        }
        return a + sum(a-1);
    }
}
