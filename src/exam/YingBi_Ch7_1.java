package exam;

import java.util.Scanner;

/**
 * 有足够数量的5分、2分和1分的硬币，
 * 现在要用这些硬币来支付一笔小于1元的零钱money，
 * 问至少要用多少个硬币？
 *
 * 输入格式:
 * 输入在一行中给出零钱数额money ∈ [1, 100)。
 *
 * 输出格式:
 * 输出在一行中给出每种硬币的数量和总数量，
 * 格式为：
 * fen5:5分硬币数量, fen2:2分硬币数量, fen1:1分硬币数量, total:硬币总数量
 * 请注意：逗号后有一个空格，冒号后没有空格。
 *
 * 输入样例:
 * 在这里给出一组输入。例如：
 *
 * 12
 * 输出样例:
 * 在这里给出相应的输出。例如：
 *
 * fen5:2, fen2:1, fen1:0, total:3
 */

public class YingBi_Ch7_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int money = scan.nextInt();             //零钱
        int fen1 = 1;
        int fen2 = 2;
        int fen5 = 5;
        int total = 0;

        System.out.println(money);

        for(int i=0;i<=money/fen1;i++){
            for(int j=0;j<(money-i*fen1)/fen2;j++){
                for(int k=0;k<=(money-((i*fen1)+(j*fen2)))/fen2;k++){
                    if(money == i*fen1 + j*fen2 + k*fen5){
                        total = i + j + k;
                        System.out.printf("fen5:%d, fen2:%d, fen1:%d, total:%d\n",k,j,i,total);
                        return;
                    }
                }
            }
        }

    }
}
