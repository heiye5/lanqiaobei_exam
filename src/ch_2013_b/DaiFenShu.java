package ch_2013_b;

import java.util.Scanner;

import static jdk.nashorn.internal.objects.Global.print;

/**
 * 标题：带分数
 * 问题描述
 * 100 可以表示为带分数的形式：100 = 3 + 69258 / 714。
 *
 * 还可以表示为：100 = 82 + 3546 / 197。
 *
 * 注意特征：带分数中，数字1~9分别出现且只出现一次（不包含0）。
 *
 * 类似这样的带分数，100 有 11 种表示法。
 *
 * 输入格式
 * 从标准输入读入一个正整数N (N<1000*1000)
 *
 * 输出格式
 * 程序输出该数字用数码1~9不重复不遗漏地组成带分数表示的全部种数。
 *
 * 注意：不要求输出每个表示，只统计有多少表示法！
 *
 * 样例输入1
 * 100
 * 样例输出1
 * 11
 * 样例输入2
 * 105
 * 样例输出2
 * 6
 *
 */

public class DaiFenShu {
    static int count;
    static int n;

    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int arr[] = {1,2,3,4,5,6,7,8,9};
        n = sca.nextInt();

        f(arr,0);
        System.out.println(count);
    }

    //确认某一个排列的第i位,全排列
    private static void f(int arr[],int i) {
        if(i == 9){
            check(arr);
            return;
        }

        for(int j=i;j<arr.length;j++){
            //将第i位和第j为交换
            int t = arr[j];
            arr[j] = arr[i];
            arr[i] = t;

            //移交下一层去确认i+1位
            f(arr,i+1);

            //回溯
            t = arr[j];
            arr[j] = arr[i];
            arr[i] = t;
        }

    }

    //枚举加号和除号的位置
    private static void check(int[] arr) {
        //+前的数最多是7
        for(int i=1;i<=7;i++){
            int num =toInt(arr,0,i);        //加号前面的一段数字
            if(num >= n){
                continue;
            }

            //除号前的字符数
            for(int j=1;j<=8-i;j++){
                int num2 = toInt(arr,i,j);
                int num3 = toInt(arr,i+j,9-i-j);
                if(num2%num3 == 0 && num+num2/num3 == n){
                    count++;
                }
            }
        }
    }

    private static int toInt(int[] arr, int pos, int len) {
        int t=1;
        int count = 0;
        for(int i=pos+len-1;i>=pos;i--){
            count+=arr[i]*t;
            t*=10;
        }
        return count;
    }
}
