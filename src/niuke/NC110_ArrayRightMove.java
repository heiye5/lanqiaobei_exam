package niuke;

import java.util.Scanner;

/**
 * 旋转数组
 * 题目描述
 * 一个数组A中存有N（N&gt0）个整数，在不允许使用另外数组的前提下，将每个整数循环向右移M（M>=0）个位置，即将A中的数据由（A0 A1 ……AN-1 ）变换为（AN-M …… AN-1 A0 A1 ……AN-M-1 ）（最后M个数循环移至最前面的M个位置）。如果需要考虑程序移动数据的次数尽量少，要如何设计移动的方法？
 * 示例1
 * 输入
 * 6,2,[1,2,3,4,5,6]
 * 返回值
 * [5,6,1,2,3,4]
 * 备注:
 * (1<=N<=100,M>=0)
 */

public class NC110_ArrayRightMove {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int n = sca.nextInt();
        int m = sca.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++){
            a[i] = sca.nextInt();
        }

        int re[] = solve(n,m,a);
        for(int i=0,flag=0;i<n;i++,flag++){
            System.out.print(a[i]);
            if(flag < n-1){
                System.out.print(",");
            }
        }
    }

    /**
     * 旋转数组
     * @param n int整型 数组长度
     * @param m int整型 右移距离
     * @param a int整型一维数组 给定数组
     * @return int整型一维数组
     *
     * 三次翻转
     * 假设 n=7且 k=3
     * 原始数组                  : 1 2 3 4 5 6 7
     * 反转所有数字后             : 7 6 5 4 3 2 1
     * 反转前 k 个数字后          : 5 6 7    4 3 2 1
     * 反转后 n-k 个数字后        : 5 6 7    1 2 3 4 --> 结果
     */
    public static int[] solve (int n, int m, int[] a) {
        int k = m % n;
        reverse(a,0,n-1);
        reverse(a,0,k-1);
        reverse(a,k,n-1);

        return a;
    }

    //翻转数组
    private static void reverse(int[] a, int start, int end) {
        for(;start < end;start++,end--){
            int t = a[start];
            a[start] = a[end];
            a[end] = t;
        }
    }
}
