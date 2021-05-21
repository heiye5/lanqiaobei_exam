package niuke;

/**
 * 标题：螺旋矩阵
 * 题目描述
 * 给定一个m x n大小的矩阵（m行，n列），按螺旋的顺序返回矩阵中的所有元素。
 * 示例1
 * 输入
 * 复制
 * [[1,2,3],[4,5,6],[7,8,9]]
 * 返回值
 * 复制
 * [1,2,3,6,9,8,7,4,5]
 */

import java.util.ArrayList;
import java.util.Scanner;

public class LuoXuanJuZhen {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int a[][] = new int[3][3];
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                a[i][j] = sca.nextInt();
            }
        }
        list = spiralOrder(a);

        for(int i : list){
            System.out.println(i);
        }
    }

    public static ArrayList<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        if(matrix.length == 0){
            return list;
        }
        int left = 0;
        int right = matrix[0].length - 1;
        int top = 0;
        int bottom = matrix.length - 1;


        while(true){
            //向右
            for(int i=left;i<=right;i++){
                list.add(matrix[top][i]);
            }
            top++;
            if(left > right || top > bottom){
                break;
            }

            //向下
            for(int i=top;i<=bottom;i++){
                list.add(matrix[i][right]);
            }
            right--;
            if(left > right || top > bottom){
                break;
            }

            //向左
            for(int i=right;i>=left;i--){
                list.add(matrix[bottom][i]);
            }
            bottom--;
            if(left > right || top > bottom){
                break;
            }

            //向上
            for(int i=bottom;i>=top;i--){
                list.add(matrix[i][left]);
            }
            left++;
            if(left > right || top > bottom){
                break;
            }
        }
        return list;
    }

//    public static ArrayList<Integer> spiralOrder2(int[][] matrix) {
//        ArrayList<Integer> res = new ArrayList<Integer>();
//        if(matrix.length == 0 ) return  res;
//
//        int top = 0;
//        int bottom = matrix.length - 1;
//        int left = 0;
//        int right = matrix[0].length - 1;
//
//        while(true) {
//            //top
//            for(int i = left; i <= right; i++) res.add(matrix[top][i]);
//            top++;
//            if(left > right || top > bottom) break;
//
//            for(int i = top; i <= bottom; i++) res.add(matrix[i][right]);
//            right--;
//            if(left > right || top > bottom) break;
//
//            for(int i = right; i >= left; i--) res.add(matrix[bottom][i]);
//            bottom--;
//            if(left > right || top > bottom) break;
//
//            for(int i = bottom; i >= top; i--) res.add(matrix[i][left]);
//            left++;
//            if(left > right || top > bottom) break;
//        }
//
//        return res;
//    }
}
