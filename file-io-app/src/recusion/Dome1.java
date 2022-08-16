package recusion;

public class Dome1 {
    public static void main(String[] args) {
        System.out.println(f(5));
        int a=1;
        for (int i = 1; i < 6; i++) {
            a=a*i;
        }
        System.out.println(a);
    }
    public static int f(int n){
        if (n==1){
            return 1;
        }else{
            return f(n-1)*n;
        }

    }
}
