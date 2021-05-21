package competition;

import java.util.Scanner;

/**
 *
 * 斐波那契的兔子
 * 题目描述
 * 卡卡开始养兔子了！妈妈给他买了一对刚出生的兔子，卡卡了解到兔子的繁殖规律是这样的：才出生的一对兔子在一个月后将第一次生出一胎 aa 对兔子，接着在出生后的二个月又将生出 bb 对兔子，在第三个月和以后每个月都会繁殖 cc 对兔子（a \le b \le ca≤b≤c）。 由斐波纳契数列我们知道兔子的繁殖速度是很快的，然而卡卡有兔子一样多的好朋友，卡卡想在 mm 个月后有 kk 对兔子，以便分给他们的好友，他的愿望是否能够实现呢？
 *
 * [任务] 编写一个程序：计算 mm 个月后卡卡将有多少对兔子，设之为 PP；计算如果 mm 个月后卡卡要拥有至少 kk 对兔子，那么开始时妈妈至少应该为卡卡购买多少对兔子，设之为 QQ 。
 *
 * 输入描述
 * 输入第一行有四个正整数：aa，bb，cc 和 mm；而第二行则仅含一个正整数 kk。它们的含义见上文描述。
 *
 * 其中，0 \le a \le b \le c \le 1000≤a≤b≤c≤100，1 \le m \le 30001≤m≤3000，1 \le k \le 10^{6000}1≤k≤10
 * 6000
 *  。。
 *
 * 输出描述
 * 输出两行，第一行是一个整数 PP 而第二行是一个整数 QQ。
 *
 * 输入输出样例
 * 示例 1
 * 输入
 *
 * 0 1 1 10
 * 10000
 * copy
 * 输出
 *
 * 89
 * 113
 */

public class FibonacciTuZi {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int a = sca.nextInt();              //一个月后第一次出生的a对兔子
        int b = sca.nextInt();              //出生后的二个月又将生出 b 对兔子
        int c = sca.nextInt();              //第三个月和以后每个月都会繁殖 c 对兔子
        int m = sca.nextInt();              //m 个月后
        int k = sca.nextInt();              // mm 个月后的k 对兔子

        int arr[] = new int[45];
        arr[0] = a;
        arr[1] = b;
        for(int i=0;i<45;i++){
            arr[i] = arr[i-1] + arr[i-2];
        }

        for(int i=0;i<45;i++){
            System.out.print(arr[i] + " ");
        }

    }
}
