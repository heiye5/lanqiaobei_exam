package exam;

import java.util.Scanner;

/**
 * 连续因子
 *
 * 一个正整数 N 的因子中可能存在若干连续的数字。
 * 例如 630 可以分解为 3×5×6×7，其中 5、6、7 就是 3 个连续的数字。
 * 给定任一正整数 N，要求编写程序求出最长连续因子的个数，并输出最小的连续因子序列。
 *
 * 输入格式：
 * 输入在一行中给出一个正整数 N（1<N<2​31）。
 *
 * 输出格式：
 * 首先在第 1 行输出最长连续因子的个数；然后在第 2 行中按 因子1因子2……*因子k 的格式输出最小的连续因子序列，其中因子按递增顺序输出，1 不算在内。
 *
 * 输入样例：
 * 630
 *
 * 输出样例：
 * 3
 * 567
 *
 */

public class LianXuYinZi_Ch7_5 {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int n = sca.nextInt();
        int count = 0;       //计数
        int start = 0;      //记录起始位置
        int maxCount = 0;   //最大的因子个数

        for(int i=2;i<=Math.sqrt(n);i++){
            count = 0;
            int t = n;
            int j = i;
            while(t % j == 0){
                t /= j;
                j++;
                count++;
            }
            if(count > maxCount){
                start = i;
                maxCount = count;
            }
        }
        if(maxCount != 0){
            System.out.println(maxCount);
            for(int i=0;i<maxCount;i++){
                System.out.print(start+i);
                if(i != maxCount - 1){
                    System.out.print("*");
                }
            }
        }else{
            System.out.println("1\n" + n);
        }
    }
}
