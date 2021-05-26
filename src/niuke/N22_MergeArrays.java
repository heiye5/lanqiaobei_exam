package niuke;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 合并两个有序的数组
 *  描述
 * 给出两个有序的整数数组 和 ，请将数组 合并到数组 中，变成一个有序的数组
 * 注意：
 * 可以假设 数组有足够的空间存放 数组的元素， 和 中初始的元素数目分别为 和
 */

public class N22_MergeArrays {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int A[] = new int[15];
        for(int i=0;i<5;i++) {
            A[i] = sca.nextInt();
        }
        int B[] = new int[5];
        for(int i=0;i<B.length;i++) {
            B[i] = sca.nextInt();
        }

        merge(A,5,B,5);

        sca.close();
    }

    public static void merge(int A[], int m, int B[], int n) {
        int indexA = m - 1;
        int indexB = n - 1;
        int index = m + n -1;
        while(indexA >= 0 && indexB >= 0){
            if(A[indexA] > B[indexB]){
                A[index--] = A[indexA--];
            }else{
                A[index--] = B[indexB--];
            }
        }

        while(indexB >= 0){
            A[index--] = B[indexB--];
        }

    }
}
