package practice.test;

import java.util.Scanner;

/**
 * 试题 历届试题 字串排序
 *  问题描述
 * 小蓝最近学习了一些排序算法，其中冒泡排序让他印象深刻。
 *
 * 在冒泡排序中，每次只能交换相邻的两个元素。
 *
 * 小蓝发现，如果对一个字符串中的字符排序，只允许交换相邻的两个字符，则在所有可能的排序方案中，冒泡排序的总交换次数是最少的。
 *
 * 例如，对于字符串 lan 排序，只需要  次交换。对于字符串 qiao 排序，总共需要  次交换。
 *
 * 小蓝的幸运数字是 ，他想找到一个只包含小写英文字母的字符串，对这个串中的字符进行冒泡排序，正好需要  次交换。请帮助小蓝找一个这样的字符串。如果可能找到多个，请告诉小蓝最短的那个。如果最短的仍然有多个，请告诉小蓝字典序最小的那个。请注意字符串中可以包含相同的字符。
 *
 * 输入格式
 * 输入一行包含一个整数 ，为小蓝的幸运数字。
 *
 * 输出格式
 * 输出一个字符串，为所求的答案。
 *
 * 样例输入
 * 4
 * 样例输出
 * bbaa
 *
 * 样例输入
 * 100
 * 样例输出
 * jihgfeeddccbbaa
 */

public class PREV_67ZiChuanPaiXu {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int v = sca.nextInt();
        bubbleSort(v);

    }

    //冒泡排序
    private static void bubbleSort(int n){
        if(n == 0){
            return;
        }
        char en[] = new char[26];
        for(int i=0;i<26;i++){
            en[i] =(char)(97+i);
        }

        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                if(en[i] > en[j]){
                    char t = en[i];
                    en[i] = en[j];
                    en[j] = t;
                }
            }
        }

        for(int i=0;i<n;i++){
            System.out.println(en[i] + " ");
        }
    }
}
