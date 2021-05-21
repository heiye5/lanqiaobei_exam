package niuke;

import java.util.Scanner;

/**
 * 两数之和
 * 题目描述
 * 给出一个整数数组，请在数组中找出两个加起来等于目标值的数，
 * 你给出的函数twoSum 需要返回这两个数字的下标（index1，index2），需要满足 index1 小于index2.。注意：下标是从1开始的
 * 假设给出的数组中只存在唯一解
 * 例如：
 * 给出的数组为 {20, 70, 110, 150},目标值为90
 * 输出 index1=1, index2=2
 *
 *
 * 示例1
 * 输入
 * 复制
 * [3,2,4],6
 * 返回值
 * 复制
 * [2,3]
 * 说明
 * 因为 2+4=6 ，而 2的下标为2 ， 4的下标为3 ，又因为 下标2 < 下标3 ，所以输出[2,3]
 */

public class NC61_NumberSum {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int numbers[] = new int[3];

        for(int i=0;i<3;i++){
            numbers[i] = sca.nextInt();
        }
        int target = sca.nextInt();

        int re[] = twoSum(numbers,target);

        System.out.println(re[0] + "" + re[1]);

        sca.close();
    }

    public static int[] twoSum(int[] numbers, int target) {
        int re[] = new int[2];

        for(int i=0;i<numbers.length;i++){
            for(int j=i+1;j<numbers.length;j++){
                if(target == numbers[i] + numbers[j]){
                    re[0] = i + 1;
                    re[1] = j + 1;
                }
            }
        }

        return re;
    }
}
