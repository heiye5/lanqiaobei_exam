package practice.test;

import java.util.Scanner;

/**
 * 试题 历届试题 打印十字图
 *
 * 问题描述
 * 小明为某机构设计了一个十字型的徽标（并非红十字会啊），如下所示：
 *
 * ..$..
 * ..$...........$..
 * $
 * $...$.......$...$
 * $.$.$
 * $.$...$...$...$.$
 * $.$.$.$.$
 * $.$.$...$...$.$.$
 * $.$.$.$.$.$.$
 * $.$.$...$...$.$.$
 * $.$.$.$.$
 * $.$...$...$...$.$
 * $.$.$
 * $...$.......$...$
 * $
 * ..$...........$..
 * ..$..
 * 对方同时也需要在电脑dos窗口中以字符的形式输出该标志，并能任意控制层数。
 *
 * 输入格式
 * 一个正整数 n (n<30) 表示要求打印图形的层数。
 * 输出格式
 * 对应包围层数的该标志。
 * 样例输入1
 * 1
 * 样例输出1
 * ..$..
 * ..$...$..
 * $
 * $...$...$
 * $.$.$
 * $...$...$
 * $
 * ..$...$..
 * ..$..
 * 样例输入2
 * 3
 * 样例输出2
 * ..$..
 * ..$...........$..
 * $
 * $...$.......$...$
 * $.$.$
 * $.$...$...$...$.$
 * $.$.$.$.$
 * $.$.$...$...$.$.$
 * $.$.$.$.$.$.$
 * $.$.$...$...$.$.$
 * $.$.$.$.$
 * $.$...$...$...$.$
 * $.$.$
 * $...$.......$...$
 * $
 * ..$...........$..
 * ..$..
 * 提示
 * 请仔细观察样例，尤其要注意句点的数量和输出位置。
 */

public class PREV_2_PrintShi {
    public static void main(String[] args) {
        PREV_2_PrintShi prev_2_printShi = new PREV_2_PrintShi();
        Scanner sca = new Scanner(System.in);
        int n = sca.nextInt();
        prev_2_printShi.getResult(n);
    }

    //打印十字图
    private void getResult(int n) {
        int len = 5 + 4 * n;
        int mid = len / 2;
        char result[][] = new char[len][len];

        for(int i=0;i<len;i++){
            for(int j=0;j<len;j++){
                result[i][j] = '.';
            }
        }

        //中间十字
        for(int i=mid-2;i<=mid+2;i++){
            result[mid][i] = '$';
            result[i][mid] = '$';
        }

//        for(int i=1;i<=n;i++) {
//            for(int j=mid-2*i;j<=mid+2*i;j++){
//                result[mid-2*(i+1)][j] = '$';
//                result[mid+2*(i+1)][j] = '$';
//                result[j][mid-2*(i+1)] = '$';
//                result[j][mid+2*(i+1)] = '$';
//            }
//
//            //左上角
//            result[mid-2*i][mid-2*i] = '$';
//            result[mid-2*i][mid-2*i-1] = '$';
//            result[mid-2*i-1][mid-2*i] = '$';
//
//            //右上角
//            result[mid-2*i][mid+2*i] = '$';
//            result[mid-2*i-1][mid+2*i] = '$';
//            result[mid-2*i][mid+2*i+1] = '$';
//
//            //左下角
//            result[mid+2*i][mid-2*i] = '$';
//            result[mid+2*i][mid-2*i-1] = '$';
//            result[mid+2*i+1][mid-2*i] = '$';
//
//            //右下角
//            result[mid+2*i][mid+2*i] = '$';
//            result[mid+2*i][mid+2*i+1] = '$';
//            result[mid+2*i+1][mid+2*i] = '$';

//        }


        //遍历输出十字图
//        for(int i=0;i<len;i++){
//            for(int j=0;j<len;j++){
//                System.out.print(result[i][j]);
//            }
//            System.out.println();
//        }
    }
}
