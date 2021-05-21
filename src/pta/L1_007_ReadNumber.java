package pta;

import java.util.Scanner;

/**
 * 输入一个整数，输出每个数字对应的拼音。当整数为负数时，先输出fu字。十个数字对应的拼音如下：
 *
 * 0: ling
 * 1: yi
 * 2: er
 * 3: san
 * 4: si
 * 5: wu
 * 6: liu
 * 7: qi
 * 8: ba
 * 9: jiu
 * 输入格式：
 * 输入在一行中给出一个整数，如：1234。
 *
 * 提示：整数包括负数、零和正数。
 *
 * 输出格式：
 * 在一行中输出这个整数对应的拼音，每个数字的拼音之间用空格分开，行末没有最后的空格。如 yi er san si。
 *
 * 输入样例：
 * -600
 * 输出样例：
 * fu liu ling ling
 */

public class L1_007_ReadNumber {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int n = sca.nextInt();
        String Number[] = new String[]{"ling","yi","er","san","si","wu","liu","qi","ba","jiu"};
        if(n == 0){
            System.out.println(Number[0]);
            return;
        }
        if(n < 0){
            System.out.print("fu ");
            n = -n;
        }

        int len = countNum(n);
//        System.out.println(len);
        int numLen[] = new int[len];
        int i = 0;

        while(n != 0){
            int t = n % 10;
//            System.out.println(t);
            numLen[i++] = t;
            n /= 10;
        }

        int flag = len;
        for(i=len-1;i>=0;i--){
//            System.out.println(numLen[i]);
            if(flag > 1){
                System.out.print(Number[numLen[i]]  + " ");
            }else{
                System.out.print(Number[numLen[i]]);
            }
            flag--;
        }

    }

    //统计位数
    private static int countNum(int n) {
        int re = 0;
        while(n != 0){
            re++;
            n /= 10;
        }
        return re;
    }
}
