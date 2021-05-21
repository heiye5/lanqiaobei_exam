package exam;

import java.util.Arrays;
import java.util.Scanner;


/**
 * 标题：愤怒的牛
 * 题目描述
 *
 * 农夫约翰建造了一座有n间牛舍的小屋，牛舍排在一条直线上，第i间牛舍在xi的位置，
 * 但是约翰的m头牛对小屋很不满意，因此经常互相攻击。
 *
 * 约翰为了防止牛之间互相伤害，
 * 因此决定把每头牛都放在离其它牛尽可能远的牛舍。也就是要最大化最近的两头牛之间的距离。
 * 牛们并不喜欢这种布局，而且几头牛放在一个隔间里，它们就要发生争斗。为了不让牛互相伤害。
 * John决定自己给牛分配隔间，使任意两头牛之间的最小距离尽可能的大，
 * 那么，这个最大的最小距离是多少呢？
 *
 *  
 *
 * 输入
 *
 * 第一行用空格分隔的两个整数n和m；
 * 第二行为n个用空格隔开的整数，表示位置xi。
 *
 * 输出
 *
 * 输出仅一个整数，表示最大的最小距离值。
 *
 *样例输入
 *
 * 5 3
 * 1 2 8 4 9
 *
 *
 * 样例输出
 *
 * 3
 */

public class FenNuDeNiu_Ch7_3 {
    static int n;
    static int m;
    static int a[];
    static int count;

    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        n = sca.nextInt();
        m = sca.nextInt();
        a = new int[n];

        for(int i=0;i<n;i++){
            a[i] = sca.nextInt();
        }
        Arrays.sort(a);         //排序

        int l = 0;
        int r = a[n-1] - a[0];  //最大距离
        while(l <= r){
            int mid = (l+r) / 2;
            if(check(mid)){ ////先判断mid是否合法，若合法就去找有没有比mid更大的答案，不合法就寻找比mid小的合法答案。
                l = mid + 1;
                count = mid;
            }else{
                r = mid - 1;
            }
        }
        System.out.println(count);

    }

    private static boolean check(int mid) {
        int num = 1;
        int lastNum = 0;
        for(int i=1;i<n;i++){
            if(a[i] - a[lastNum] >= mid){
                lastNum = i;
                num++;
            }
            if(num >= m){
                return true;
            }
        }
        return false;
    }
}
