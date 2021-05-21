package ch_2014_b;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * 标题：矩阵翻硬币
 * 问题描述
 * 　　小明先把硬币摆成了一个 n 行 m 列的矩阵。
 *
 * 随后，小明对每一个硬币分别进行一次 Q 操作。
 *
 * 对第x行第y列的硬币进行 Q 操作的定义：将所有第 ix 行，第 jy 列的硬币进行翻转。
 *
 * 其中i和j为任意使操作可行的正整数，行号和列号都是从1开始。
 *
 * 当小明对所有硬币都进行了一次 Q 操作后，他发现了一个奇迹——所有硬币均为正面朝上。
 *
 * 小明想知道最开始有多少枚硬币是反面朝上的。于是，他向他的好朋友小M寻求帮助。
 *
 * 聪明的小M告诉小明，只需要对所有硬币再进行一次Q操作，即可恢复到最开始的状态。然而小明很懒，不愿意照做。于是小明希望你给出他更好的方法。帮他计算出答案。
 * 输入格式
 * 　　输入数据包含一行，两个正整数 n m，含义见题目描述。
 * 输出格式
 * 　　输出一个正整数，表示最开始有多少枚硬币是反面朝上的。
 * 样例输入
 * 2 3
 * 样例输出
 * 1
 *
 */

public class JuZhenFnaYingBi {
    public static void main(String[] args) {
         Scanner sca = new Scanner(System.in);
         String s1 = sca.next();
         String s2 = sca.next();
        System.out.println(sqrt(s1).multiply(sqrt(s2)));
    }

    private static BigInteger sqrt(String s2) {
        int length = s2.length();
        int len = 0;
        if(length%2 == 0){
            len = length / 2;
        }else{
            len = length / 2 + 1;
        }

        char[] sArr = new char[len];
        Arrays.fill(sArr,'0');          //数组填充
        BigInteger target = new BigInteger(s2);
        for(int pos=0;pos<len;pos++){
            for(char c='1';c<='9';c++){
                sArr[pos] = c;
                BigInteger pow = new BigInteger(String .valueOf(sArr)).pow(2);
                if(pow.compareTo(target) == 1){
                    sArr[pos] -= 1;
                    break;
                }
            }
        }
        return new BigInteger(String.valueOf(sArr));
    }
}
