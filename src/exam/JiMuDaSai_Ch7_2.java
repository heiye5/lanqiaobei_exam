package exam;

import java.util.Scanner;

/**
 * 标题：积木大赛
 * 题目描述
 * 春春幼儿园举办了一年一度的“积木大赛”。今年比赛的内容是搭建一座宽度为n的大厦，
 * 大厦可以看成由n块宽度为1的积木组成，第i块积木的最终高度需要是hi。
 *
 * 在搭建开始之前，没有任何积木（可以看成nn块高度为0的积木）。
 * 接下来每次操作，小朋友们可以选择一段连续区间[l, r]，
 * 然后将第第 L 块到第 R块之间（含第 L 块和第 R块）所有积木的高度分别增加1。
 *
 * 小 M是个聪明的小朋友，她很快想出了建造大厦的最佳策略，
 * 使得建造所需的操作次数最少。但她不是一个勤于动手的孩子，
 * 所以想请你帮忙实现这个策略，并求出最少的操作次数。
 *
 * 输入格式
 * 包含两行，第一行包含一个整数n，表示大厦的宽度。
 *
 * 第二行包含n个整数，第i个整数为hi。
 *
 * 输出格式
 * 建造所需的最少操作数。
 *
 * 输入输出样例
 * 输入 #1 复制
 * 5
 * 2 3 4 1 2
 * 输出 #1 复制
 * 5
 *
 */

public class JiMuDaSai_Ch7_2 {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int n = sca.nextInt();
        int l = 0;
        int r = 0;
        int count = 0;

        for(int i=0;i<n;i++) {
            l = sca.nextInt();
            if(l > r){
                count += l-r;
            }
            r = l;
        }
        System.out.println(count);
    }
}
