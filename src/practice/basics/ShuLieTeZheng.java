package practice.basics;

import java.util.Scanner;

/**
 * 数列特征
 * 问题描述
 * 给出n个数，找出这n个数的最大值，最小值，和。
 *
 * 输入格式
 * 第一行为整数n，表示数的个数。
 *
 * 第二行有n个数，为给定的n个数，每个数的绝对值都小于10000。
 *
 * 输出格式
 * 输出三行，每行一个整数。第一行表示这些数中的最大值，第二行表示这些数中的最小值，第三行表示这些数的和。
 * 样例输入
 * 5
 * 1 3 -2 4 5
 * 样例输出
 * 5
 * -2
 * 11
 */

public class ShuLieTeZheng {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int n = sca.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++){
            a[i] = sca.nextInt();
        }

        int sum = 0;
        int max = a[0];
        int min = a[0];

        for(int i=0;i<n;i++){
            if(a[i] > max){
                max = a[i];
            }
            if(a[i] < min){
                min = a[i];
            }
            sum += a[i];
        }

        System.out.println(max);
        System.out.println(min);
        System.out.println(sum);
    }
}
