package practice.test;

import java.util.Scanner;

/**
 * 试题 历届试题 核桃的数量
 *
 * 问题描述
 * 小张是软件项目经理，他带领3个开发组。工期紧，今天都在加班呢。为鼓舞士气，小张打算给每个组发一袋核桃（据传言能补脑）。他的要求是：
 *
 * 1. 各组的核桃数量必须相同
 *
 * 2. 各组内必须能平分核桃（当然是不能打碎的）
 *
 * 3. 尽量提供满足1,2条件的最小数量（节约闹革命嘛）
 *
 * 输入格式
 * 输入包含三个正整数a, b, c，表示每个组正在加班的人数，用空格分开（a,b,c<30）
 * 输出格式
 * 输出一个正整数，表示每袋核桃的数量。
 * 样例输入1
 * 2 4 5
 * 样例输出1
 * 20
 * 样例输入2
 * 3 1 1
 * 样例输出2
 * 3
 */

public class PREV_1_HeTaoDeShuLiang {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int a = sca.nextInt();
        int b = sca.nextInt();
        int c = sca.nextInt();

        int max = getMax(a,b,c);
        int lcm = getLCM(a,b,c,max);

        System.out.println(lcm);

    }

    //最小公倍数
    private static int getLCM(int a, int b, int c, int max) {
        for(int i=max;;i++){
            if(i % a == 0 && i % b == 0 && i % c == 0){
                return i;
            }
        }
    }

    //最大值
    private static int getMax(int a, int b, int c) {
        return a > (b > c ? b : c) ? a : (b > c ? b : c);
    }
}
