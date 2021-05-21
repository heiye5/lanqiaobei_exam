package practice.test;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * 试题 历届试题 带分数
 *
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
 */

public class PREV_3_DaiFenShu {
    static int n;
    static int count;
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        n = sca.nextInt();
        int arr[] = {1,2,3,4,5,6,7,8,9};

        getFullPermutation(arr,0);

        System.out.println(count);

    }

    //全排列
    private static void getFullPermutation(int[] arr, int k) {
        if(k == 9){
            checkNum(arr);
            return;
        }

        for(int i=k;i<arr.length;i++){
            int t = arr[i];
            arr[i] = arr[k];
            arr[k] = t;

            getFullPermutation(arr,k+1);

            t = arr[i];
            arr[i] = arr[k];
            arr[k] = t;

        }

    }


    private static void checkNum(int[] arr) {
        //全排列遍历
//        for(int i=0;i<arr.length;i++) {
//            System.out.print(arr[i] + " ");
//        }
//        System.out.println();

        for(int i=1;i<=7;i++) {
            int num1 = getNum(arr, 0, i);                 //加号前面的整数
            if (num1 >= n) {
                continue;
            }

            for (int j = 1; j <= 8 - i; j++) {
                int num2 = getNum(arr, i, j);                  //除号前面的整数
                int num3 = getNum(arr, i + j, 9 - i - j);   //除号后面的整数
//
                if (num2 % num3 == 0 && num1 + num2 / num3 == n) {
                    count++;
//                    System.out.println(num1 + " ");
                }
            }
        }

    }

    //将数组的某个数转换为整数,start:最左边,end:最右边
    private static int getNum(int[] arr,int start,int end) {
        int number =  0;
        int t = 1;
        for(int i=start+end-1;i>=start;i--){
            number += arr[i] * t;
            t*=10;

        }

        return number;

    }

}

