package pta;

import java.util.Scanner;

/**
 * 打印沙漏
 * 本题要求你写个程序把给定的符号打印成沙漏的形状。例如给定17个“*”，要求按下列格式打印
 *
 * *****
 *  ***
 *   *
 *  ***
 * *****
 * 所谓“沙漏形状”，是指每行输出奇数个符号；各行符号中心对齐；相邻两行符号数差2；符号数先从大到小顺序递减到1，再从小到大顺序递增；首尾符号数相等。
 *
 * 给定任意N个符号，不一定能正好组成一个沙漏。要求打印出的沙漏能用掉尽可能多的符号。
 *
 * 输入格式:
 * 输入在一行给出1个正整数N（≤1000）和一个符号，中间以空格分隔。
 *
 * 输出格式:
 * 首先打印出由给定符号组成的最大的沙漏形状，最后在一行中输出剩下没用掉的符号数。
 *
 * 输入样例:
 * 19 *
 * 输出样例:
 * *****
 *  ***
 *   *
 *  ***
 * *****
 * 2
 */

public class PrintShaLou {
    public static void main(String[] args) {
//        Scanner sca = new Scanner(System.in);
//        int n = sca.nextInt();
//        String s = sca.next();
//        int len = 0;
//        int num[] = new int[25];
//        int flag = 0;
//        num[0] = 1;
//
//        //可完整显示形状的等差数列
//        for(int i=1;i<25;i++){
//            num[i] = 1+6*(i-1)+2*(i-2)*(i-1);
//            if(n < num[i]){
//                flag = num[i-1];            //与输入的结果相近直接退出
//                break;
//            }
//        }
//
//        //二维数组长度
//        for(int i=0;i<=flag;i++){
//            if(i * i >= flag){
//                len = i;
//                break;
//            }
//        }
//
//        String arr[][] = new String[len][len];
//        //初始化
//        for(int i=0;i<len;i++){
//            for(int j=0;j<len;j++){
//                arr[i][j] = " ";
//            }
//        }
//
//        for(int i=0;i<len;i++){
//            for(int j=0;j<len;j++){
//                if(i == 0 || i == len-1 || i == j || i + j == len-1 || (j >= i && j < len-1-i) || (j <= i && j > len-1-i)){
//                    arr[i][j] = s;
//                }
//            }
//        }
//
//
//        for(int i=0;i<len;i++){
//            for(int j=0;j<len;j++){
//                System.out.print(arr[i][j]);
//            }
//            System.out.println();
//        }
//        if(n > flag){
//            System.out.println(n-flag);
//        }else{
//            System.out.println(flag-n);
//        }



        Scanner sca = new Scanner(System.in);
        String data[] = sca.nextLine().split(" ");
        int n = Integer.parseInt(data[0]);                  //将数组第一个转成int
        char ch = data[1].charAt(0);

        int layerNumber = 1;                                //沙漏层数，初始1层
        int outLayers = 6;                                  //漏斗最外层要添加的符号数量
        int left = n - 1;                                   //剩余符号数量
        while(left >= outLayers){                           //剩余符号数量足够使漏斗加2层
            layerNumber += 2;                               //层数加2
            left -= outLayers;                              //剩余符号数量减掉消耗的符号数量
            outLayers += 4;                                 //下次要添加的数量加2*2
        }

        int spaceNumber = 0;                                //空格数量
        int oneLayer = (outLayers - 4) / 2;                 //初始化1层的数量
        for(int i=0;i<=layerNumber/2;i++){                  //漏斗上半数量
            for(int j=spaceNumber;j>0;j--){
                System.out.print(" ");
            }
            for(int j=oneLayer;j>0;j--){
                System.out.print(ch);
            }
            System.out.println();

            spaceNumber++;
            oneLayer -= 2;
        }

        spaceNumber -= 2;                                   //下半部分初始化空格数量
        oneLayer += 4;                                      //下半部分初始化符号数量
        for(int i=layerNumber/2+1;i<layerNumber;i++){       //漏斗下半部分                              //漏斗下半部分
            for(int j=spaceNumber;j>0;j--){
                System.out.print(" ");
            }
            for(int j=oneLayer;j>0;j--){
                System.out.print(ch);
            }
            System.out.println();

            spaceNumber--;
            oneLayer += 2;
        }

        System.out.println(left);


        sca.close();
    }
}
