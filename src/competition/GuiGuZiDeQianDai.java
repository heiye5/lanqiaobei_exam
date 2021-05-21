package competition;

import java.util.Scanner;

/**
 * 题目描述
 * 鬼谷子非常聪明，正因为这样，他非常繁忙，经常有各诸侯车的特派员前来向他咨询时政。
 *
 * 有一天，他在咸阳游历的时候，朋友告诉他在咸阳最大的拍卖行（聚宝商行）将要举行一场拍卖会，
 * 其中有一件宝物引起了他极大的兴趣，那就是无字天书。
 *
 * 但是，他的行程安排得很满，他已经买好了去邯郸的长途马车票，
 * 不巧的是出发时间是在拍卖会快要结束的时候。于是，他决定事先做好准备，
 * 将自己的金币数好并用一个个的小钱袋装好，以便在他现有金币的支付能力下，
 * 任何数目的金币他都能用这些封闭好的小钱的组合来付账。
 *
 * 鬼谷子也是一个非常节俭的人，他想方设法使自己在满足上述要求的前提下，
 * 所用的钱袋数最少，并且不有两个钱袋装有相同的大于 11 的金币数。
 * 假设他有 mm 个金币，你能猜到他会用多少个钱袋，并且每个钱袋装多少个金币吗？
 *
 * 输入描述
 * 包含一个整数，表示鬼谷子现有的总的金币数目 mm 。
 * 其中，1 \leq m \leq 10^91≤m≤10
 * 9
 *  。
 *
 * 输出描述
 * 输出两行，第一行一个整数 hh，表示所用钱袋个数
 *
 * 第二行表示每个钱袋所装的金币个数，由小到大输出，空格隔开
 *
 * 输入输出样例
 * 示例 1
 * 输入
 *
 * 3
 * copy
 * 输出
 *
 * 2
 * 1 2
 */

public class GuiGuZiDeQianDai {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
//        int m = sca.nextInt();
//        int sum = 0;
//        while(m != 0){
//            m /= 2;
//            sum++;
//        }
//        System.out.println(sum);
//
//        for(int i=1;i<=sum;i++){
//            System.out.print((long)Math.pow(2,i-1) + " ");
//        }

        int m;
        int s=1;
        m = sca.nextInt();
        for(int i=1;;i++)
        {
            s*=2;
            if(s>m){
                System.out.println(i);
                break;
            }
        }
    }
}
