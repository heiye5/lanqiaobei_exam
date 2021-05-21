package exam;

/**
 * 用数组来求Fibonacci数列问题，
 * 打印前20项数列，每行打印4个数。
 */

public class Fibonacci_Ch5_1 {
    public static void main(String[] args) {
        int f[]=new int[20];
        f[0]=1;
        f[1]=1;
        for(int i=2;i<20;i++){
            f[i] = f[i-1] + f[i-2];
        }
        for(int i=0;i<20;i++){
            System.out.printf("%12d",f[i]);

            if((i+1)%4==0)
                System.out.println();
        }
    }
}
