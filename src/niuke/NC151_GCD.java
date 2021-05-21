package niuke;

import java.util.Scanner;

/**
 * 最大公约数
 * 题目描述
 * 求出两个数的最大公约数，如果有一个自然数a能被自然数b整除，则称a为b的倍数，b为a的约数。几个自然数公有的约数，叫做这几个自然数的公约数。公约数中最大的一个公约数，称为这几个自然数的最大公约数。
 * 示例1
 * 输入
 * 3,6
 * 返回值
 * 3
 * 示例2
 * 输入
 * 8,12
 * 返回值
 * 4
 */

public class NC151_GCD {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int a = sca.nextInt();
        int b = sca.nextInt();

        int  re = gcd(a,b);
        System.out.println(re);
    }

    public static int gcd (int a, int b) {

        while(b != 0){
            int t = a%b;
            a = b;
            b = t;
        }

        return a;
    }
}
