package niuke;

import java.util.Scanner;

/**
 * 热心的牛牛
 * 题目描述
 * 这一天你跟你的n个朋友一起出去玩，在出门前妈妈给了你k块糖果，你决定把这些糖果的一部分分享给你的朋友们。由于你非常热心，所以你希望你的每一个朋友分到的糖果数量都比你要多（严格意义的多，不能相等）。求你最多能吃到多少糖果？
 *
 * 示例1
 * 输入
 * 2,10
 * 返回值
 * 2
 * 说明
 * 你可以分给你的两个朋友各4个糖果，这样你能吃到2个糖果，这样能保证你的每个朋友的糖果数都比你多，不存在你能吃到3个或者以上糖果的情况
 *
 *
 * 示例2
 * 输入
 * 3,11
 * 返回值
 * 2
 * 说明
 * 你可以分给你的3个朋友各3个糖果，这样你能吃到2个糖果，这样能保证你的每个朋友的糖果数都比你多，不存在你能吃到3个或者以上糖果的情况
 *
 *
 * 备注:
 * 对于百分之30的数据：1\leq n\leq 100,n\leq k\leq 1001≤n≤100,n≤k≤100
 *
 * 对于百分之100的数据：1\leq n\leq 1e18,n\leq k\leq 1e181≤n≤1e18,n≤k≤1e18
 *
 * 函数有两个long long型参数
 *
 * 第一个参数代表题目中的n
 *
 * 第二个参数代表题目中的k
 */

public class NC661_ReXinDeNiu {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        long n = sca.nextLong();
        long m = sca.nextLong();
        long re =  Maximumcandies(n,m);
        System.out.println(re);
    }

    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     * 返回牛牛能吃到的最多糖果数
     * @param n long长整型     人数
     * @param k long长整型     糖果数
     * @return long长整型
     */
    public static long Maximumcandies (long n, long k) {
        long re = 0;
        long were = 0;
        long count = 0;
        for(int i=0;i<n;i++){
            if(k < n){
                break;
            }
            k--;
        }


        return re;
    }
}
