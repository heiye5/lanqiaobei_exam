package niuke;

import java.util.Scanner;

/**
 * 斐波那契数列
 * 题目描述
 * 大家都知道斐波那契数列，现在要求输入一个整数n，请你输出斐波那契数列的第n项（从0开始，第0项为0，第1项是1）。
 * n\leq 39n≤39
 *
 * 示例1
 * 输入
 * 复制
 * 4
 * 返回值
 * 复制
 * 3
 */

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int n = sca.nextInt();
        int re = getFibonacci(n);
        System.out.println(re);
    }

    public static int getFibonacci(int n) {
        int a[] = new int[40];
        a[0] = 0;
        a[1] = 1;
        for(int i=2;i<40;i++){
            a[i] = a[i-1] + a[i-2];
            if(i == n){
                return a[n];
            }
        }
        return a[n];
    }
}
