package niuke;

import java.util.Scanner;

/**
 * 寻找峰值
 * 题目描述
 * 山峰元素是指其值大于或等于左右相邻值的元素。给定一个输入数组nums，任意两个相邻元素值不相等，数组可能包含多个山峰。找到索引最大的那个山峰元素并返回其索引。
 *
 * 假设 nums[-1] = nums[n] = -∞。
 *
 * 示例1
 * 输入
 * [2,4,1,2,7,8,4]
 * 返回值
 * 5
 */

public class NC107_ShanFeng {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int n = sca.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++){
            a[i] = sca.nextInt();
        }
        int re = solve(a);
        System.out.println(re);
    }

    public static int solve (int[] a) {
        int re = -1;
        for(int i=a.length-1;i>=0;i--){
            if(a[i] > a[i-1]){
                return i;
            }
        }

        return re;
    }
}
