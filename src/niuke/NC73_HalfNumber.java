package niuke;

import java.util.Scanner;

/**
 * 数组中出现次数超过一半的数字
 * 题目描述
 * 数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。例如输入一个长度为9的数组[1,2,3,2,2,2,5,4,2]。由于数字2在数组中出现了5次，超过数组长度的一半，因此输出2。你可以假设数组是非空的，并且给定的数组总是存在多数元素。1<=数组长度<=50000
 * 示例1
 * 输入
 * 复制
 * [1,2,3,2,2,2,5,4,2]
 * 返回值
 * 复制
 * 2
 * 示例2
 * 输入
 * 复制
 * [3,3,3,3,2,2,2]
 * 返回值
 * 复制
 * 3
 * 示例3
 * 输入
 * 复制
 * [1]
 * 返回值
 * 复制
 * 1
 */

public class NC73_HalfNumber {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int a[] = new int[]{3,3,3,3,2,2,2};

        int re = Test(a);
//        System.out.println(re);

        sca.close();
    }

    public static int MoreThanHalfNum_Solution(int[] array) {
        int tmp = 0;
        int t = 0;
        int i = 1;
        int count = 0;
        int countNew = 0;

        if(array.length == 1){
            return array[0];
        }

        while(true){
            if(tmp == array.length){
                break;
            }
            for(i=1;i<array.length;i++){
//                System.out.println(array[tmp] + " " + array[i]);
                if(array[tmp] == array[i]){
                    count++;
                }else{
                    continue;
                }
            }
            if(count > countNew){
                countNew = count;
                t = array[tmp];
            }
            count = 0;
            tmp++;
        }

        return t;
    }

    public static int Test(int[] array){
        int count = 0;
        int max = 0;
        int t = array[0];

        for(int i=0;i< array.length;i++){
            for(int j=i;j<array.length;j++){
//                System.out.println(array[i] + " " + array[j]);
                if(array[i] == array[j]){
                    count++;
                }
            }
            if(max < count){
                max = count;
                t = array[i];
            }
            count = 0;
        }
        return t;
    }

}
