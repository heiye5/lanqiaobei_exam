package practice.basics;

import java.util.Scanner;

/**
 * 试题 基础练习 序列求和
 * 问题描述
 * 求1+2+3+...+n的值。
 * 输入格式
 * 输入包括一个整数n。
 * 输出格式
 * 输出一行，包括一个整数，表示1+2+3+...+n的值。
 * 样例输入
 * 4
 * 样例输出
 * 10
 * 样例输入
 * 100
 * 样例输出
 * 5050
 */

public class XuLieQiuHe {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        long n = sca.nextLong();
        long sum = 0;
        for(long i=1;i<=n;i++){
            sum += i;
        }
        System.out.println(sum);
    }
}
