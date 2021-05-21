package niuke;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 最小差值
 * 题目描述
 * 给你一个数组aa，请你求出数组a中任意两个元素间差的绝对值的最小值。(2\leq len(a) \leq 10^3)(2≤len(a)≤10
 * 3
 *  )
 * 示例1
 * 输入
 * [1,2,4]
 * 返回值
 * 1
 * 示例2
 * 输入
 * [1,3,1]
 * 返回值
 * 0
 * 备注:
 * a_ia
 * i
 * ​
 *  在int范围内，且保证答案在int范围内
 */

public class NC657_MinDiff {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int n = sca.nextInt();
        int a[] = new int[n];

        for(int i=0;i<n;i++){
            a[i] = sca.nextInt();
        }
        int re = minDifference(a);
        System.out.println(re);
    }

    public static int minDifference (int[] a) {
        long min = Long.MAX_VALUE;
        Arrays.sort(a);
        for(int i=0;i<a.length-1;i++){
            min = Math.min(min,(long)a[i+1] - (long)a[i]);
        }

        return (int)min;
    }
}
